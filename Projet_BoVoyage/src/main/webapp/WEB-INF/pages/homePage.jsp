<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Ajouter la lib de jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet" href ="assets/css/myStyleSheet.css"/>
<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">

<link href="https://fonts.googleapis.com/css?family=Amatic+SC" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"
	type="text/javascript"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	type="text/javascript"></script>

<base href="resources\" target="_parent">




</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" >
		<ul class="nav nav-tabs">
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/welcome">Home</a></li>
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/custo/customerPage">My
					Account</a></li>
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/admin/adminPage">Admin
					Page</a></li>
			<li role="presentation"><a
				href="${pageContext.request.contextPath}/start/couns/counsellorPage">Counsellor
					Page</a></li>

		</ul>
	</nav>

<br/><br/>
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
						alt="Santorino" id="img">

					<div class="carousel-caption d-none d-md-block">
					
						<h1>SANTORINI - Greece</h1>
						<h4>Flight + hotel from 349 Eur *</h4>
					</div>

				</div>
				<div class="item">
					<img class="img-responsive center-block"
						src="https://www.ijsexpress.nl/wp-content/uploads/amsterdam_banner.jpg"
						alt="Amsterdam" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>AMSTERDAM - Holland</h1>
						<h4>Flight + hotel from 269 Eur *</h4>
					</div>
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://d2wl5ewipdp1qd.cloudfront.net/resize/2000x300/filters:quality(65):max_age(1209600)/s3/bthetravelbrand/viajes/china/sliderchinalg.jpg"
						alt="Kawazy" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>KAWAZY - Japan</h1>
						<h4>Flight + hotel from 929 Eur *</h4>
					</div>
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://d2wl5ewipdp1qd.cloudfront.net/resize/2000x300/filters:quality(65):max_age(1209600)/s3/bthetravelbrand/grandes-viajes/africa/egipto/niloclasico/sliderniloclasicolg1.jpg"
						alt="Cairo" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>CAIRO - Egypt</h1>
						<h4>Flight + hotel from 455 Eur *</h4>
					</div>
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://i.ibb.co/PCvCg0Y/photo.jpg" alt="Havana"
						id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>LA HAVANA - Cuba</h1>
						<h4>Flight + hotel from 819 Eur *</h4>
					</div>
				</div>

				<div class="item">
					<img class="center-block" src="https://i.ibb.co/w0hywQJ/india3.jpg"
						alt="Vrindavan" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>VRINDAVAN - India</h1>
						<h4>Flight + hotel from 679 Eur *</h4>
					</div>
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> </a> <a class="right carousel-control"
				href="#myCarousel" role="button" data-slide="next"> </a>
		</div>
		<br>
	</section>


	<div style="border-color:gray; border-radius: 70px; text-align: center; ">
	<h1 style="font-family:Amatic SC, sursive; font-size:7.5vw;">Welcome to Holy-Days</h1>
	<h3 style="font-family:Amatic SC, sursive; font-size:5vw; ">High Trips for Low Prices</h3>
	<br/>

	
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-4">
						<div class="card img-thumbnail">
							<img class="card-img-top img-thumbnail"
								alt="Bootstrap Thumbnail First"
								src="https://www.layoutit.com/img/people-q-c-600-200-1.jpg">
							<div class="card-block">
								<h5 class="card-title">Card title</h5>
								<p class="card-text">Cras justo odio, dapibus ac facilisis
									in, egestas eget quam. Donec id elit non mi porta gravida at
									eget metus. Nullam id dolor id nibh ultricies vehicula ut id
									elit.</p>
								<p>
									<a class="btn btn-primary" href="#">Action</a> <a class="btn"
										href="#">Action</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="card img-thumbnail">
							<img class="card-img-top img-thumbnail"
								alt="Bootstrap Thumbnail Second"
								src="https://www.layoutit.com/img/city-q-c-600-200-1.jpg">
							<div class="card-block">
								<h5 class="card-title">Card title</h5>
								<p class="card-text">Cras justo odio, dapibus ac facilisis
									in, egestas eget quam. Donec id elit non mi porta gravida at
									eget metus. Nullam id dolor id nibh ultricies vehicula ut id
									elit.</p>
								<p>
									<a class="btn btn-primary" href="#">Action</a> <a class="btn"
										href="#">Action</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="card img-thumbnail">
							<img class="card-img-top img-thumbnail"
								alt="Bootstrap Thumbnail Third"
								src="https://www.layoutit.com/img/sports-q-c-600-200-1.jpg">
							<div class="card-block">
								<h5 class="card-title">Card title</h5>
								<p class="card-text">Cras justo odio, dapibus ac facilisis
									in, egestas eget quam. Donec id elit non mi porta gravida at
									eget metus. Nullam id dolor id nibh ultricies vehicula ut id
									elit.</p>
								<p>
									<a class="btn btn-primary" href="#">Action</a> <a class="btn"
										href="#">Action</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<%@include file="footer.jsp"%>
<%@include file="footerSticky.jsp"%>
</body>


</body>
</html>