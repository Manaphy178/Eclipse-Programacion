<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Operaciones</title>
  </head>
  <body>
	<%
	String origen = request.getParameter("tipo");
	if (origen.equalsIgnoreCase("Altajugador")) {
		String nombre = request.getParameter("nombre");
		String ciudad = request.getParameter("ciudad");
		int edad = Integer.parseInt(request.getParameter("edad"));
		//bd.altajugador(nombre,ciudad,edad);
		response.sendRedirect("formularioOrigen.jsp?mensaje=Alta realizada exitosamente");
	}
	if (origen.equalsIgnoreCase("Bajajugador")) {
		String nombre = request.getParameter("nombre");
	}
	%>
	<%
	String nombre = request.getParameter("nombre");
	String ciudad = request.getParameter("ciudad");
	int edad = Integer.parseInt(request.getParameter("edad"));
	/*Aqui se llamaria al bdController para poder dar de alta o borrar*/
	%>

	<%=nombre%><br>
	<%=ciudad%><br>
	<%=edad%><br>

</body>
</html>
