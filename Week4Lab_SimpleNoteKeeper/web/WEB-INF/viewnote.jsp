<%-- 
    Document   : viewnote
    Created on : 5-Feb-2023, 7:49:29 PM
    Author     : reda_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <div>
            <p>
                <b>Title: </b>${note.title}
            </p>
        </div>
            <div>
                <p>
                    <b>Contents: </b><br>${note.contents}
                </p>
            </div>
                <div>
                    <a href="note?edit">Edit</a>
                </div>
    </body>
</html>
