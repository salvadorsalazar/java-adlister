<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AdLister: Contacts</title>
</head>
<body>

<h1>This is ${name}'s contacts page!</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>ADDRESS</th>
        <th>PHONE NUMBER</th>
        <th>IS ACTIVE</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="contact" items="${contacts}">
        <c:if test="${contact.isActive}">
            <tr>
                <td>${contact.id}</td>
                <td>${contact.name}</td>
                <td>${contact.email}</td>
                <td>${contact.address}</td>
                <td>${contact.phoneNumber}</td>
                <td>${contact.isActive}</td>
            </tr>
        </c:if>
    </c:forEach>
    </tbody>
</table>


</body>
</html>