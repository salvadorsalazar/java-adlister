<%@ page import="entity.Person" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: salvadorsalazar
  Date: 10/14/21
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    //would normally go in a servlet
    List<Person> people = new ArrayList<>(Arrays.asList(

            new Person(1,"salvado9999r","salazar",30),
            new Person(2,"bilbo","baggins",330),
            new Person(3,"frodo","baggins",130)

    ));

    //pass the array people to our view???

    request.setAttribute("people",people);

    %>



<html>
<head>
    <title>Person lList</title>
</head>
<body>
<%--display people in a table using JSTL--%>


<table>

    <tr>
        <th>ID</th>
        <th>first name</th>
        <th>last name</th>
        <th>age</th>
    </tr>
    <c:forEach var="person" items="${people}">
<%--        <p>${person.fistName}</p>--%>


    <tr>
        <td>${person.id}</td>
        <td>${person.firstName}</td>
        <td>${person.lastName}</td>
        <td>${person.age}</td>
    </tr>
    </c:forEach>

<%--    <tr>--%>
<%--        <td>1</td>--%>
<%--        <td>sal</td>--%>
<%--        <td>salazar</td>--%>
<%--        <td>30</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td>1</td>--%>
<%--        <td>sal</td>--%>
<%--        <td>salazar</td>--%>
<%--        <td>30</td>--%>
<%--    </tr>--%>

</table>

<%--<%@ include file="partials/display-extra-person.jsp" %>--%>

</body>
</html>
