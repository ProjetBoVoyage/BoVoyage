<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/myStyleSheet.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/JS/myJavaScript.css" />


</head>
<body>
	<div style="padding-left: 18vw; padding-right: 18vw">
		<ul class="nav nav-tabs nav-justified">
			<li role="presentation" class="active"><a
				href="${pageContext.request.contextPath}/start/custo/customerPage">Account</a></li>
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/custo/updateLink">Personal
					Infos</a></li>
			<li role="presentation"><a href="#">Trips</a></li>
			<li role="presentation"><a href="#">Payments</a></li>
		</ul>

	</div>
</body>
</html>