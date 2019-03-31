<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NavBar</title>
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
		<ul class="nav nav-tabs">
			<li role="presentation"><a href="">Home</a></li>
			<li role="presentation"><a href="">Flights</a></li>
			<li role="presentation"><a href="">Countries</a></li>
			<li role="presentation"><a href="">Accomodations</a></li>
			<li role="presentation"><a href="">Contact Us</a></li>

			<li class="dropdown nav navbar-nav navbar-right"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown" role="button"
				aria-haspopup="true" aria-expanded="false">Connect <span
					class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a
						href="${pageContext.request.contextPath}/start/custo/customerPage">Client</a></li>

					<li><a
						href="${pageContext.request.contextPath}/start/admin/adminPage">Admin</a></li>

					<li><a
						href="${pageContext.request.contextPath}/start/couns/counsellorPage">Counsellor</a></li>
					<li role="separator" class="divider"></li>
					<li><a
						href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a></li>

				</ul></li>

		</ul>
	</nav>

</body>
</html>