<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
</head>
<body>
	<%@include file="/WEB-INF/templates/navBar.jsp"%>
	<br />
	<br />
	<!-- Colonne vide -->
	<div class="col-sm-6 col-md-3"></div>

	<div class="col-sm-12 col-md-6">
		You have chosen the accommodation ${hotel.name} in
		${hotel.destination.city} <br />
		<form:form method="POST" action="submitResHotel"
			commandName="formulaTrip" cssClass="form-horizontal"
			cssStyle="margin-top:100px;" enctype="multipart/form-data">
		
			Choose your formula:<br />
			<form:select class="col-md-3 form-control"
				path="formulaAccomodation.id">
				<option value="1">Choose a formula</option>
				<c:forEach items="${formacc}" var="f">
					<option value="${f.id}">${f.nameFormAcc}</option>
				</c:forEach>
			</form:select>
			
			<br/>Do you want a Car ? 
			<form:checkbox path="carRental"/>
			
			<br/>Do you want an Insurance ?
			<form:select class="col-md-3 form-control"
				path="insurance.id">
				<option value="1">Choose an Insurance</option>
				<c:forEach items="${forminsu}" var="u">
					<option value="${i.idInsu}">${i.name}</option>
				</c:forEach>
			</form:select>

			<button type="submit" class="btn btn-primary">Book</button>

		</form:form>
	</div>

</body>
</html>