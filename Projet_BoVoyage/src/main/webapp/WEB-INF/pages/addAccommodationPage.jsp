<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Accommodation Page</title>
</head>
<body>
	<!-- D�but formulaire -->
	<form:form method="POST" action="submitAdd" commandName="accAdd"
		cssClass="form-horizontal" enctype="multipart/form-data">
		<div class="form-group">
			<label for="idName" class="col-sm-2 control-label">Name: </label>
			<div class="col-sm-5">
				<form:input cssClass="form-control" id="idCity"
					placeholder="Accommodation's Name" path="name" />
			</div>
		</div>
		<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<label for="idPrice" class="col-sm-2 control-label">Price: </label>
			<div class="col-sm-5">
				<form:input cssClass="form-control" id="idPrice"
					placeholder="Price per Night" path="price" type="number" />
			</div>
		</div>
		<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<label for="idQuantity" class="col-sm-2 control-label">Rooms
				Available: </label>
			<div class="col-sm-5">
				<form:input cssClass="form-control" id="idQuantity"
					placeholder="Quantity" path="quantity" type="number" />
			</div>
		</div>
		<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<label for="idPhoto" class="col-sm-2 control-label">Photo: </label>
			<div class="col-sm-5">
				<input type="file" id="idPhoto" name="file" />
			</div>
		</div>
		<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<div class="col-sm-offset-4 col-sm-10">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>
		</div>
	</form:form>

</body>
</html>