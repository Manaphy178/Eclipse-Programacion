<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="fifa.*" %>
<%@ page import="java.io.*,java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html">
	
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css" />
	<title>Proyecto Web FIFA23</title>
</head>

<body class="is-preload">
		<div id="page-wrapper">

		<%
		//variables globales
		String origen = request.getParameter("tipo");
		BDController bd = new BDController();

		//ALTA JUGADOR
		if (origen.equalsIgnoreCase("Altajugador")) {
			String nombre = request.getParameter("nombre");
			String pierna = request.getParameter("pierna");
			String pais = request.getParameter("pais");
			int equipo = Integer.parseInt(request.getParameter("equipo"));
			int altura = Integer.parseInt(request.getParameter("altura"));
			int cod = bd.nextCode("jugadores", "cod_jugador");
			cod += 1;
			bd.altaJugador(cod, nombre, pierna, equipo, pais, altura);
			response.sendRedirect("altajugador.jsp?mensaje=Alta del jugador realizada exitosamente");
		} else if (origen.equalsIgnoreCase("Bajajugador")) {
			int cod = Integer.parseInt(request.getParameter("codigo"));
			if (bd.existeJugador(cod)) {
				bd.bajaJugador(cod);
				response.sendRedirect("bajajugador.jsp?mensaje=Baja del jugador realizada exitosamente");
			} else {
				response.sendRedirect("bajajugador.jsp?mensaje=Ha habido un error en la baja");
			}
		} else if (origen.equalsIgnoreCase("modificarjugador")) {

			int cod = Integer.parseInt(request.getParameter("modificar"));
			String nombre = request.getParameter("nombre");
			String pierna = request.getParameter("pierna");
			String pais = request.getParameter("pais");
			int equipo = Integer.parseInt(request.getParameter("equipo"));
			int altura = Integer.parseInt(request.getParameter("altura"));
			bd.updateJugador(cod, nombre, pierna, equipo, pais, altura);
			response.sendRedirect("modificarjugador1.jsp?mensaje=Modificacion del jugador realizada exitosamente");
		}
		if (origen.equalsIgnoreCase("Altaequipo")) {
			String nombre = request.getParameter("nombre");
			if (!bd.existeEquipoNom(nombre)) {
				int codL = Integer.parseInt(request.getParameter("liga"));
				int codE = bd.nextCode("equipos", "cod_equipo");
				codE++;
				bd.altaEquipo(codE, nombre, codL);
				response.sendRedirect("altaequipo.jsp?mensaje=Alta del equipo realizada exitosamente");
			} else {
				response.sendRedirect("altaequipo.jsp?mensaje=El equipo indicado ya existe");
			}
		} else if (origen.equalsIgnoreCase("Bajaequipo")) {
			int cod = Integer.parseInt(request.getParameter("codigo"));
			if (bd.existeEquipo(cod)) {
				bd.bajaEquipo(cod);
				response.sendRedirect("bajaequipo.jsp?mensaje=Baja del equipo realizada exitosamente");
			} else {
				response.sendRedirect("bajaequipo.jsp?mensaje=Ha habido un error en la baja");
			}
		} else if (origen.equalsIgnoreCase("modificarequipo")) {
			int codE = Integer.parseInt(request.getParameter("modificar"));
			String nombre = request.getParameter("nombre");

			int codL = Integer.parseInt(request.getParameter("liga"));
			bd.updateEquipo(codE, nombre, codL);
			response.sendRedirect("modificarequipo1.jsp?mensaje=Modificacion del equipo realizada exitosamente");
		}
		if (origen.equalsIgnoreCase("Altaliga")) {
			String nombre = request.getParameter("nombre");
			if (!bd.existeLigaNom(nombre)) {
				int codL = bd.nextCode("ligas", "cod_liga");
				String pais = request.getParameter("pais");
				codL++;
				bd.altaLiga(codL, nombre, pais);
				response.sendRedirect("altaliga.jsp?mensaje=Alta de la liga realizada exitosamente");
			} else {
				response.sendRedirect("altaliga.jsp?mensaje=La liga indicado ya existe");
			}
		} else if (origen.equalsIgnoreCase("Bajaliga")) {
			int cod = Integer.parseInt(request.getParameter("codigo"));
			if (bd.existeLiga(cod)) {
				bd.bajaLiga(cod);
				response.sendRedirect("bajaliga.jsp?mensaje=Baja de la liga realizada exitosamente");
			} else {
				response.sendRedirect("bajaliga.jsp?mensaje=Ha habido un error en la baja");
			}
		} else if (origen.equalsIgnoreCase("modificarliga")) {
			int codL = Integer.parseInt(request.getParameter("modificar"));
			String nombre = request.getParameter("nombre");
			String pais = request.getParameter("pais");
			bd.updateLiga(codL, nombre, pais);
			response.sendRedirect("modificarliga1.jsp?mensaje=Modificacion de la liga realizada exitosamente");
		}
		%>
		<!-- Header -->
				<div id="header">

					<!-- Logo -->
						<h1><a href="index.jsp" id="logo">FIFA23</a></h1>

					<!-- Nav -->
					<nav id="nav">
						<ul>
							<li class="current"><a href="index.jsp">Inicio</a></li>
							<li>
								<a href="#">Listados</a>
								<ul>
									<li><a href="ligas.jsp">FIFA 23 Ligas</a></li>
									<li><a href="equipos.jsp">FIFA 23 Equipos</a></li>
									<li><a href="jugadores.jsp">FIFA 23 Jugadores</a></li>
								</ul>
							</li>
							<li>
								<a href="#">Operaciones</a>
								<ul>
									<li>
										<a href="#">Jugadores</a>
										<ul>
											<li><a href="altajugador.jsp">Alta Jugador</a></li>
											<li><a href="bajajugador.jsp">Baja Jugador</a></li>
											<li><a href="modificarjugador1.jsp">Modificar Jugador</a></li>
										</ul>
									</li>
									<li>
										<a href="#">Equipos</a>
										<ul>
											<li><a href="altaequipo.jsp">Alta Equipo</a></li>
											<li><a href="bajaequipo.jsp">Baja Equipo</a></li>
											<li><a href="modificarequipo1.jsp">Modificar Equipo</a></li>
										</ul>
									</li>
									<li>
										<a href="#">Ligas</a>
										<ul>
											<li><a href="altaliga.jsp">Alta Liga</a></li>
											<li><a href="bajaliga.jsp">Baja Liga</a></li>
											<li><a href="modificarliga1.jsp">Modificar Liga</a></li>
										</ul>
									</li>
									<li>
										<a href="#">Cartas</a>
										<ul>
											<li><a href="#">Alta Carta</a></li>
											<li><a href="#">Baja Carta</a></li>
											<li><a href="#">Modificar Carta</a></li>
										</ul>
									</li>
								</ul>
							</li>
							<li ><a href="#">Simulador</a>
								<ul>
									<li><a href="#">Construye tu Equipo</a></li>
								</ul>
							</li>
						</ul>
					</nav>
				</div>
				<!-- Main -->
				<section class="wrapper style1" style="height:500px;">
					<div class="container">
						<div id="content">

							<!-- Content -->
							
								<article>
									
									<section class="col-6 col-12-narrower">
								<h3><%//=mensaje %></h3>
								
							</section>
								</article>
						</div>
					</div>
				</section>
										
			<!-- Footer -->
				<div id="footer">
					<div class="container">
						<div class="row">
							<section class="col-3 col-6-narrower col-12-mobilep">
								<h3>Listados</h3>
								<ul class="links">
									<li><a href="jugadores.asp">Listado de Jugadores</a></li>
									<li><a href="equipos.asp">Listado de Equipos</a></li>
									<li><a href="ligas.asp">Listado de Ligas</a></li>
								
								</ul>
							</section>
							<section class="col-3 col-6-narrower col-12-mobilep">
								<h3>Más Opciones</h3>
								<ul class="links">
									<li><a href="altaJugador.jsp">Alta Jugador</a></li>
									<li><a href="altaEquipo.jsp">Alta Equipo</a></li>
									<li><a href="altaLiga.jsp">Alta Liga</a></li>
									<li><a href="altaCarta.jsp">Alta Carta</a></li>
									<li><a href="modifiJugador.jsp">Modificar Jugador</a></li>
									<li><a href="modifiEquipo.jsp">Modificar Equipo</a></li>
									<li><a href="modifiLiga.jsp">Modificar Liga</a></li>
									<li><a href="modifiCarta.jsp">Modificar Carta</a></li>
								</ul>
							</section>
							<section class="col-6 col-12-narrower">
								<h3>Solicita Información</h3>
								<form>
									<div class="row gtr-50">
										<div class="col-6 col-12-mobilep">
											<input type="text" name="name" id="name" placeholder="Name" />
										</div>
										<div class="col-6 col-12-mobilep">
											<input type="email" name="email" id="email" placeholder="Email" />
										</div>
										<div class="col-12">
											<textarea name="message" id="message" placeholder="Message" rows="5"></textarea>
										</div>
										<div class="col-12">
											<ul class="actions">
												<li><input type="submit" class="button alt" value="Enviar Email" /></li>
											</ul>
										</div>
									</div>
								</form>
							</section>
						</div>
					</div>

					<!-- Icons -->
						<ul class="icons">
							<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
							<li><a href="#" class="icon fa-linkedin"><span class="label">LinkedIn</span></a></li>
							<li><a href="#" class="icon fa-google-plus"><span class="label">Google+</span></a></li>
						</ul>

					<!-- Copyright -->
						<div class="copyright">
							<ul class="menu">
								<li>&copy; FIFA 23. Todos los derechos reservados</li><li>Design: <a href="https://www.centronelson.org">Centro Nelson</a></li>
							</ul>
						</div>

				</div>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>
			<script src="assets/js/index.js"></script>
			<script src="assets/js/dropdown.js"></script>

</body>

</html>