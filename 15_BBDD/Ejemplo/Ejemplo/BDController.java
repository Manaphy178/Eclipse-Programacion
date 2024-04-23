package Ejemplo;

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

//	Dar de alta a opositor
	public void altaOpoistor(String nombre, String dni, String ciudad, String tlf) {
		String sql = "INSERT INTO OPOSITOR (nombre, dni, telefono, ciudad) VALUES ('" + nombre + "','" + dni + "','"
				+ tlf + "','" + ciudad + "')";
		System.out.println("Sql lanzada: " + sql);
		try {
			Statement mySt = conexion.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminarOpositor(String dni) {
		String sql = "DELETE FROM opositor WHERE dni LIKE '" + dni + "' ";
		System.out.println(sql);
		try {
			Statement mySt = conexion.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	Modificar opositor
	public void modificarOpositor(Opositor opo) {
		String sql = "UPDATE opositor SET nombre = '" + opo.getNombre() + "' , telefono = '" + opo.getTelefono()
				+ "' ,ciudad = '" + opo.getCiudad() + "'" + " WHERE dni='" + opo.getDni() + "'";
		System.out.println(sql);
		try {
			Statement mySt = conexion.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean existeOpositor(String dni) {
		String consulta = "SELECT * FROM opositor WHERE dni LIKE '" + dni + "'";
		try {
			Statement myStatement = conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(consulta);
			if (rs.next()) {
				System.out.println("si");
				return true;
			}
			rs.close();
			myStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("no");
		return false;
	}

	public ArrayList<Opositor> opositroNomCiuPreparada(String nombre, String ciudad) {
		ArrayList<Opositor> opos = new ArrayList<>();
		String sql = "SELECT * FROM opositor WHERE ciudad LIKE ? AND nombre LIKE ?";
		Statement myStatement;
		try {
			myStatement = conexion.createStatement();
			PreparedStatement consultaPre = conexion.prepareStatement(sql);
			consultaPre.setString(1, ciudad);
			consultaPre.setString(2, nombre);
			ResultSet rs = consultaPre.executeQuery();
			while (rs.next()) {
				opos.add(new Opositor(rs.getString("dni"), rs.getString("nombre"), rs.getString("ciudad"),
						rs.getString("telefono")));
			}
			rs.close();
			myStatement.close();
			consultaPre.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return opos;
	}
}
