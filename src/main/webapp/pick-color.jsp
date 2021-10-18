<%--
  Created by IntelliJ IDEA.
  User: salvadorsalazar
  Date: 10/18/21
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color JSP</title>
</head>
<body>


<form action="/view-color"  method ="POST" >
  <label>Enter your favorite color:
    <input name="color" id="color" placeholder="Enter your favorite color">
<button type="submit">Submit</button>

  </label>


</form>
</body>
</html>
