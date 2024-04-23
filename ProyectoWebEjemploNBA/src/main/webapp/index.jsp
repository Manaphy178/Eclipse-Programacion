<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Importo el paquete de NBA -->
<%@ page import="NBA.*"%>
<!-- Importo el java Util -->
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- Hacemos el codigo para el html -->
<%
BDController bd = new BDController();
ArrayList<Equipo> equipos = bd.todosEquipos();
%>
<style type="text/css">
table {
	border-collapse: collapse;
	border-color: #93a1a1;
	border-spacing: 0;
	border: 1px solid;
}

table td {
	background-color: #fdf6e3;
	border-color: #93a1a1;
	border-style: solid;
	border-width: 1px 0px;
	color: #002b36;
	font-family: Arial, sans-serif;
	font-size: 14px;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

table th {
	background-color: #657b83;
	border-color: #93a1a1;
	border-style: solid;
	border-width: 1px;
	color: #fdf6e3;
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

table td {
	border-color: #000000;
	text-align: center;
	vertical-align: top;
}

li {
	list-style: none;
}
</style>
<body>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Ciudad</th>
				<th>Conferencia</th>
				<th>Division</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (Equipo e : equipos) {
			%><tr>
				<td><%=e.getNombre()%></td>
				<td><%=e.getCiudad()%></td>
				<td><%=e.getConferencia()%></td>
				<td><%=e.getDivision()%></td>
			</tr>
			<%
			}
			%>

		</tbody>
	</table>
</body>
</html>