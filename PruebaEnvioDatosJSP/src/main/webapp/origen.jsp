<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Origen</title>
</head>
<body>
	<%
	String nombre = "Jose Antonio Amilca";
	int num = 23;
	%>
	<h1>Origen</h1>
	<h1>
		<a href="./destino.jsp?parametro1=<%=nombre%>&parametro2=<%=num %>">Hipervinculo o enlace a destino</a>
	</h1>
</body>
</html>
