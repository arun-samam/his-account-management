<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create-account</title>
</head>
<body>
<form:form action="createaccount" method="Post" modelAttribute="admin">

	firstName: <form:input path="firstName" type="text"/><br><br>
	lastName : <form:input path="lastName" type="text"/><br><br>
	email    : <form:input path="email" type="email"/><br><br>
	gender   : <form:radiobutton path="gender" value="male"/>Male 
			   <form:radiobutton path="gender" value="female"/>Female
			   
			   <form:select path="role">
			   		<form:option value="">--select_role--</form:option>
			   		<form:option value="admin">Admin</form:option>
			   		<form:option value="caseworker">caseworker</form:option>
			   
			   </form:select>
			   <br><br>
			   <input type="submit" value="create"></input>
</form:form>
</body>
</html>