<%-- 
    Document   : MyExam
    Created on : Jan 15, 2024, 4:56:46 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <form action="count" method="post">
            Enter an integer n : <input type="text" name="number"> <br>     
            Result : <input type="text" name="result"> <br> 
            <input type="submit" name="gui" value="COUNT">
        </form>
        <% 
            String error = (String)request.getAttribute("errorMessage");
            String number = request.getParameter("number");

            if (error != null || !error.trim().isEmpty()) {
        %>
            <p style="color: red;"> <%= error %></p>
        <% 
            }
        %>
    
    </body>
</html>
