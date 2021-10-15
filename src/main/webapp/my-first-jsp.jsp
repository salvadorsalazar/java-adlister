<%--
  Created by IntelliJ IDEA.
  User: salvadorsalazar
  Date: 10/14/21
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = "Salvador";
%>

<html>


<head>
    <title>My First JSP</title>




</head>
<body>

<h1> <span class="my-name">My First name is : <%= name %> </span></h1>
            <%--    jsp directive below--%>
    <%@ include file="partials/my-first-fragment.html"%>


<br>
<hr>
The current time is <%= new java.util.Date() %>
</body>
</html>
