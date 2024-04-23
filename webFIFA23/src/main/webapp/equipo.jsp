<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="fifa.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css" />
	<title>Proyecto Web FIFA23</title>
</head>
<% BDController bd = new BDController();
int codE= Integer.parseInt(request.getParameter("codE"));
Equipo e = bd.dameEquipo(codE);%>
<body class="is-preload">
		<div id="page-wrapper">
			<!-- Header -->
				<div id="header">

					<!-- Logo -->
						<h1><a href="index.jsp" id="logo">FIFA23</a></a></h1>

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
				<section class="wrapper style1">
					<div class="container">
						<div id="content">

							<!-- Content -->
							
								<article>
									<header>
									<img src="./images/equipos/<%=e.getCodE()%>.png" alt=""style="width:92px;height:92px;background-position:center">
										<h2><%=e.getNombre() %></h2>
									</header>
									
									<div class="table-wrapper">
								<table class="alt">
									<thead>
										<tr>
											<th>Nombre</th>
											<th width='325' colspan="3"></th>
											<th style="text-align: center;">RAT</th>
											<th style="text-align: center;">POS</th>
											<th style="text-align: center;">CARTA</th>
											<th style="text-align: center;">PRECIO</th>
											<th style="text-align: center;">SKI</th>
											<th style="text-align: center;">WF</th>
											<th style="text-align: center;">PAC</th>
											<th style="text-align: center;">SHO</th>
											<th style="text-align: center;">PAS</th>
											<th style="text-align: center;">DRI</th>
											<th style="text-align: center;">DEF</th>
											<th style="text-align: center;">PHI</th>
											<th style="text-align: center;">ALTURA</th>
										</tr>
									</thead>
									<tbody>
									<%
									for(Jugador j : bd.dameJugadoresEquipos(e.getCodE())){
																	 Carta c = bd.dameCarta(j.getCodJ()); 
																	 Liga l = bd.dameLigaEquipo(j.getCodE());
									%> 
										<tr>
											<td width='60' rowspan="2"><a href="jugador.jsp?codJ=<%=j.getCodJ()%>"><img src="./images/jugadores/<%=j.getCodJ()%>.png" alt="" style="width: 92px;height: 92px;min-width: 30%;background-position: center;"></a></td>
											<td width='325' colspan="3" style="padding-left: 15px;color: red;font-size: 1.25rem;"><a href="jugador.jsp?codJ=<%=j.getCodJ()%>"><%=j.getNombre() %></a></td>
											
												<td rowspan="2" width='60' style="text-align: center;"><div class="<%=Util.clase(c.getRat())%>"><%=c.getRat() %></div></td>	
												<td rowspan="2" width='60' style="text-align: center;"><%=c.getPos() %></td>	
												<td rowspan="2" width='100' style="text-align: center;"><%=c.getNombre() %></td>	
												<td rowspan="2" width='100' style="text-align: center;"><%=c.getPrecio() %></td>	
												<td rowspan="2" width='60' style="text-align: center;"><%=c.getFili() %></td>	
												<td rowspan="2" width='60' style="text-align: center;"><%=c.getPiernaM() %></td>
												
												<td rowspan="2" width='60' style="text-align: center;"><div class="<%=Util.clase(c.getPac())%>"><%=c.getPac() %></div></td>	
												
												<td rowspan="2" width='60' style="text-align: center;"><div class="<%=Util.clase(c.getSho())%>"><%=c.getSho() %></div></td>	
												
												<td rowspan="2" width='60' style="text-align: center;"><div class="<%=Util.clase(c.getPas())%>"><%=c.getPas() %></div></td>	
													
												<td rowspan="2" width='60' style="text-align: center;"><div class="<%=Util.clase(c.getDri())%>"><%=c.getDri() %></div></td>	
													
												<td rowspan="2" width='60' style="text-align: center;"><div class="<%=Util.clase(c.getDef())%>"><%=c.getDef() %></div></td>	
												
												<td rowspan="2" width='60' style="text-align: center;"><div class="<%=Util.clase(c.getPhy())%>"><%=c.getPhy() %></div></td>
												<td rowspan="2" width='60' style="text-align: center;"><%=j.getAltura() %> cm</td>
																						
										</tr>
										<tr>
										   <td width='45' style="text-align: right;"><a href="equipo.jsp?codE=<%=j.getCodE()%>"><img src="./images/equipos/<%=j.getCodE()%>.png" alt=""style="width:40px;height:40px;background-position:center"></a></td>
										  <td width='50' style="text-align: center;"><img src="./images/paises/<%=j.getPais()%>.png" alt=""style="width:40px;height:25px;background-position:center"></td>
										  <td width='230'><a href="liga.jsp?codL=<%=l.getCod()%>"><img src="./images/ligas/<%=l.getCod()%>.png" alt="" style="width:40px;height:40px; background-position:center;"></a></td>
										</tr>
										<%}%>
										
									</tbody>
								</table>
							</div>

									
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
									<li><a href="jugadores.asp">Listado de Ligas</a></li>
									
								
								</ul>
							</section>
							<section class="col-3 col-6-narrower col-12-mobilep">
								<h3>Más Opciones</h3>
								<ul class="links">
									<li><a href="operaciones.jsp?tipo=altaJugador">Opción 1</a></li>
									
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
</body>
</html>