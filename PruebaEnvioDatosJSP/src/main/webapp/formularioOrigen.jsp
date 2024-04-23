<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>FormularioOrigen</title>
  </head>

  <body>
	<%
	String mensaje = "";
	if (request.getParameter("mensaje") != null) {
		mensaje = request.getParameter("mensaje");
	}
	%>
	<!-- Este ejemplo es para enviar datos del formulario a la base de datos, por ejemplo para dar de alta a un jugador
    Utilizando varios tipos de jsp. Por ejemplo:
        - Alta: para dar de alta
        - Baja: para dar de baja
        - Operaciones: es una pagina en blanco que solo contiene codigo java,
          es una pagina en blanco que envia las cosas a la base de datos-->
    <h1>Formulario de prueba</h1>
    <form action="./operaciones.jsp?tipo=AltaJugador" method="post">
      <input
        type="text"
        name="nombre"
        id="nombre"
        placeholder="Introduzca nombre y apellido"
        style="width: 450px"
        maxlength="30"
      />
      <br />
      <input
        type="text"
        name="ciudad"
        id="ciudad"
        placeholder="Introduzca ciudad de nacimiento"
        style="width: 450px"
        maxlength="30"
      />
      <br />
      <input
        type="number"
        name="edad"
        id="edad"
        placeholder="Edad"
        style="width: 80px"
        max="999"
        min="0"
      />

      <p>
        <input type="submit" value="Alta" /> &nbsp;
        <input type="reset" value="Borrar" />
      </p>
    </form>
    <p><%=mensaje %></p>
  </body>
</html>
