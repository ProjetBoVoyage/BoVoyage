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
    <div class="col-sm-6 col-md-3"></div>
    
<div class="col-sm-12 col-md-6">
<center><h1>Hotels in <b>${destination.city}, ${destination.country}</b></h1></center>

<table class="table">

		<c:forEach items="${listAccDest}" var="a">
			<tr>
			<td><img src="photoAcc?idAcc=${a.idAcc}" width="300px" /></td>
				<td><b>${a.name} </b><span style="color:#FFCE1A;">${a.stars}</span><br/>
				${a.description}</td>
				<td>${a.price}</td>
			 <td>
					<input type="radio" name="hotelChoice" id="hotelChoice" checked/>
					</td>
			</tr>
		</c:forEach>
	</table>

</div>
	    <!-- Colonne vide -->
    <div class="col-sm-6 col-md-1"></div>
</body>
</html>