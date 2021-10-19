<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>

        <h3>Here are your ads</h3>

        <c:forEach var="ad" items="${ads}">
            <div>
                <h1>${ad.title}</h1>
                <p>${ad.description}</p>
            </div>
        </c:forEach>

    </div>

</body>
</html>
