<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>viewaccounts.jsp</title>
</head>
<body>
<form action="viewaccounts" method="post" >
	Select role: <select name="viewrole">
					<option value="caseworker">caseworker</optin>
					<option value="admin">admin</option>
				</select>
				<input type="submit" value="Go"></input>
</form>

<table>
	<thead>
		<tr>
			<th>firstName</th>
			<th>lastName</th>
			<th>email</th>
			<th>action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${modellist}" var="item">
			<tr>
				<td><c:out value="${item.firstName}"></c:out></td>
				<td><c:out value="${item.lastName}"></c:out></td>
				<td><c:out value="${item.email}"></c:out></td>
				<td></td>
			</tr>
		</c:forEach>
	</tbody>
</table>



</body>
</html>