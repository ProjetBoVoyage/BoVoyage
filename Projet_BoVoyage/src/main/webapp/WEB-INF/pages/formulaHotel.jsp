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
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/myStyleSheet.css" />
</head>
<body>
	<%@include file="/WEB-INF/templates/navBar.jsp"%>
	<br/><br/>
	    <!-- Colonne vide -->
    <div class="col-sm-6 col-md-1"></div>
    
<div class="col-sm-12 col-md-10">
<center><h1>Hotels in <b>${destination.city}, ${destination.country}</b></h1></center>

<table class="table table-striped">
		<tr>
			<th>Name</th>
			<th>Price per night</th>
			<th>Stars</th>
			<th>Photo</th>
			<th>Choose</th>
		</tr>

		<c:forEach items="${listAccDest}" var="a">
			<tr>
				<td>${a.name}</td>
				<td>${a.price}</td>
				<td>${a.stars}</td>
				<td><img src="photoAcc?idAcc=${a.idAcc}" width="300px" /></td>
			 <td><a class="btn btn-info"
					href="#"
					title="Choose">Choose this hotel</a></td>
			</tr>
		</c:forEach>
	</table>

</div>
	    <!-- Colonne vide -->
    <div class="col-sm-6 col-md-1"></div>
</body>
</html>