package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import models.Note;

/**
 *
 * @author reda_
 */
public class NoteServlet extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        String title = br.readLine();

        String contents = br.readLine();

        Note note = new Note();

        note.setTitle(title);

        note.setContents(contents);

        request.setAttribute("note", note);

        if (request.getParameter("edit") != null) {

            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

        } 
        else {

            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

        }

    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");

        String contents = request.getParameter("contents");

        Note note = new Note(title, contents);

        request.setAttribute("note", note);

        if (title == null || title.equals("") || contents == null || contents.equals("")) {

            boolean error = true;

            request.setAttribute("error", error);

            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

            return;

        }

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        pw.println(title);

        pw.println(contents);

        pw.close();

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

    }
}
