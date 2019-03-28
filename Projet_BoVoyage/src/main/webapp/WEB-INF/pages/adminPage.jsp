<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!-- Ajouter la lib de jstl -->
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	Je suis dans l'Admin Page
	<a href="${pageContext.request.contextPath}/j_spring_security_logout">LogOut</a>
	<a href="${pageContext.request.contextPath}/destination/viewDest">view</a>
	<a href="${pageContext.request.contextPath}/destination/viewAdd">add</a>
	<br/><br/><br/>
	

	
		
	
	
	
</body>
</html>