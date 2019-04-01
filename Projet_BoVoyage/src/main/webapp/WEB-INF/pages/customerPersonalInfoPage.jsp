<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Infos Manager</title>
</head>
<body>
	<%@include file="/WEB-INF/templates/navBar.jsp"%>
	<div>
		<h1>
			Welcome ${customer.name} ${customer.firstname}
		</h1>
	</div>
	<%@include file="/WEB-INF/templates/navBarCusto.jsp"%>
	<br>

</body>
</html>