package fifa;

import java.sql.*;
import java.util.*;

public class BDController {
	private Connection con;

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
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fifa23", "root", "");
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

	public ArrayList<Equipo> dameEquiposLiga(int cod) {
		ArrayList<Equipo> eq = new ArrayList<Equipo>();
		String sql = "SELECT * FROM equipos WHERE cod_liga = " + cod;
		Statement mySt;
		try {
			mySt = con.createStatement();

			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				eq.add(new Equipo(rs.getInt("cod_equipo"), rs.getString("nombre"), rs.getInt("cod_liga")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return eq;
	}

	public Equipo dameEquipo(int cod) {
		Equipo eq = new Equipo();
		String sql = "SELECT * FROM equipos WHERE cod_equipo = " + cod;
		Statement mySt;
		try {
			mySt = con.createStatement();

			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				eq = new Equipo(rs.getInt("cod_equipo"), rs.getString("nombre"), rs.getInt("cod_liga"));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return eq;
	}

	public boolean existeEquipo(int cod) {
		for (Equipo e : todosEquipos()) {
			if (e.getCodE() == cod) {
				return true;
			}
		}
		return false;
	}

	public boolean existeEquipoNom(String nom) {
		for (Equipo e : todosEquipos()) {
			if (e.getNombre().equalsIgnoreCase(nom)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Equipo> todosEquipos() {
		ArrayList<Equipo> eq = new ArrayList<>();
		String sql = "SELECT * FROM equipos";
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				eq.add(new Equipo(rs.getInt("cod_equipo"), rs.getString("nombre"), rs.getInt("cod_liga")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return eq;
	}

	public void bajaEquipo(int cod) {
		String sql = "DELETE FROM equipos WHERE cod_equipo = " + cod;
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void altaEquipo(int codE, String nombre, int codL) {
		String sql = "INSERT equipos (cod_equipo, nombre, cod_liga) VALUES (" + codE + ",'" + nombre + "'," + codL
				+ ")";
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateEquipo(int codE, String nombre, int codL) {
		String sql = "UPDATE equipos SET nombre='" + nombre + "',cod_liga=" + codL + " WHERE cod_equipo=" + codE;
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Jugador dameJugador(int cod) {
		Jugador jug = new Jugador();
		String sql = "SELECT * FROM jugadores WHERE cod_jugador = ?";

		try {
			PreparedStatement mySt = con.prepareStatement(sql);
			mySt.setInt(1, cod);
			ResultSet rs = mySt.executeQuery();
			while (rs.next()) {
				jug = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"),
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jug;
	}

	public ArrayList<Jugador> dameJugadoresEquipos(int cod) {
		ArrayList<Jugador> jug = new ArrayList<>();
		String sql = "SELECT * FROM jugadores WHERE cod_equipo = " + cod;

		try {
			Statement mySt = con.createStatement();

			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				jug.add(new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"),
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jug;
	}

	public boolean existeJugador(int cod) {
		for (Jugador j : todosJugadores()) {
			if (j.getCodJ() == cod) {
				return true;
			}
		}
		return false;
	}

	public int dameCodUltJug() {
		int num = 0;
		String sql = "SELECT cod_jugador FROM jugadores ORDER BY cod_jugador DESC LIMIT 1";
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				num = rs.getInt("cod_jugador");
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	public int dameJugCod(String nom) {
		int num = 0;
		String sql = "SELECT cod_jugador FROM jugadores WHERE nombre LIKE '" + nom + "'";
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				num = rs.getInt("cod_jugador");
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	public ArrayList<Jugador> todosJugadores() {
		ArrayList<Jugador> jug = new ArrayList<>();
		String sql = "SELECT * FROM jugadores";
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				jug.add(new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"),
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jug;
	}

	public void altaJugador(int cod, String nombre, String pierna, int equipo, String pais, int altura) {
		String sql = "INSERT jugadores (cod_jugador, nombre, cod_equipo, pierna, altura, pais) VALUES (" + cod + ",'"
				+ nombre + "'," + equipo + ",'" + pierna + "'," + altura + ",'" + pais + "')";
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void bajaJugador(int cod) {
		String sql = "DELETE FROM jugadores WHERE cod_jugador =" + cod;
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateJugador(int cod, String nombre, String pierna, int equipo, String pais, int altura) {
		String sql = "UPDATE jugadores SET nombre='" + nombre + "',cod_equipo=" + equipo + ",pierna='" + pierna
				+ "',altura=" + altura + ",pais='" + pais + "' WHERE cod_jugador=" + cod;
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Liga dameLigaEquipo(int cod) {
		Equipo eq = dameEquipo(cod);
		Liga lig = new Liga();
		String sql = "SELECT * FROM ligas WHERE cod_liga = " + eq.getCodL();

		try {
			Statement mySt = con.createStatement();

			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				lig = new Liga(rs.getInt("cod_liga"), rs.getString("nombre"), rs.getString("pais"));

			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lig;

	}

	public Liga dameLiga(int cod) {

		Liga lig = new Liga();
		String sql = "SELECT * FROM ligas WHERE cod_liga = " + cod;

		try {
			Statement mySt = con.createStatement();

			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				lig = new Liga(rs.getInt("cod_liga"), rs.getString("nombre"), rs.getString("pais"));

			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lig;

	}

	public boolean existeLiga(int cod) {
		for (Liga l : todasLigas()) {
			if (l.getCod() == cod) {
				return true;
			}
		}
		return false;
	}

	public boolean existeLigaNom(String nom) {
		for (Liga l : todasLigas()) {
			if (l.getNombre().equalsIgnoreCase(nom)) {
				return true;
			}
		}
		return false;
	}

	public void bajaLiga(int cod) {
		String sql = "DELETE FROM ligas WHERE cod_liga =" + cod;
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void altaLiga(int codL, String nombre, String pais) {
		String sql = "INSERT ligas (cod_liga, nombre, pais) VALUES (" + codL + ",'" + nombre + "','" + pais + "')";
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateLiga(int codL, String nombre, String pais) {
		String sql = "UPDATE ligas SET nombre='" + nombre + "',pais='" + pais + "' WHERE cod_liga=" + codL;
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Liga> todasLigas() {
		ArrayList<Liga> lig = new ArrayList<>();
		String sql = "SELECT * FROM ligas";
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				lig.add(new Liga(rs.getInt("cod_liga"), rs.getString("nombre"), rs.getString("pais")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lig;

	}

	public Carta dameCarta(int cod) {
		Carta car = new Carta();
		String sql = "SELECT * FROM cartas WHERE cod_jugador = " + cod;
		Statement mySt;
		try {
			mySt = con.createStatement();

			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				car = new Carta(rs.getString("nombre"), rs.getInt("cod_jugador"), rs.getInt("rat"), rs.getString("pos"),
						rs.getInt("precio"), rs.getInt("pac"), rs.getInt("sho"), rs.getInt("pas"), rs.getInt("dri"),
						rs.getInt("def"), rs.getInt("phy"), rs.getInt("pierna_mala"), rs.getInt("filigranas"));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}

	public Carta dameCartaEspecifica(int cod, String nombre) {
		Carta car = new Carta();
		String sql = "SELECT * FROM cartas WHERE cod_jugador = " + cod + " AND nombre = '" + nombre + "'";
		Statement mySt;
		try {
			mySt = con.createStatement();

			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				car = new Carta(rs.getString("nombre"), rs.getInt("cod_jugador"), rs.getInt("rat"), rs.getString("pos"),
						rs.getInt("precio"), rs.getInt("pac"), rs.getInt("sho"), rs.getInt("pas"), rs.getInt("dri"),
						rs.getInt("def"), rs.getInt("phy"), rs.getInt("pierna_mala"), rs.getInt("filigranas"));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}

	public boolean existeCarta(int cod, String nombre) {
		for (Carta c : todasCartas()) {
			if (c.getCod() == cod && c.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Carta> todasCartas() {
		ArrayList<Carta> car = new ArrayList<>();
		String sql = "SELECT * FROM cartas";
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				car.add(new Carta(rs.getString("nombre"), rs.getInt("cod_jugador"), rs.getInt("rat"),
						rs.getString("pos"), rs.getInt("precio"), rs.getInt("pac"), rs.getInt("sho"), rs.getInt("pas"),
						rs.getInt("dri"), rs.getInt("def"), rs.getInt("phy"), rs.getInt("pierna_mala"),
						rs.getInt("filigranas")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}

	public ArrayList<Carta> dameCartas(int cod) {
		ArrayList<Carta> car = new ArrayList<>();
		String sql = "SELECT * FROM cartas WHERE cod_jugador =" + cod;
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				car.add(new Carta(rs.getString("nombre"), rs.getInt("cod_jugador"), rs.getInt("rat"),
						rs.getString("pos"), rs.getInt("precio"), rs.getInt("pac"), rs.getInt("sho"), rs.getInt("pas"),
						rs.getInt("dri"), rs.getInt("def"), rs.getInt("phy"), rs.getInt("pierna_mala"),
						rs.getInt("filigranas")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}

	public int nextCode(String tabla, String clave) {
		int code = 0;
		String sql = "SELECT " + clave + " FROM " + tabla + " ORDER BY " + clave + " DESC LIMIT 1";
		try {
			Statement myStatement = con.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				code = rs.getInt(clave.toString());
			}
			rs.close();
			myStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return code;
	}
}
