<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Destino</title>
</head>
<body>
	<%
	String nombre = request.getParameter("parametro1");
	int num = Integer.parseInt(request.getParameter("parametro2")) ;
	%>
	<h1>Destino</h1>
<h1><%= nombre %></h1>
<h2>Tiene <%=num%> años</h2>
</body>
</html>
