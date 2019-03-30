<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accommodations</title>

<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
<link rel="stylesheet" href="assets/css/myStyleSheet.css" />
</head>
<body>
	<h1 style="color: gray; text-align: center">Accommodation's List</h1>

	<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Available</th>
			<th>Image</th>
			<th>Operations</th>
		</tr>

		<c:forEach items="${listAcc}" var="a">
			<tr>
				<td>${a.idAcc}</td>
				<td>${a.name}</td>
				<td>${a.price}</td>
				<td>${a.quantity}</td>
				<td><img src="photoAcc?idAcc=${a.idAcc}" /></td>
				<td><a class="btn btn-danger"
					href="${pageContext.request.contextPath}/accommodation/deleteLink?pId=${a.idAcc}"
					title="Supprimer">Supprimer</a> | <a class="btn btn-danger"
					href="${pageContext.request.contextPath}/accommodation/updateLink?pId=${d.idAcc}"
					title="Modifier">Modifier</a></td>

			</tr>
		</c:forEach>

	</table>
</body>
</html>