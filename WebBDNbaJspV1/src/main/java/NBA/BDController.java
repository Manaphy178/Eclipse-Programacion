package NBA;

import java.sql.*;
import java.util.*;
//import java.io.*;

public class BDController {
	private Connection con;
	static Scanner sn = new Scanner(System.in);
	static int lastpos = 0;
	static Scanner sc = new Scanner(System.in);

	public BDController() {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de mierda");
			e.printStackTrace();
		}
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

	public ArrayList<Jugador> todosJugadoresLakers() {
		ArrayList<Jugador> jug = new ArrayList<Jugador>();
		String sql = "SELECT * FROM jugadores WHERE Nombre_equipo LIKE 'Lakers'";
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

	public int experienciaJugadores(int codJ) {
		String exp = "";
		int experiencia = 0;
		String sql = "SELECT COUNT(*) AS 'experiencia' FROM estadisticas,jugadores WHERE jugadores.codigo = " + codJ
				+ " AND estadisticas.jugador = " + codJ;
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);

			experiencia = rs.getInt("experiencia");
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return experiencia;
	}
//
//	public ArrayList<Estadistica> todasEstadisticas() {
//		ArrayList<Estadistica> stats = new ArrayList<Estadistica>();
//		String sql = "SELECT * FROM estadisticas";
//
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				stats.add(new Estadistica(rs.getString("temporada"), rs.getInt("jugador"),
//						rs.getFloat("Puntos_por_partido"), rs.getFloat("Asistencias_por_partido"),
//						rs.getFloat("Tapones_por_partido"), rs.getFloat("Rebotes_por_partido")));
//			}
//			mySt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return stats;
//	}
//
//	public ArrayList<Partido> todosPartidos() {
//		ArrayList<Partido> partidos = new ArrayList<Partido>();
//		String sql = "SELECT * FROM partidos";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				partidos.add(
//						new Partido(rs.getInt("codigo"), rs.getString("equipo_local"), rs.getString("equipo_visitante"),
//								rs.getInt("puntos_local"), rs.getInt("puntos_visitante"), rs.getString("temporada")));
//			}
//			mySt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return partidos;
//	}
//
//	/*
//	 * Altas de cosas
//	 */
//
//	public void altaJugador(int cod, String nombre, String procedencia, String altura, int peso, String posicion,
//			String equipo) {
//		String sql = "INSERT INTO JUGADORES (codigo,Nombre,Procedencia,Altura,Peso,Posicion,Nombre_equipo) VALUES('"
//				+ cod + "','" + nombre + "','" + procedencia + "','" + altura + "','" + peso + "','" + posicion + "','"
//				+ equipo + "')";
//		try {
//			Statement mySt = con.createStatement();
//			mySt.executeUpdate(sql);
//			mySt.close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//		System.out.println("Se ha dado de alta al jugador");
//	}
//
//	public void altaStat(String temp, int jugador, float ppp, float app, float tpp, float rpp) {
//		String sql = "INSERT INTO estadisticas (temporada,jugador,Puntos_por_partido,Asistencias_por_partido,Tapones_por_partido,Rebotes_por_partido) VALUES ('"
//				+ temp + "','" + jugador + "','" + ppp + "','" + app + "','" + tpp + "','" + rpp + "')";
//		try {
//			Statement mySt = con.createStatement();
//			mySt.executeUpdate(sql);
//			mySt.close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//		System.out.println("Se ha dado de alta la estadistica");
//	}
//
//	public void registrarArch() {
//
//		ArrayList<Jugador> jugadores = jugadoresArch();
//		int registro = 0;
//		for (Jugador jugador : jugadores) {
//			if (!existeJugNom(jugador.getNombre())) {
//				String sql = "INSERT INTO JUGADORES (codigo,Nombre,Procedencia,Altura,Peso,Posicion,Nombre_equipo) VALUES('"
//						+ jugador.getCod() + "','" + jugador.getNombre() + "','" + jugador.getProcedencia() + "','"
//						+ jugador.getAltura() + "','" + jugador.getPeso() + "','" + jugador.getPosicion() + "','"
//						+ jugador.getNombre_equipo() + "')";
//				try {
//					Statement mySt = con.createStatement();
//					mySt.executeUpdate(sql);
//					mySt.close();
//					registro++;
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} else {
//				System.out.println("El jugador " + jugador.getNombre()
//						+ " no se ha podido de dar de alta ya que esta registrado en la base de datos");
//			}
//		}
//		System.out.println("Se han registrado " + registro + " de " + jugadores.size() + " jugadores exitosamente");
//	}
//
//	/*
//	 * Bajas de cosas
//	 */
//
//	public void bajaJugador(int cod) {
//		if (existeJugador(cod)) {
//			String sql = "DELETE FROM jugadores WHERE codigo LIKE '" + cod + "'";
//			try {
//				Statement mySt = con.createStatement();
//				mySt.executeUpdate(sql);
//				mySt.close();
//
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}
//			System.out.println("Se ha dado de baja al jugador");
//		} else {
//			System.out.println("El jugador que ha introducido no existe, le enviamos de vuelta al menu");
//		}
//	}
//
//	public void bajaEstadistica(String temp, int jugador) {
//		String sql = "DELETE FROM estadisticas WHERE temporada LIKE '" + temp + "' AND jugador LIKE '" + jugador + "'";
//		try {
//			Statement mySt = con.createStatement();
//			mySt.executeUpdate(sql);
//			mySt.close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//		System.out.println("Se ha dado de baja la estadistica");
//	}
//
//	/*
//	 * Existen Datos
//	 */
//
//	public boolean existeJugador(int cod) {
//		String sql = "SELECT * FROM jugadores WHERE codigo LIKE '" + cod + "'";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				System.out.println("El jugador existe");
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("El jugador no existe");
//		return false;
//
//	}
//
//	public boolean existeEquipo(String nombre) {
//		String sql = "SELECT * FROM equipos WHERE Nombre LIKE '" + nombre + "'";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				System.out.println("El equipo existe");
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("El equipo no existe");
//		return false;
//	}
//
//	public boolean existeJugStat(int cod, String temp) {
//		String sql = "SELECT * FROM estadisticas WHERE temporada LIKE '" + temp + "' AND jugador LIKE '" + cod + "'";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				System.out.println("El registro de la estadistica existe");
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("El registro de la estadistica no existe");
//		return false;
//	}
//
//	public boolean existeJugNom(String nombre) {
//		String sql = "SELECT * FROM jugadores WHERE Nombre LIKE '" + nombre + "'";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return false;
//	}
//
//	/*
//	 * Cosas Varias (Archivos, listas, etc)
//	 */
//
//	public ArrayList<String> jugonesArchList() {
//		ArrayList<String> stats = new ArrayList<String>();
//		String sql = "SELECT * FROM estadisticas, jugadores WHERE Puntos_por_partido >= 30";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				String nombre = rs.getString("Nombre");
//				String equipo = rs.getString("Nombre_equipo");
//				String temp = "Temporada " + rs.getString("temporada");
//				String puntos = String.valueOf(rs.getFloat("Puntos_por_partido")) + " puntos";
//				stats.add(nombre + " - " + equipo + " - " + temp + " - " + puntos);
//			}
//			mySt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return stats;
//	}
//
//	public void teamList(String team1, String team2) {
//		String sql = "SELECT * FROM partidos WHERE (equipo_local LIKE '" + team1 + "' AND equipo_visitante LIKE '"
//				+ team2 + "') OR (equipo_local LIKE '" + team2 + "' AND equipo_visitante LIKE '" + team1 + "')";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				System.out.println("Temporada: " + rs.getString("temporada") + " " + rs.getString("equipo_local") + " "
//						+ rs.getInt("puntos_local") + ":" + rs.getInt("puntos_visitante") + " "
//						+ rs.getString("equipo_visitante"));
//			}
//			mySt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public ArrayList<String> divisionList() {
//		ArrayList<String> div = new ArrayList<String>();
//		String sql = "SELECT * FROM equipos ORDER BY division";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				div.add(rs.getString("Nombre") + " " + rs.getString("Ciudad") + " " + rs.getString("Conferencia") + " "
//						+ rs.getString("Division"));
//			}
//			mySt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return div;
//	}
//
//	public ArrayList<Partido> winnersMatch(String team) {
//		ArrayList<Partido> match = new ArrayList<Partido>();
//		String sql = "SELECT * FROM partidos WHERE (equipo_local LIKE '" + team
//				+ "' AND puntos_local > puntos_visitante) OR (equipo_visitante LIKE '" + team
//				+ "' AND puntos_visitante > puntos_local)";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				match.add(
//						new Partido(rs.getInt("codigo"), rs.getString("equipo_local"), rs.getString("equipo_visitante"),
//								rs.getInt("puntos_local"), rs.getInt("puntos_visitante"), rs.getString("temporada")));
//			}
//			mySt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return match;
//	}
//
//	public ArrayList<Jugador> racistTownList(String pro, String conf, String div, String ciudad) {
//		ArrayList<Jugador> players = new ArrayList<Jugador>();
//		String sql = "SELECT * FROM jugadores WHERE Procedencia='" + pro
//				+ "' AND Nombre_equipo IN(SELECT Nombre FROM equipos WHERE Ciudad != '" + ciudad + "' AND Conferencia='"
//				+ conf + "' AND Division='" + div + "')";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(sql);
//			while (rs.next()) {
//				players.add(new Jugador(rs.getInt("codigo"), rs.getString("Nombre"), rs.getString("Procedencia"),
//						rs.getString("Altura"), rs.getInt("Peso"), rs.getString("Posicion"),
//						rs.getString("Nombre_equipo")));
//			}
//			rs.close();
//			mySt.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return players;
//	}
//
//	public void eastConf() {
//		String jugadores = "SELECT * FROM jugadores WHERE Nombre_equipo IN(SELECT Nombre FROM equipos WHERE Conferencia='East')";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(jugadores);
//			while (rs.next()) {
//
//				System.out.println(
//						rs.getString("Nombre") + " - " + rs.getString("Nombre_equipo") + " - " + rs.getString("Altura")
//								+ " pies - " + rs.getInt("Peso") + " libras - " + rs.getString("Posicion"));
//				String stat = "SELECT * FROM estadisticas WHERE jugador IN(SELECT codigo FROM jugadores WHERE codigo='"
//						+ rs.getInt("codigo") + "')";
//				System.out.println();
//				Statement scnSt = con.createStatement();
//				ResultSet rss = scnSt.executeQuery(stat);
//				while (rss.next()) {
//					System.out.println("\tTemporada " + rss.getString("temporada") + ": "
//							+ rss.getFloat("Puntos_por_partido") + "ppp, " + rss.getFloat("Asistencias_por_partido")
//							+ "app, " + rss.getFloat("Tapones_por_partido") + "tpp, "
//							+ rss.getFloat("Rebotes_por_partido") + "rpp");
//				}
//				rss.close();
//				scnSt.close();
//				System.out.println();
//			}
//			rs.close();
//			mySt.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	public void pacificDiv() {
//		String jugadores = "SELECT * FROM jugadores WHERE Nombre_equipo IN(SELECT Nombre FROM equipos WHERE Division='Pacific')";
//		try {
//			Statement mySt = con.createStatement();
//			ResultSet rs = mySt.executeQuery(jugadores);
//			while (rs.next()) {
//
//				System.out.println(
//						rs.getString("Nombre") + " - " + rs.getString("Nombre_equipo") + " - " + rs.getString("Altura")
//								+ " pies - " + rs.getInt("Peso") + " libras - " + rs.getString("Posicion"));
//				String stat = "SELECT * FROM estadisticas WHERE jugador IN(SELECT codigo FROM jugadores WHERE codigo='"
//						+ rs.getInt("codigo") + "')";
//				System.out.println();
//				Statement scnSt = con.createStatement();
//				ResultSet rss = scnSt.executeQuery(stat);
//				while (rss.next()) {
//					System.out.println("\tTemporada " + rss.getString("temporada") + ": "
//							+ rss.getFloat("Puntos_por_partido") + "ppp, " + rss.getFloat("Asistencias_por_partido")
//							+ "app, " + rss.getFloat("Tapones_por_partido") + "tpp, "
//							+ rss.getFloat("Rebotes_por_partido") + "rpp");
//				}
//				rss.close();
//				scnSt.close();
//				System.out.println();
//			}
//			rs.close();
//			mySt.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	public int getLastCod() {
//		if (lastpos == 0) {
//			ArrayList<Integer> cod = new ArrayList<Integer>();
//			String sql = "SELECT * FROM jugadores";
//			Statement mySt;
//			try {
//				mySt = con.createStatement();
//				ResultSet rs = mySt.executeQuery(sql);
//				while (rs.next()) {
//					cod.add(rs.getInt("codigo"));
//				}
//				mySt.close();
//				rs.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			Collections.sort(cod, Collections.reverseOrder());
//
//			lastpos = cod.get(0) + 1;
//
//		} else {
//			lastpos++;
//		}
//
//		return lastpos;
//	}
//
//	public ArrayList<Jugador> jugadoresArch() {
//		ArrayList<Jugador> play = new ArrayList<Jugador>();
//		String l = "";
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("altaJugador.txt"));
//			try {
//				l = br.readLine();
//				while (l != null) {
//					String[] separados = l.split("\\:\\:");
//					play.add(new Jugador(getLastCod(), separados[0], separados[1], separados[4],
//							Integer.valueOf(separados[3]), separados[2], separados[5]));
//					l = br.readLine();
//				}
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return play;
//	}
//
//	public void apalizados() {
//		String sql = "SELECT DISTINCT * FROM partidos WHERE ((equipo_local + 40) < equipo_visitante)  OR  (equipo_local > (equipo_visitante + 40))";
//	}
}
