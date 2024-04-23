package Ejer0_Opositores;

import java.sql.*;
import java.util.*;

public class BDController {
//	Creamos un atributo llamado conexion de la clase Connection para crear la conexion con la base de datos
	private Connection conexion;

	public BDController() {
		super();
//		Creamos la conexion de la base de datos directamente en el constructor vacion
//		Donde localhost tenemos que poner la ip del ordenador que tendria la base de datos y con el puerto 3306
//		La sintaxis de esto es = RutaDeLaBBDD (con el puerto), Usuario, Contraseña si es que tiene
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/opositores", "root", "");
		} catch (SQLException e) {
			System.out.println("Error en el constructor del BDControler " + e.getMessage());
			e.printStackTrace();
		}

	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

//	Aqui realizamos a todas las consultas a la BD
	public ArrayList<String> nombresOpo() {
		ArrayList<String> nombres = new ArrayList<String>();
//		La consulta siempre tiene que hacerse en un String aparte
		String consulta = "SELECT nombre FROM opositor";
		try {
//			Para hacer una consulta tenemos que utilizar un objeto de tipo Statement
//			Statement para hacer consultas
			Statement miStatement = this.conexion.createStatement();
//			Esta clase es necesaria para poder guardar los resultados de las consultas
			ResultSet rs = miStatement.executeQuery(consulta);
			while (rs.next()) {
				nombres.add(rs.getString("nombre"));
			}
//			Cerramos el statement
			miStatement.close();
//			Cerramos el resultset
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nombres;
	}

	public ArrayList<Opositor> todosOpo() {
		ArrayList<Opositor> opos = new ArrayList<Opositor>();
		String consulta = "SELECT * FROM opositor";
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(consulta);
			while (rs.next()) {
				opos.add(new Opositor(rs.getString("dni"), rs.getString("nombre"), rs.getString("ciudad"),
						rs.getString("telefono")));
			}
			miStatement.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return opos;
	}
}
