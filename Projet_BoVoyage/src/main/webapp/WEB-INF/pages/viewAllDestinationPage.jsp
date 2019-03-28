<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
<link rel="stylesheet" href="assets/css/myStyleSheet.css" />
</head>
<body>
	<h1 style="color: red; text-align: center">Liste des destinations</h1>

	<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>City</th>
			<th>Country</th>
			<th>Continent</th>
			<th>Image</th>
			<th>Opérations</th>
		</tr>

		<c:forEach items="${listDest}" var="d">
			<tr>
				<td>${d.idDest}</td>
				<td>${d.city}</td>
				<td>${d.country}</td>
				<td>${d.continent}</td>
				<td><img src="photoDest?idDest=${d.idDest}" /></td>
				<td><a class="btn btn-danger"
					href="${pageContext.request.contextPath}/destination/deleteLink?pId=${d.idDest}"
					title="Supprimer">Supprimer</a> | <a class="btn btn-danger"
					href="${pageContext.request.contextPath}/destination/updateLink?pId=${d.idDest}"
					title="Modifier">Modifier</a></td>

			</tr>
		</c:forEach>

	</table>
</body>
</html>