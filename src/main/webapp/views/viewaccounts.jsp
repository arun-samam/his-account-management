<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link
	href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">

<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#contactTbl").DataTable({
			"pagingType" : "full_numbers"
		});
	});
</script>
<title>viewaccounts.jsp</title>
</head>
<body>

	<div class="container">
		<form action="viewaccounts" method="post">
			Select role: <select name="viewrole">
				<option value="">--select_role--</option>
				<option value="caseworker">caseworker
					</optin>
				<option value="admin">admin</option>
			</select> <input type="submit" value="Go"></input>
		</form>
	</div>

	<div class="container">
		<h2>${tablename}</h2>
	</div>

	<div class="container">
		<table class="table table-bordered" id="contactTbl">
			<thead>
				<tr>
					<th>s.no.</th>
					<th>firstName</th>
					<th>lastName</th>
					<th>email</th>
					<th>action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${modellist}" var="item" varStatus="index"
					begin="1">
					<tr>
						<td><c:out value="${index.count}"></c:out>
						<td><c:out value="${item.firstName}"></c:out></td>
						<td><c:out value="${item.lastName}"></c:out></td>
						<td><c:out value="${item.email}"></c:out></td>
						<td>
							<a href="#">edit</a>||
								<c:if test="${item.isActive}">
									<a href="#">delete</a>
								</c:if>
							
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>



</body>
</html>