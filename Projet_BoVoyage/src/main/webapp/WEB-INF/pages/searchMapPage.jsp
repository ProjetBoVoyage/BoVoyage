<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search for a trip</title>

<!-- Ajouter le fichier Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
<link rel="stylesheet" href="assets/css/myStyleSheet.css" />
</head>
<body>

<!-- Début de la map /à éviter de modifier -->
    <div align="center">
      <img src="https://i.ibb.co/K0HvNMS/worldmap1.png" alt="worldmap" 
      usemap="#worldmap" style="border: 0; width:50%" id="wp"/>
      <map name="worldmap">
        <area shape="poly" coords="477,478,377,467,162,207,0,227,0,74,397,1,613,0,516,53,618,106,663,243,536,379,606,430" href="${pageContext.request.contextPath}/destination/searchCont?pCont=North+America" target="" alt="NorthAmerica" onMouseOver="document.getElementById('wp').src ='https://i.ibb.co/MG5L3k6/worldmapna.png'"onMouseOut="document.getElementById('wp').src = 'https://i.ibb.co/K0HvNMS/worldmap1.png'"/>
        <area shape="poly" coords="910,318,827,389,855,542,1002,724,1040,795,1200,741,1259,596,1233,481,1174,474,1100,348,943,314" href="${pageContext.request.contextPath}/destination/searchCont?pCont=Africa" target="" alt="Africa" onMouseOver="document.getElementById('wp').src ='https://i.ibb.co/S7R64wp/worldmapaf.png'"onMouseOut="document.getElementById('wp').src = 'https://i.ibb.co/K0HvNMS/worldmap1.png'"/>
        <area shape="poly" coords="479,482,576,458,764,587,713,737,630,897,582,927,504,910,525,685,433,544" href="${pageContext.request.contextPath}/destination/searchCont?pCont=South+America" target="" alt="SouthAmerica" onMouseOver="document.getElementById('wp').src ='https://i.ibb.co/GT9S4QY/worldmapsa.png'"onMouseOut="document.getElementById('wp').src = 'https://i.ibb.co/K0HvNMS/worldmap1.png'"/>
         <area shape="poly" coords="796,110,996,14,1169,22,1175,112,1150,239,1112,271,1080,290,1095,322,1007,307,979,298,888,315" href="${pageContext.request.contextPath}/destination/searchCont?pCont=Europe" target="" alt="Europe" onMouseOver="document.getElementById('wp').src ='https://i.ibb.co/S0gxmYV/worldmapeu.png'"onMouseOut="document.getElementById('wp').src = 'https://i.ibb.co/K0HvNMS/worldmap1.png'"/>
        <area shape="rect" coords="0,959,1999,1111" href="${pageContext.request.contextPath}/destination/searchCont?pCont=Antarctica" target="" alt="Antarctica" onMouseOver="document.getElementById('wp').src ='https://i.ibb.co/ZJxkRrd/worldmapant.png'"onMouseOut="document.getElementById('wp').src = 'https://i.ibb.co/K0HvNMS/worldmap1.png'"/>
 <area shape="poly" coords="1701,599,1545,693,1569,789,1860,888,1966,761,1760,534" href="${pageContext.request.contextPath}/destination/searchCont?pCont=Oceania" target="" alt="Oceania" onMouseOver="document.getElementById('wp').src ='https://i.ibb.co/kDxjfSr/worldmapoce.png'"onMouseOut="document.getElementById('wp').src = 'https://i.ibb.co/K0HvNMS/worldmap1.png'"/>
<area shape="poly" coords="1177,120,1156,243,1090,299,1125,347,1185,465,1292,426,1452,577,1623,623,1702,588,1788,496,1995,115,1940,2,1197,2" href="${pageContext.request.contextPath}/destination/searchCont?pCont=Asia" target="" alt="Asia" onMouseOver="document.getElementById('wp').src ='https://i.ibb.co/xskJyjQ/worldmapasie.png'"onMouseOut="document.getElementById('wp').src = 'https://i.ibb.co/K0HvNMS/worldmap1.png'"/>    
      </map></div>
<!-- Fin de la map -->


<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>City</th>
			<th>Country</th>
			<th>Continent</th>
			<th>Image</th>
		</tr>
			<c:forEach items="${listDestCont}" var="d">
			<tr>
				<td>${d.idDest}</td>
				<td>${d.city}</td>
				<td>${d.country}</td>
				<td>${d.continent}</td>
				<td><img src="photoDest?idDest=${d.idDest}" /></td>
			</tr>
		</c:forEach>


	</table>



<!-- Scripts pour la map /ne pas enlever -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script type="text/javascript" src="http://davidjbradshaw.com/imagemap-resizer/js/imageMapResizer.min.js"></script>
	<script type="text/javascript">

		$('map').imageMapResize();

	</script>

<%@include file="footer.jsp"%>
<%@include file="footerSticky.jsp"%>
</body>
</html>