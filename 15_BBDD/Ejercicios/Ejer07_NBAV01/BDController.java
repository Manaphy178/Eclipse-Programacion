package Ejer07_NBAV01;

import java.sql.*;
import java.util.*;

public class BDController {
	private Connection con;
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public BDController() {
		super();
		try {
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nba", "root", "");
		} catch (SQLException e) {
			System.out.println("Error en el constructor del BDControler");
			e.printStackTrace();
		}
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public ArrayList<Jugador> todosJugadores() {
		ArrayList<Jugador> jug = new ArrayList<Jugador>();
		String sql = "SELECT * FROM jugadores";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				jug.add(new Jugador(rs.getInt("codigo"), rs.getString("Nombre"), rs.getString("Procedencia"),
						rs.getString("Altura"), rs.getInt("Peso"), rs.getString("Posicion"),
						rs.getString("Nombre_equipo")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jug;
	}

	public ArrayList<Equipo> todosEquipos() {
		ArrayList<Equipo> equip = new ArrayList<Equipo>();
		String sql = "SELECT * FROM equipos";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				equip.add(new Equipo(rs.getString("Nombre"), rs.getString("Ciudad"), rs.getString("Conferencia"),
						rs.getString("Division")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equip;
	}

	public ArrayList<Estadistica> todasEstadisticas() {
		ArrayList<Estadistica> stats = new ArrayList<Estadistica>();
		String sql = "SELECT * FROM estadisticas";

		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				stats.add(new Estadistica(rs.getString("temporada"), rs.getInt("jugador"),
						rs.getFloat("Puntos_por_partido"), rs.getFloat("Asistencias_por_partido"),
						rs.getFloat("Tapones_por_partido"), rs.getFloat("Rebotes_por_partido")));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stats;
	}

	public ArrayList<Partido> todosPartidos() {
		ArrayList<Partido> partidos = new ArrayList<Partido>();
		String sql = "SELECT * FROM partidos";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				partidos.add(
						new Partido(rs.getInt("codigo"), rs.getString("equipo_local"), rs.getString("equipo_visitante"),
								rs.getInt("puntos_local"), rs.getInt("puntos_visitante"), rs.getString("temporada")));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return partidos;
	}

	public void altaJugador(int cod, String nombre, String procedencia, String altura, int peso, String posicion,
			String equipo) {
		String sql = "INSERT INTO JUGADORES (codigo,Nombre,Procedencia,Altura,Peso,Posicion,Nombre_equipo) VALUES('"
				+ cod + "','" + nombre + "','" + procedencia + "','" + altura + "','" + peso + "','" + posicion + "','"
				+ equipo + "')";
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("Se ha dado de alta al jugador");
	}
	public void bajaJugador(int cod) {
		if (existeJugador(cod)) {
			String sql = "DELETE FROM jugadores WHERE codigo LIKE '"+cod+"'";
			try {
				Statement mySt = con.createStatement();
				mySt.executeUpdate(sql);
				mySt.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			System.out.println("Se ha dado de baja al jugador");
		}else {
			System.out.println("El jugador que ha introducido no existe, le enviamos de vuelta al menu");
		}
	}

	public boolean existeJugador(int cod) {
		String sql = "SELECT * FROM jugadores WHERE codigo LIKE '" + cod + "'";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("El jugador existe");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("El jugador no existe");
		return false;

	}

	public boolean existeEquipo(String nombre) {
		String sql = "SELECT * FROM equipos WHERE Nombre LIKE '" + nombre + "'";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("El equipo existe");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("El equipo no existe");
		return false;
	}
}
