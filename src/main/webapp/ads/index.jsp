<%--
  Created by IntelliJ IDEA.
  User: salvadorsalazar
  Date: 10/18/21
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>

<%--    <title>Title</title>--%>

    <style>
        div {
            border: 2px solid black;
        }
    </style>
</head>
<body>

<c:forEach var="ad" items="${ads}">
<div>
    <h1>${ad.title}</h1>
    <p>${ad.description}</p>
</div>
</c:forEach>

</body>
</html>
