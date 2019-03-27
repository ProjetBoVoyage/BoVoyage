<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Ajouter la librairie de jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form method="post" action="connexion">
		Identifier: <input type="text" name="j_username" />
		<br>
		Password: <input type="text" name="j_password" />
		<br>
		<input type="submit" value="Se Connecter">
	</form>
	
	<c:if test="${not empty error}">
		<h1 style="color: red; text-align: center">Authentication Failed</h1>
	</c:if>
</body>
</html>