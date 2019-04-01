<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Ajouter la lib de jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
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

<base href="" target="_parent">

</head>
<body>

	<%@include file="/WEB-INF/templates/navBar.jsp"%>


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
						<h4>Flight + hotel from 349&euro;</h4>
					</div>

				</div>
				<div class="item">
					<img class="img-responsive center-block"
						src="https://www.ijsexpress.nl/wp-content/uploads/amsterdam_banner.jpg"
						alt="Amsterdam" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>AMSTERDAM - Holland</h1>
						<h4>Flight + hotel from 269&euro;</h4>
					</div>
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://d2wl5ewipdp1qd.cloudfront.net/resize/2000x300/filters:quality(65):max_age(1209600)/s3/bthetravelbrand/viajes/china/sliderchinalg.jpg"
						alt="Kawazy" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>KAWAZY - Japan</h1>
						<h4>Flight + hotel from 929&euro;</h4>
					</div>
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://d2wl5ewipdp1qd.cloudfront.net/resize/2000x300/filters:quality(65):max_age(1209600)/s3/bthetravelbrand/grandes-viajes/africa/egipto/niloclasico/sliderniloclasicolg1.jpg"
						alt="Cairo" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>CAIRO - Egypt</h1>
						<h4>Flight + hotel from 455&euro;</h4>
					</div>
				</div>

				<div class="item">
					<img class="img-responsive center-block"
						src="https://i.ibb.co/PCvCg0Y/photo.jpg" alt="Havana" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>LA HAVANA - Cuba</h1>
						<h4>Flight + hotel from 819&euro;</h4>
					</div>
				</div>

				<div class="item">
					<img class="center-block" src="https://i.ibb.co/w0hywQJ/india3.jpg"
						alt="Vrindavan" id="img">
					<div class="carousel-caption d-none d-md-block">
						<h1>VRINDAVAN - India</h1>
						<h4>Flight + hotel from 679&euro;</h4>
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


	<div
		style="border-color: gray; border-radius: 70px; text-align: center;">
		<h1 style="font-family: Amatic SC, sursive; font-size: 7.5vw;">Welcome
			to Holy-Days</h1>
		<h3 style="font-family: Amatic SC, sursive; font-size: 5vw;">High
			Trips for Low Prices</h3>
		<br />


	</div>
	<div class="col-sm-6 col-md-1"></div>
	<div class="container-fluid" style="text-align: center;">
		<div class="row">
			<div class="col-md-10">
				<div class="row">
					<c:forEach items="${listDest}" var="d">
						<div class="col-md-4">
							<div class="card thumbnail" style="max-width:300px">
								<img class="card-img-top" src="photoDest?idDest=${d.idDest}"
									style="width: 300px; height: 150px; border-radius:15%" />
								<div class="card-block">
									<h3 class="card-title">${d.city}</h3>
									<p class="card-text">
										Interested in traveling to ${d.city} ? <br /> Book a trip
										Now !
									</p>
									<p>
										<a class="btn btn-primary" href="${pageContext.request.contextPath}/destination/searchFullDest?pDest=${d.idDest}">Learn more</a>
									</p>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>

			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
	<%@include file="footerSticky.jsp"%>
</body>


</body>
</html>