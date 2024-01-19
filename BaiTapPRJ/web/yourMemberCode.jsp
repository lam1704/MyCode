<%-- 
    Document   : yourMemberCode
    Created on : Jan 16, 2024, 9:44:41 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Login form</h2>
        <form action="yourMemberCodeFirstPage" method="post">
            <label>Username: <input type="text" name="user"/></label> <br/>
            <label>Age: <input type="number" name="age"/></label> <br/>
            <label>Validation code: <input type="password" name="validation"/></label> <br/>
            <input type="submit" value="Log in"/>
            <input type="reset"/>
        </form>
    </body>
</html>
