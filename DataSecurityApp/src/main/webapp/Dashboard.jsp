<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <%
        HttpSession sesion = request.getSession(false);
        if (sesion == null || sesion.getAttribute("username") == null) {
            response.sendRedirect("login.jsp");
        }
    %>
    <h2>Welcome, <%= sesion.getAttribute("username") %></h2>
    <a href="login.jsp">Logout</a>
</body>
</html>