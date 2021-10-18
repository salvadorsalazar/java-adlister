<%--
  Created by IntelliJ IDEA.
  User: salvadorsalazar
  Date: 10/15/21
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("profile.jsp");
        }
    }
%>

<html>
<head>
    <%@ include file="partials/navbar.jsp" %>

    <title>login.jsp</title>
</head>
<body>
<h1>Login Page</h1>
<form action="login.jsp" method="post">
    <label for="username">Username</label>
    <input is="username" name="username" type="text">

    <label for="password">Password</label>
    <input id="password" name="password"  type="password">
<input type="submit" value="Login">
</form>



</body>
</html>
