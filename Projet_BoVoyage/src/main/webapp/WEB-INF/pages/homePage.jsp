<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Ajouter la lib de jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<base href="resources\" target="_parent">
<style type="text/css">
</style>
<link rel="stylesheet" href="assets/css/myStyleSheet.css" />



</head>
<body>

	<nav class="navbar navbar-inverse">
		<ul class="nav nav-tabs">
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/welcome">Home</a></li>
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/custo/customerPage">My
					Account</a></li>
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/admin/adminPage">Admin
					Page</a></li>
		</ul>
	</nav>


	<section>
		<!-- Carousel code 1-->
		<div id="myCarousel" class="carousel slide" data-ride="carousel"
			data-interval="3500">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
				<li data-target="#myCarousel" data-slide-to="4"></li>
				<li data-target="#myCarousel" data-slide-to="5"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img class="img-responsive center-block"
						src="https://d2wl5ewipdp1qd.cloudfront.net/resize/2000x300/filters:quality(65):max_age(1209600)/s3/bthetravelbrand/grandes-viajes/europa/grecia/slidergrecia2lg.jpg"
						alt="SALE" id="img">

					<div class="carousel-caption d-none d-md-block">
						<h1>First Slide Test</h1>
						<h3>Bonjour je suis le test de la slide 1</h3>
					</div>

				</div>
				<div class="item">
					<img class="img-responsive center-block"
						src="https://www.ijsexpress.nl/wp-content/uploads/amsterdam_banner.jpg"
						alt="WOMEN CLOTHING" id="img">
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://d2wl5ewipdp1qd.cloudfront.net/resize/2000x300/filters:quality(65):max_age(1209600)/s3/bthetravelbrand/viajes/china/sliderchinalg.jpg"
						alt="MENS CLOTHING" id="img">
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://d2wl5ewipdp1qd.cloudfront.net/resize/2000x300/filters:quality(65):max_age(1209600)/s3/bthetravelbrand/grandes-viajes/africa/egipto/niloclasico/sliderniloclasicolg1.jpg"
						alt="KIDS CLOTHING" id="img">
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://i.ibb.co/PCvCg0Y/photo.jpg" alt="KIDS CLOTHING"
						id="img">
				</div>

				<div class="item">
					<img class="center-block"
						src="https://i.ibb.co/941nwGS/india.jpg"
						alt="KIDS CLOTHING" id="img" >
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
		<br>
	</section>

	<h1 style="color: green; text-align: center;">Home Page</h1>

</body>
</html>