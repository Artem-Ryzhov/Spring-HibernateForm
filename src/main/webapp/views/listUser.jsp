<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User list</title>
</head>
<body>
<h3>UserList</h3>

<table border="1" width="70%">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>LastName</td>
        <td>Salary</td>
        <td>Action</td>

    </tr>
    <c:forEach items="${employee}" var="employee">
        <tr>
            <td>${employee.getId()}</td>
            <td>${employee.getFirst_name()}</td>
            <td>${employee.getLast_name()}</td>
            <td>${employee.getSalary()}</td>
            <td><a href="/admin/deleteEmployee?id=${employee.id }">Delete</a>
                <a href="/admin/updateEmployeeid?id=${employee.id}">Update</a>
            </td>
        </tr>
    </c:forEach>

       <a href="/views/menu.jsp">Menu</a>
</table>

</body>
</html>