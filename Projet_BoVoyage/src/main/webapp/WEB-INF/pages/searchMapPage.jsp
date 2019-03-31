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
<%@include file="/WEB-INF/templates/navBar.jsp"%>

<br/><br/>

	<!-- Un élément HTML pour recueillir la carte -->
<center>	
	<h1>Find a destination by area</h1></center>
	
<!-- Début de la map /à éviter de modifier -->
    <div align="center" style="margin-top: 50px;">
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
<br/><br/>
		    <!-- Colonne vide -->
    <div class="col-sm-6 col-md-2"></div>
    
    <div class="col-sm-12 col-md-10">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<c:forEach items="${listDestCont}" var="d">
						<div class="col-md-4">
							<div class="card">
								<img class="card-img-top" src="photoDest?idDest=${d.idDest}"
									style="width: 300px; height: 150px" />
								<div class="card-block">
									<h3 class="card-title">${d.city}</h3>
									<p class="card-text">
										Interested in traveling to ${d.city} ? <br /> Book a trip
										Now !
									</p>
									<p>
										<a class="btn btn-primary" href="${pageContext.request.contextPath}/destination/searchFullDest?pDest=${d.idDest}">Learn more</a>
									</p>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>

			</div>
		</div>
	</div>

</div>

<center><h1>Find a destination close to you</h1>

<div id="map" style="width: 640px; height: 480px"></div></center>

<!-- Scripts pour la map /ne pas enlever -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script type="text/javascript" src="http://davidjbradshaw.com/imagemap-resizer/js/imageMapResizer.min.js"></script>
	<script type="text/javascript">

		$('map').imageMapResize();

	</script>
	
		<!-- Chargement de l'API Google maps -->
	<script src="https://maps.google.com/maps/api/js?sensor=false"></script>

	<script>
		// Position par défaut
		var centerpos = new google.maps.LatLng(48.579400, 7.7519);

		// Ainsi que des options pour la carte, centrée sur latlng
		var optionsGmaps = {
			center : centerpos,
			navigationControlOptions : {
				style : google.maps.NavigationControlStyle.SMALL
			},
			mapTypeId : google.maps.MapTypeId.ROADMAP,
			zoom : 4
		};

		// Initialisation de la carte avec les options
		var map = new google.maps.Map(document.getElementById("map"),
				optionsGmaps);

		if (navigator.geolocation) {

			// Fonction de callback en cas de succès
			function affichePosition(position) {

				var infopos = "Position déterminée : <br>";
				infopos += "Latitude : " + position.coords.latitude + "<br>";
				infopos += "Longitude: " + position.coords.longitude + "<br>";
				infopos += "Altitude : " + position.coords.altitude + "<br>";
				document.getElementById("maposition").innerHTML = infopos;

				// On instancie un nouvel objet LatLng pour Google Maps
				var latlng = new google.maps.LatLng(position.coords.latitude,
						position.coords.longitude);

				// Ajout d'un marqueur à la position trouvée
				var marker = new google.maps.Marker({
					position : latlng,
					map : map,
					title : "Vous êtes ici",
					icon : image
				});

				map.panTo(latlng);

			}

			// Fonction de callback en cas derreur
			function erreurPosition(error) {
				var info = "Erreur lors de la géolocalisation : ";
				switch (error.code) {
				case error.TIMEOUT:
					info += "Timeout !";
					break;
				case error.PERMISSION_DENIED:
					info += "Vous n avez pas donné la permission";
					break;
				case error.POSITION_UNAVAILABLE:
					info += "La position n a pu être déterminée";
					break;
				case error.UNKNOWN_ERROR:
					info += "Erreur inconnue";
					break;
				}
				document.getElementById("maposition").innerHTML = info;
			}

			navigator.geolocation.getCurrentPosition(affichePosition,
					erreurPosition);

		} else {

			alert("Ce navigateur ne supporte pas la géolocalisation");

		}

		var image = 'https://i.ibb.co/bb0Jyzg/pin-2.png';
	</script>

	<script type="text/javascript">
		var locations = [ [ '<img src="https://cdn.cnn.com/cnnnext/dam/assets/180911101104-abu-dhabi-destination-page-only.jpg" style="width:200px;height:100px"><br/>Abu Dhabi from 466 euros <a href="">see more</a>', 24.459080, 54.388358, 4 ],
				[ 'France', 46.563857, 2.765275, 5 ],
				[ 'Arabie Saoudite', 23.382471, 45.195551, 3 ],
				[ 'Oman', 20.419094, 56.323329, 2 ],
				[ 'Sri Lanka', 7.505756, 81.068496, 1 ],
				[ 'Thailande', 15.313169, 100.755264, 6 ],
				[ 'Chine', 34.609935, 104.303542, 7 ],
				[ 'Borneo', 1.529640, 114.588208, 8 ],
				[ 'Malaisie', 3.575951, 102.701691, 9 ],
				[ 'Singapour', 1.380123, 103.846026, 10 ],
				[ 'Brésil', -7.984112, -54.659890, 11 ],
				[ 'Espagne', 39.498083, -2.625418, 12 ],
				[ 'Italie', 42.984749, 12.894298, 13 ],
				[ 'Grèce', 39.467178, 22.705789, 14 ],
				[ 'UK', 54.947515, -1.379796, 15 ],
				[ 'Irlande', 53.132817, -7.965575, 16 ],
				[ 'Belgique', 50.529374, 4.664131, 13 ],
				[ 'Norvège', 61.839253, 9.732196, 14 ],
				[ 'Suède', 62.892157, 16.844237, 15 ],
				[ 'Danemark', 55.589512, 10.154714, 16 ],
				[ 'Allemagne', 51.014369, 9.770259, 17 ],
				[ 'Autriche', 47.632490, 14.216039, 18 ],
				[ 'Inde', 23.063864, 80.385692, 19 ],
				[ 'Jordanie', 31.339029, 36.871065, 20 ], ];

		var infowindow = new google.maps.InfoWindow();

		var marker, i;

		for (i = 0; i < locations.length; i++) {
			marker = new google.maps.Marker({
				position : new google.maps.LatLng(locations[i][1],
						locations[i][2]),
				map : map
			});

			google.maps.event.addListener(marker, 'click',
					(function(marker, i) {
						return function() {
							infowindow.setContent(locations[i][0]);
							infowindow.open(map, marker);
						}
					})(marker, i));
		}
	</script>

</body>
</html>