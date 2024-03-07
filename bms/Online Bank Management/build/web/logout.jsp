<%-- 
    Document   : logout
    Created on : 16-Oct-2023, 11:21:20 PM
    Author     : Ch.Prabhakar--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("Login_page.jsp");
        %>
    </body>
</html>
