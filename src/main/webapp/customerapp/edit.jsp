<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/5/2021
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<html>
<head>
    <title>Form Edit Information</title>
</head>
<body>
<form action="" method="post">
    <fieldset>
        <legend> Form Edit Information</legend>
        <table>
            <tr>
                <th>Name</th>
                <th>Address</th>
                <th>Email</th>
            </tr>
            <tr>
                <td><input value="${customer.name}" name="name"></td>
                <td><input value="${customer.address}" name="address"></td>
                <td><input value="${customer.email}" name="email"></td>
                <td><input type="submit" name="Edit"></td>

            </tr>
        </table>

    </fieldset>
</form>


</body>
</html>
