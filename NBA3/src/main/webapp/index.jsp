<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Importo el paquete NBA -->
<%@ page import="NBA.*" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi fucking NBA</title>
</head>


<style>

body{
    font-family: 'Courier New', Courier, monospace;
    padding: 2rem;
}

.table-jugador{
    width: 70%;
    margin: 0 auto;
    background-color: #032F4F;
    color: white;
    box-shadow: 2px 2px 7px black;
}

th{
    font-size: 1.5rem;
    padding: 1.5rem;
}

td{
    font-size: 1.2rem;
    text-align: center;
    height: 6rem;
    background-color: white;
    color: black;
}

p{
	font-size: 2.8rem;
	width: 100%;
	text-align: center;
}

</style>

<%
	BDController cbd = new BDController();
%>

<body>


<%for (Equipo e : cbd.dameEquipos()) {%>
	<p><%=e.getNombre() %>     2023-2024</p>
	<table class="table-jugador">
        <tr>
            <th colspan=1>Jugador</th>
            <th colspan=1>Posicion</th>
            <th colspan=1>Altura</th>
            <th colspan=1>Peso</th>
            <th colspan=1>País</th>
        </tr>
	<%for (Jugador j : cbd.jugadoresJueganEnEquipo(e.getNombre())) {%>
        <tr>
            <td colspan=1><%= j.getNombre() %></td>
            <td colspan=1><%= j.getPosicion() %></td>
            <td colspan=1><%= j.getAltura() %></td>
            <td colspan=1><%= j.getPeso() %> lbs</td>
            <td colspan=1><%= j.getProcedencia() %></td>
        </tr>
    <%}%>
	</table>
<%}%>

</body>
</html>
