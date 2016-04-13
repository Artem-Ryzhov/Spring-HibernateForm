<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<title>My JSP 'updateUser.jsp' starting page</title>
	</head>

	<body>
		<form action="/admin/updateEmp" method="POST">
			<input type="hidden" name="id" value="${employee.id }">
			<table>
				<tr>
					<td>
						name: 
					</td>
					<td>
						<input type="text" name="first_name" value="${employee.getFirst_name() }">
					</td>
				</tr>
				<tr>
					<td>
						lastname:
					</td>
					<td>
						<input type="text" name="last_name" value="${employee.getLast_name()}">
					</td>
				</tr>
				<tr>
					<td>
						salary:
					</td>
					<td>
						<input type="text" name="salary" value="${employee.getSalary()}">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Update">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>


