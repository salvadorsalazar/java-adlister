<%--
  Created by IntelliJ IDEA.
  User: salvadorsalazar
  Date: 10/18/21
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>

<form action="/pizza-order" method="POST">
    <label>
        Select your crust
        <select name="crust">
            <option value="thin">Thin crust</option>
            <option value="normal">Normal</option>
            <option value="deepDish">Deep Dish</option>
        </select>
    </label>
    <label>
        Select your sauce
        <select name="sauce">
            <option value="bbq">bbq</option>
            <option value="ranch">ranch</option>
            <option value="red">red</option>
        </select>
    </label>
    <label>
        Select your size
        <select name="size">
            <option value="10">10</option>
            <option value="12">12</option>
            <option value="14">14</option>

        </select>
    </label>
   <br>   <br>


    <label>Select Toppings :
        Pepperoni
        <input type="checkbox" name="toppings" value="pepperoni">
    </label>

    <label>
        Sausage
        <input type="checkbox" name="toppings" value="sausage">
    </label>

    <label>
        Green Peppers
        <input type="checkbox" name="toppings" value="green peppers">
    </label>
<br>   <br>

    <label>
        Delivery Address
        <input name="address">
    </label>

    <button type="submit">Submit</button>
</form>

</body>
</html>