<%-- 
    Document   : editnote
    Created on : 5-Feb-2023, 7:49:54 PM
    Author     : reda_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <div>
            <form action="note" method="post">
                <b>Title: </b> <input type="text" name="title" value="${note.title}"
                                      </div>
                                      <div>
                                          <b>Contents: </b>
                                          <textarea name="contents" rows="15" columns="50">${note.contents}</textarea>
                                          <input type="submit" value="Save">
                                      </div>
            </form>
    </body>
</html>
