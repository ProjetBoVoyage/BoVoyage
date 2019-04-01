<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NavBar</title>
<link rel="stylesheet" href="assets/css/myStyleSheet.css" />
<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">

<link href="https://fonts.googleapis.com/css?family=Amatic+SC"
	rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"
	type="text/javascript"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	type="text/javascript"></script>
</head>
<body>
	<div>
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<ul class="nav nav-tabs">
				<li role="presentation"><a
					href="${pageContext.request.contextPath}/start/welcome">Home</a></li>
				<li role="presentation"><a href="">Flights</a></li>
				<li role="presentation"><a href="${pageContext.request.contextPath}/destination/viewSearchCont">Destinations</a></li>
				<li role="presentation"><a href="">Accommodations</a></li>
				<li role="presentation"><a
					href="${pageContext.request.contextPath}/contactus/emailForm">Contact
						Us</a></li>

				<li class="dropdown nav navbar-nav navbar-right"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Connect <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/start/custo/customerPage">Customer</a></li>

						<li><a
							href="${pageContext.request.contextPath}/start/admin/adminPage">Admin</a></li>

						<li><a
							href="${pageContext.request.contextPath}/start/couns/counsellorPage">Counselor</a></li>
						<li role="separator" class="divider"></li>
						<li><a
							href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a></li>

					</ul></li>

			</ul>
		</nav>
	</div>
	<br />
	<br>
</body>
</html>