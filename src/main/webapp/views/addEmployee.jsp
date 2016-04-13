<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<html>
<head>
    <title>My JSP 'addUser.jsp' starting page</title>
</head>

<body>
<form action="${pageContext.servletContext.contextPath}/admin/add" method="POST">
    <table>
        <tr>
            <td>name:</td>
            <td><input type="text" name="first_name"></td>
        </tr>
        <tr>
        <tr>
            <td>lastname:</td>
            <td><input type="text" name="last_name"></td>
        </tr>
        <tr>
            <td>salary:</td>
            <td><input type="text" name="salary"></td>
        </tr>

            <td>
                <input type="submit" value="Save">
            </td>
    </table>
</form>
</body>
</html>