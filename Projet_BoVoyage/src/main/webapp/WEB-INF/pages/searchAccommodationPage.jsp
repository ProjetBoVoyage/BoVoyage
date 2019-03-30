<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Accommodation Page</title>
</head>
<body>

	<h1 style="color: red; text-align: center">Search for an
		accommodation</h1>

	<form:form class="form-horizontal" method="post" action="submitSearch"
		commandName="accSearch">
		<div class="form-group">
			<label for="idId" class="col-sm-2 control-label">Id: </label>
			<div class="col-sm-5">
				<form:input class="form-control" id="idId" placeholder="Id"
					name="pId" path="idAcc" />
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
			<th>Accommodation's Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Image</th>
		</tr>
		<tr>
			<td>${accommodation.idacc}</td>
			<td>${accommodation.name}</td>
			<td>${accommodation.price}</td>
			<td>${accommodation.quantity}</td>
			<td><img src="photoAcc?idAcc=${accommodation.idAcc}" /></td>

		</tr>


	</table>

	<h1 style="color: red; text-align: center">${msg}</h1>
</body>
</html>