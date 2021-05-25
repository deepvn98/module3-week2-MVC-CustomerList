<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/5/2021
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form delete Customer</title>
</head>
<body>
<form action="" method="post">
    <fieldset>
        <legend> Form delete Customer</legend>
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
                <td><input type="submit" name="Delete"></td>

            </tr>
        </table>

    </fieldset>
</form>

</body>
</html>
