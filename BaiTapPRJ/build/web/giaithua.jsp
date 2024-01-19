<%-- 
    Document   : giaithua
    Created on : Jan 17, 2024, 1:01:39 PM
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
        <h1>Q1</h1>
        <form action="giaithua" method="post">
            <%
            if(request.getAttribute("number")!=null){
            %>
            Number : <input type="text" name="number" value="<%=request.getAttribute("number")%>"> <br>
            <%} else {%>
            Number : <input type="text" name="number"><br>
            <%}%>
            <br>
            <br>
            <input type="submit" name="gui" value="Calculate">
        </form>

        <%
    Integer number = (Integer) request.getAttribute("number");
    if (number != null) {
        int situation = (int) request.getAttribute("situation");
        double factor = (double) request.getAttribute("factor");  // Corrected attribute name
        if (situation == 1) {
        %>
        <h1><%= number %>! = <%= factor %></h1>
        <%
                } else {
        %>
        <h1>Invalid syntax</h1>
        <%
                }
            }
        %>

    </body>
</html>

