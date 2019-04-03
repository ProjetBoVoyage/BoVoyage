<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"
	type="text/javascript"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	type="text/javascript"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/myStyleSheet.css" />
<base href="" target="_parent">

</head>
<body>

	<%@include file="/WEB-INF/templates/navBar.jsp"%>

	<br>
	<br>
	<br>

	<div class="container">
		<h2>Nested Media Objects</h2>
		<p>Media objects can also be nested (a media object inside a media
			object):</p>
		<br>
		<div class="media">
			<div class="media-left">
				<img
					src="http://www.lutryvoyages.ch/fr/0_gross/Destinations/Artique---Antarctique-/208449.jpg"
					class="media-object" style="width: 25vw">
			</div>
			<div class="media-body">
				<h4 class="media-heading">
					Lieu pays ${trip.destination.country}, <small><i>
							continent ${trip.destination.continent}</i></small>
				</h4>
				<h4 class="media-heading">Formule choisie
					${trip.formulaTrip.nameFormTrip}</h4>
				<p>Description de la destination ${trip.destination.description }</p>

				<div class="col-md-4">
					<div class="card" style="border-radius: 0px !important">
						<h2 class="media-heading">Accomodation</h2>

						<div class="img-box">
							<img
								src="http://www.lutryvoyages.ch/fr/0_gross/Destinations/Artique---Antarctique-/208449.jpg"
								style="height: 10vw; max-height: 125px; position: absolute;" />
						</div>
						<div class="card-block"></div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card">
						<h2 class="media-heading">----</h2>

						<div class="card-block" style="padding-bottom: 20px">
							<h3>Nom de l'hotel ${trip.accomodation.name}</h3>
							<p style="">
								prix ${trip.accomodation.price} ? <br /> etoile
								${trip.accomodation.stars }
							</p>
						</div>

						<div class="card-block">
							<h3>formule de logement
								${trip.formulaaccomodation.nameFormAcc}</h3>
						</div>
					</div>
				</div>


				<div class="col-md-4" style="border-radius: 0px !important">
					<div class="card">
						<h2 class="media-heading">Flight</h2>

						<div class="card-block" style="padding-bottom: 20px">
							<h3>Departure</h3>
							<p>Lieu ${trip.destination.departureAirport }</p>
							<p>Date et heure ${trip.destination.departureDate }
								${trip.destination.departureTime }</p>
						</div>

						<div class="card-block">
							<h3>Arrival</h3>
							<p>Lieu ${trip.destination.arrivalAirport }</p>
							<p>Date et heure ${trip.destination.arrivalDate }
								${trip.destination.rrivalTime }</p>
						</div>
					</div>
				</div>


			</div>
		</div>
</body>
</html>