<%-- 
    Document   : index
    Created on : Jan 15, 2024, 3:56:09 PM
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
        
        <%
            String name = (String)request.getAttribute("name");
            int old =  (int)request.getAttribute("int_by");
            
        %>
        <h1>Fullname: <%=name%> </h1>
        <h1>Age: <%=2024-old%> </h1>
    </body>
</html>
