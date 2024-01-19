<%-- 
    Document   : MyExamList
    Created on : Jan 17, 2024, 2:29:45 PM
    Author     : DELL
--%>
<%@ page import="java.util.*" %>
<%@ page import="TempPackage.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Q2</h1>
        <form action="addstudent" method="post">
            Code : <input type="text" name="code"> <br>     
            FullName : <input type="text" name="name"> <br>
            <label for="gender">Gender</label>
            <input type="radio" name="gender" value="male">
            <label for="male">Male</label>
            <input type="radio" name="gender" value="female">
            <label for="female">Female</label><br>
            <input type="submit" name="gui" value="ADD">
        </form>
        <%
        List<Student> studentList = (List<Student>) request.getSession().getAttribute("studentList"); 
        if (studentList != null && !studentList.isEmpty()) { %>
        <table border="1">
            <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>Gender</th>
                </tr>

                <% for (int i = studentList.size() - 1; i >= 0; i--) { 
                    Student student = studentList.get(i);
                %>
                    <tr>
                        <td><%= student.getCode() %></td>
                        <td><%= student.getName() %></td>
                        <td><%= student.getGender() %></td>
                    </tr>
                <% } %>
        </table>
        <% } else { %>
        <p>No students found.</p>
        <% } %>
    </body>
</html>
