<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!-- Ajouter la lib de jstl -->
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
		</tr>

		<c:forEach items="${listDest}" var="d">
			<tr>
				<td>${d.idDest}</td>
				<td>${d.city}</td>
				<td>${d.country}</td>
				<td>${d.continent}</td>
				<td>  <img src="data:image/jpg;base64,${d.img}" width="240" height="300"/></td>
							</tr>
		</c:forEach>

	</table>
</body>
</html>