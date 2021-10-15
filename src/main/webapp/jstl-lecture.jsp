<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- This is required to use JSTL tags in a JSP --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    // this code will normally be written in a servlet or called within a servlet instead of in a JSP

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(1, "Hammer", "A great tool", 3000),
        new Product(2, "Rake", "A useful tool", 2300),
        new Product(3, "Screwdriver", "Another useful tool", 1000),
        new Product(4, "Drill", "A power tool", 9500)
    ));

    request.setAttribute("products", products);
    request.setAttribute("myName", "Justin");

%>
<html>
<head>
    <title>EL and JSTL Lecture</title>
    <style>
        .product {
            border: 2px solid black;
            border-radius: 3px;
            margin: 1em 0;
            padding: 1em;
        }
    </style>
</head>
<body>


    <%-- ============================= EL (Expression Language) --%>

    <h1>My name is: ${myName}</h1>
    <h1>My name from the query string is: ${param.name}</h1>



    <%-- ============================= JSTL (JSP Standard Tag Library) Tags --%>

    <h1>Products</h1>
    <c:forEach var="product" items="${products}">
        <div class="product">
            <h3>${product.name}</h3>
            <p>${product.description}</p>
            <c:if test="${product.priceInCents > 2000}">
                <p>This is an expensive product</p>
            </c:if>
        </div>
    </c:forEach>
</body>
</html>
