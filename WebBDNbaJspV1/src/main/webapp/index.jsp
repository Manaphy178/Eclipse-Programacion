<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="NBA.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Jugadores</title>

</head>
<style>
body {
	font-family: "Arial", sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f0f2f5;
}

.roster-table {
	width: 80%;
	margin: 20px auto;
	border-collapse: collapse;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.roster-table th, .roster-table td {
	padding: 15px;
	text-align: left;
	border-bottom: 1px solid #eaeaea;
}

.roster-table th {
	background-color: #007bff;
	color: white;
	font-weight: normal;
}

.roster-table tr:hover {
	background-color: #f5f5f5;
}

.roster-table .player-img {
	width: 50px;
	height: 50px;
	border-radius: 50%;
	vertical-align: middle;
	margin-right: 10px;
}

.player-name {
	display: inline-block;
	vertical-align: middle;
}

.header {
	text-align: center;
	padding: 20px;
}

.header h1 {
	margin: 0;
	color: #333;
}
</style>
<%
BDController bd = new BDController();
ArrayList<Jugador> jugadores = bd.todosJugadoresLakers();
%>
<body>

	<div class="header">
		<h1>Team Lakers</h1>
	</div>
	<table class="roster-table">
		<thead>
			<tr>
				<th>Jugador</th>
				<th>Equipo</th>
				<th>Pos</th>
				<th>Alt</th>
				<th>Peso</th>
				<th>Experiencia</th>
				<th>País</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (Jugador j : jugadores) {
			%>
			<tr>
				<td><img src="./jugadores_Lakers/<%=j.getCod()%>.png" alt=""
					class="player-img" /> <span class="player-name"><%=j.getNombre()%></span></td>
				<td><%=j.getNombre_equipo()%></td>
				<td><%=j.getPosicion()%></td>
				<td><%=j.metros()%> M</td>
				<td><%=j.kilos()%> Kilogramos</td>
				<td><%=bd.experienciaJugadores(j.getCod())%></td>
				<td><%=j.getProcedencia()%></td>

			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>
