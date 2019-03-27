<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Ajouter la lib de jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
</head>
<body>

	<nav class="navbar navbar-inverse">
		<ul class="nav nav-tabs">
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/welcome">Home</a></li>
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/customer/customerPage">My Account</a></li>
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/admin/adminPage">Admin Page</a></li>
		</ul>
	</nav>
	<h1 style="color:green; text-align:center;">Home Page</h1>
	
	
	
</body>
</html>