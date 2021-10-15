<%--
        ============================= JSP Tags
        JSP Tags:
        <%@ directiveName ... %> Directive: set values for the entire file
        <%! %>  Define instance variables
        <%= %>  evaluate an expression and print the result
        <% %> evaluate arbitrary java code
        <%--  comments
--%>

<%-- This is a JSP comment --%>
<!-- This is an HTML comment -->

<%-- This is a JSP directive --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- JSP directives can be used to import Java classes --%>
<%@ page import="java.util.Random" %>

<html>
<head>
    <title>JSP Lecture</title>
</head>
<body>

<h1>JSP Lecture</h1>

    <h3>
        Number from scriptlet output...
        <%--
        We can also add scriptlet tags to inject Java logic anywhere in the JSP.
        NOTE: after this lesson, we will NOT inject logic in a JSP like this!
        --%>
        <%
            int number = 27;
            number++;
            out.println(number);
        %>
    </h3>

    <h3>
        Number from expression tag...
        <%-- We can directly output values using the expression tag --%>
        <%= number %>
    </h3>

    <h3>
        Instance count...
        <%-- This is a way to define instance variables on what will become this JSP's servlet object --%>
        <%! int instanceCount = 1;%>
        <%= instanceCount += 1 %>
    </h3>


<%-- ============================= INCLUDING HTML/JSP FILES  --%>

<%--    &lt;%&ndash; JSP directives can also include HTML fragments into other HTML fragments &ndash;%&gt;--%>
<%--    <%@ include file="partials/scripts.html"%>--%>

<%--    &lt;%&ndash; Can also include other JSPs &ndash;%&gt;--%>
<%--    <%@ include file="partials/footer.jsp"%>--%>

<%--    &lt;%&ndash; With a JSP action syntax, can pass parameters to included files &ndash;%&gt;--%>
<%--    <jsp:include page="partials/param-example.jsp">--%>
<%--        <jsp:param name="message" value="Hello Parameter Value"/>--%>
<%--    </jsp:include>--%>

<%-- ============================= IMPLICIT OBJECTS --%>

<%-- request and response and out are the most common implicit objects in a JSP --%>

    <%
//        Random r = new Random();
//        int randNum = r.nextInt((7 - 1) + 1) + 1;
//        if (randNum == 1) {
//            response.sendRedirect("/hello");
//        } else if (randNum == 7) {
//            response.sendError(500);
//        }
        String textColor = (request.getParameter("color") != null) ? request.getParameter("color") : "";
    %>

<%--    <h1><%= randNum %></h1>--%>
    <h3 style="color:<%= textColor %>">Some color</h3>
    <p>Query String: <%= request.getQueryString() %></p>
<%--    <p>Path: <%= request.getRequestURL() %></p>--%>
<%--    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>--%>

</body>
</html>
