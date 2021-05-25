<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/5/2021
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh Sách Khách Hàng</title>
</head>
<body>
<h1>Danh Sách Khách Hàng</h1>
<table border="1" width="50%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
        <th>Email</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach items="${cay}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.address}</td>
            <td>${customer.email}</td>
            <td>Edit</td>
            <td>remove</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
