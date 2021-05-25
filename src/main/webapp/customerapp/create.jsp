<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/5/2021
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form thêm mới khách hàng</title>
</head>
<body>
<%--<a href="/CustomerServlet?action=create"></a>--%>
<form action="" method="post">
    <fieldset>
        <legend> Create Customer Information</legend>
        <table>
            <tr>
                <th>Name</th>
                <th>Address</th>
                <th>Email</th>
            </tr>
            <tr>
                <td><input type="text" name="name" placeholder="Name"></td>
                <td><input type="text" name="address" placeholder="Address"></td>
                <td><input type="text" name="email" placeholder="Email"></td>
                <td><input type="submit" name="Submit"></td>

            </tr>
        </table>

    </fieldset>
</form>

</body>
</html>
