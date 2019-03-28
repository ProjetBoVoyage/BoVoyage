<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Destination Page</title>
</head>
<body>

	<h1 style="color: red; text-align: center">Search for a
		destination</h1>

	<form:form class="form-horizontal" method="post" action="submitSearch"
		commandName="destSearch">
		<div class="form-group">
			<label for="idId" class="col-sm-2 control-label">Id: </label>
			<div class="col-sm-5">
				<form:input class="form-control" id="idId" placeholder="Id"
					name="pId" path="idDest" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-success">Rechercher</button>
			</div>
		</div>
	</form:form>

	<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>City</th>
			<th>Country</th>
			<th>Continent</th>
			<th>Image</th>
		</tr>
		<tr>
			<td>${destination.idDest}</td>
			<td>${destination.city}</td>
			<td>${destination.country}</td>
			<td>${destination.continent}</td>
			<td><img src="photoDest?idDest=${destination.idDest}" /></td>

		</tr>


	</table>

	<h1 style="color: red; text-align: center">${msg}</h1>
</body>
</html>