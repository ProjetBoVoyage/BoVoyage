<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<div class="row">
			<c:forEach items="${listFT}" var="fTrip">
				<div class="media">
					<div class="media-left">
						<img
							src="photoDest?idDest=${fTrip.destination.idDest}"
							class="media-object" style="width: 25vw">
					</div>
					<div class="media-body">
						<h4 class="media-heading">
							Lieu pays ${fTrip.destination.country}, <small><i>
									continent ${fTrip.destination.continent}</i></small>
						</h4>
						<h4 class="media-heading">Formule choisie
							${fTrip.nameFormTrip}</h4>
						<p>Description de la destination
							${fTrip.destination.description }</p>

						<div class="col-md-4">
							<div class="card" style="border-radius: 0px !important">
								<h2 class="media-heading">Accomodation</h2>

								<div class="img-box">
									<img
										src="photoAcc?idAcc=${fTrip.accomodation.idAcc}"
										style="height: 10vw; max-height: 125px; position: absolute;" />
								</div>
								<div class="card-block"></div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="card">

								<div class="card-block" style="padding-bottom: 20px">
									<h3><label>${fTrip.accomodation.name}</label></h3>
									<p style="">
										prix ${fTrip.accomodation.price} &euro; <br /> etoile
										${fTrip.accomodation.stars }
									</p>
								</div>

								<div class="card-block">
									<h3>formule de logement
										${fTrip.formulaAccomodation.nameFormAcc}</h3>
								</div>
							</div>
						</div>


						<div class="col-md-4" style="border-radius: 0px !important">
							<div class="card">
								<h2 class="media-heading">Flight</h2>

								<div class="card-block" style="padding-bottom: 20px">
									<h3>Departure</h3>
									<p>Lieu ${fTrip.flight.departureAirport }</p>
									<p>Date et heure ${fTrip.flight.departureDate }
										${fTrip.flight.departureTime }</p>
								</div>

								<div class="card-block">
									<h3>Arrival</h3>
									<p>Lieu ${fTrip.flight.arrivalAirport }</p>
									<p>Date et heure ${fTrip.flight.arrivalDate }
										${fTrip.flight.arrivalTime }</p>
								</div>
							</div>
						</div>


					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>