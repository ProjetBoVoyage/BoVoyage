<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Destinations</title>

<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
<link rel="stylesheet" href="assets/css/myStyleSheet.css" />
</head>
<body>
	<h1 style="color: gray; text-align: center">Flights' List</h1>

	<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>DepartureAirport</th>
			<th>DepartureDate</th>
			<th>DepartureTime</th>
			<th>ArrivalAirport</th>
			<th>ArrivalDate</th>
			<th>ArrivalTime</th>
			<th>Company</th>
			<th>Quantity</th>
			<th>Operations</th>
		</tr>

		<c:forEach items="${listFlig}" var="f">
			<tr>
				<td>${f.idFlight}</td>
				<td>${f.departureAirport}</td>
				<td>${f.departureDate}</td>
				<td>${f.departureTime}</td>
				<td>${f.arrivalAirport}</td>
				<td>${f.arrivalDate}</td>
				<td>${f.arrivalTime}</td>
				<td>${f.company}</td>
				<td>${f.quantity}</td>
				<td><a class="btn btn-danger"
					href="${pageContext.request.contextPath}/flight/deleteLink?pId=${f.idFlight}"
					title="Supprimer">Delete</a> | <a class="btn btn-danger"
					href="${pageContext.request.contextPath}/flight/updateLink?pId=${f.idFlight}"
					title="Modifier">Update</a></td>

			</tr>
		</c:forEach>

	</table>





</body>
</html>