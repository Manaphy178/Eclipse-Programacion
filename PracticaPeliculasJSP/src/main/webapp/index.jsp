<%@ page import="Peliculas.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE HTML>
<!--
Plantilla utilizada para prácticas de Programación, Centro Nelson.
-->
<html>
<head>
<title>Práctica de Programación Peliculas</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<%
ArrayList<Pelicula> pelis = leerArchivo.leer();
%>
<body class="is-preload">

	<!-- Header -->
	<header id="header">
		<a class="logo" href="index.html">Centro Nelson</a>
		<nav>
			<a href="#menu">Menú</a>
		</nav>
	</header>

	<!-- Nav -->
	<nav id="menu">
		<ul class="links">
			<li><a href="index.html">Inicio</a></li>
			<li><a href="">Enlace 1</a></li>
			<li><a href="">Enlace 2</a></li>
		</ul>
	</nav>

	<!-- Heading -->
	<div id="heading">
		<h1>Práctica Peliculas</h1>
	</div>

	<!-- Main -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">
				<header>
					<h2>Listado de Peliculas del archivo peliculas.txt</h2>
				</header>
				<%for(Pelicula p : pelis){
				%>
				<div class="pelicula">
					<h3>
						<b><%=p.getTitulo() %></b>
					</h3>
					<img src="images/<%=p.getMatricula() %>.jpg"
						style="float: right; position: relative; width: 20%;">
					<p>
						<b>Año:<%=p.getAnno() %></b>
					</p>
					<p>
						<b>Duración:<%=p.getDuracion() %></b>
					</p>
					<p>
						<b>Pais:</b><span> <img src="images/<%=p.getPais().toLowerCase() %>.png"
							style="width: 18px; height: 12px">
						</span>
					</p>
					<p>
						<b>Dirección:<%=p.getPais() %></b>
					</p>
					<p>
						<b>Guion:<%=p.getGuionista() %></b>
					</p>
					<p>
						<b>Fotografia:<%=p.getFotografo() %></b>
					</p>
					<p>
						<b>Reparto:<%=p.actor() %></b>
					</p>
				</div>
				
				<hr><%} %>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<footer id="footer">
		<div class="inner">
			<div class="content">
				<section>
					<h3>Accumsan montes viverra</h3>
					<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing
						gravida odio porttitor sem non mi integer non faucibus ornare mi
						ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien
						lorem accumsan varius montes viverra nibh in adipiscing. Lorem
						ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum.
						Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed
						feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia
						ante nunc ac gravida.</p>
				</section>
				<section>
					<h4>Sem turpis amet semper</h4>
					<ul class="alt">
						<li><a href="#">Dolor pulvinar sed etiam.</a></li>
						<li><a href="#">Etiam vel lorem sed amet.</a></li>
						<li><a href="#">Felis enim feugiat viverra.</a></li>
						<li><a href="#">Dolor pulvinar magna etiam.</a></li>
					</ul>
				</section>
				<section>
					<h4>Magna sed ipsum</h4>
					<ul class="plain">
						<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
						<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
						<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
						<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
					</ul>
				</section>
			</div>
			<div class="copyright">
				&copy; <a href="https://www.centronelson.org">Centro Nelson</a>.
			</div>
		</div>
	</footer>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>