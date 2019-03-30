<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<base href="" target="_parent">
<style type="text/css">
	<link rel="stylesheet" href="assets/css/myStyleSheet.css" />
</style>
</head>
<body>

	<nav class="navbar navbar-inverse ">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand"
					href="${pageContext.request.contextPath}/start/admin/adminPage">Administrator</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a
						href="${pageContext.request.contextPath}/start/admin/adminPage">Home</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Accommodations<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a
								href="${pageContext.request.contextPath}/accommodation/viewAcc">View
									All</a></li>
							<li role="separator" class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/accommodation/viewAdd">Add</a></li>
							<li><a
								href="${pageContext.request.contextPath}/accommodation/viewUpdate">Update</a></li>
							<li role="separator" class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/accommodation/viewSearch">Search</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Destination<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a
								href="${pageContext.request.contextPath}/destination/viewDest">View
									All</a></li>
							<li role="separator" class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/destination/viewAdd">Add</a></li>
							<li><a
								href="${pageContext.request.contextPath}/destination/viewUpdate">Update</a></li>
							<li role="separator" class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/destination/viewSearch">Search</a></li>
															<li><a
								href="${pageContext.request.contextPath}/destination/viewSearchCont">Search by continent</a></li>
						</ul>
					</li>
						<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Insurance<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a
								href="${pageContext.request.contextPath}/insurance/viewInsu">View
									All</a></li>
							<li role="separator" class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/insurance/viewAdd">Add</a></li>
							<li><a
								href="${pageContext.request.contextPath}/insurance/viewUpdate">Update</a></li>
							<li role="separator" class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/insurance/viewSearch">Search</a></li>
						</ul>
						
						<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Flight<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a
								href="${pageContext.request.contextPath}/flight/viewFlig">View
									All</a></li>
							<li role="separator" class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/flight/viewAdd">Add</a></li>
							<li><a
								href="${pageContext.request.contextPath}/flight/viewUpdate">Update</a></li>
							<li role="separator" class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/flight/viewSearch">Search</a></li>
						</ul>
					</li>
				</ul>
				<form class="navbar-form navbar-left">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li><a
						href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
<br/><br/>
</body>
</html>