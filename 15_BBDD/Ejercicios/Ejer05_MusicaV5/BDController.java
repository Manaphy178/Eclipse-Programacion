package Ejer05_MusicaV5;

import java.sql.*;
import java.util.*;

public class BDController {
	private Connection con;

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	
	public BDController() {
		super();
		try {
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musica20", "root", "");
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

	public ArrayList<Artista> todosArts() {
		ArrayList<Artista> artis = new ArrayList<>();
		String consul = "SELECT * FROM artista";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(consul);
			while (rs.next()) {
				artis.add(new Artista(rs.getString("dni"), rs.getString("nombre")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return artis;
	}

	public ArrayList<Cancion> todasCanciones() {
		ArrayList<Cancion> can = new ArrayList<>();
		String consul = "SELECT * FROM cancion";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(consul);
			while (rs.next()) {
				can.add(new Cancion(rs.getInt("cod"), rs.getString("titulo"), rs.getDouble("duracion")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return can;
	}

	public ArrayList<Disco> todosDiscos() {
		ArrayList<Disco> disc = new ArrayList<>();
		String consul = "SELECT * FROM disco";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(consul);
			while (rs.next()) {
				disc.add(new Disco(rs.getString("cod"), rs.getString("nombre"), rs.getString("fecha"),
						rs.getString("cod_comp"), rs.getString("cod_gru")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return disc;
	}

	public ArrayList<Grupo> todosGrupos() {
		ArrayList<Grupo> grup = new ArrayList<>();
		String consul = "SELECT * FROM grupo";
		try {
			Statement mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(consul);
			while (rs.next()) {
				grup.add(new Grupo(rs.getString("cod"), rs.getString("nombre"), rs.getString("fecha"),
						rs.getString("pais")));
			}
			rs.close();
			mySt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return grup;
	}

	public ArrayList<Cancion> borrarCancion(int cod) {

		String consul = "DELETE FROM cancion WHERE cod LIKE '" + cod + "' ";
		try {
			Statement mySt = con.createStatement();
			mySt.execute(consul);
			mySt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return todasCanciones();
	}

	public ArrayList<Artista> borrarArt(String dni) {
		String consul = "DELETE FROM artista WHERE dni LIKE '" + dni + "' ";
		try {
			Statement mySt = con.createStatement();
			mySt.execute(consul);
			mySt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return todosArts();
	}

	public ArrayList<Artista> altaArtista(String dni, String nombre) {
		String sql = "INSERT INTO ARTISTA (dni, nombre) VALUES('" + dni + "','" + nombre + "')";
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return todosArts();

	}

	public ArrayList<Cancion> altaCancion(int cod, String titulo, double duracion) {
		String sql = "INSERT INTO CANCION (cod,titulo,duracion) VALUES ('" + cod + "','" + titulo + "','" + duracion
				+ "')";
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return todasCanciones();
	}

	public ArrayList<Grupo> altaGrupo(String cod, String nombre, String fecha, String pais) {
		String sql = "INSERT INTO GRUPO (cod,nombre,fecha,pais) VALUES ('" + cod + "','" + nombre + "','" + fecha
				+ "','" + pais + "')";
		try {
			Statement mySt = con.createStatement();
			mySt.executeUpdate(sql);
			mySt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return todosGrupos();
	}

	public void altaArtGrup(String dni, String cod) {
		if (!existeArtYGrp(dni, cod)) {
			System.out.println("Cual es la funcion de este artista");
			String funcion = sc.nextLine();
			String sql = "INSERT INTO PERTENECE (dni,cod,funcion) VALUES('" + dni + "','" + cod + "','" + funcion
					+ "')";
			try {
				Statement mySt = con.createStatement();
				mySt.executeUpdate(sql);
				mySt.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		} else {
			System.out.println("El artista ya esta en un grupo");
		}
	}

	public void altaDiscYSong(String codD, int codC) {
		if (!existSongYDisc(codD, codC)) {
			String sql = "INSERT INTO ESTA (can,cod) VALUES ('" + codC + "','" + codD + "')";
			try {
				Statement mySt = con.createStatement();
				mySt.executeUpdate(sql);
				mySt.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		} else {
			System.out.println("La cancion ya esta en un disco");
		}
	}

	public void sacarArtistaGrupo(String dni, String cod) {
		if (existeArtYGrp(dni, cod)) {
			String sql = "DELETE FROM pertenece WHERE dni LIKE '" + dni + "' AND cod LIKE '" + cod + "'";
			try {
				Statement mySt = con.createStatement();
				mySt.execute(sql);
				mySt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	public boolean existeArtYGrp(String dni, String cod) {
		String sql = "SELECT * FROM pertenece WHERE dni LIKE '" + dni + "' AND cod LIKE '" + cod + "'";
		try {
			Statement myStatement = con.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next()) {

				return true;
			}
			rs.close();
			myStatement.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	public boolean existSongYDisc(String codD, int codC) {
		String sql = "SELECT * FROM esta WHERE can LIKE '" + codC + "' AND cod LIKE '" + codD + "'";
		try {
			Statement myStatement = con.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next()) {

				return true;
			}
			rs.close();
			myStatement.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	public void devolverCancionLarga(ArrayList<Cancion> canciones) {
		double cancion = duraciones(canciones);
		String sql = "SELECT titulo FROM cancion WHERE duracion LIKE '" + cancion + "'";
		Statement mySt;
		try {
			mySt = con.createStatement();
			mySt.execute(sql);
			mySt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	static double duraciones(ArrayList<Cancion> canciones) {
		double[] duraciones = new double[canciones.size()];
		for (int i = 0; i < duraciones.length; i++) {
			duraciones[i] = canciones.get(i).getDuracion();
		}
		duraciones = mayMen(duraciones);
		return duraciones[0];
	}

	static double[] mayMen(double[] numeros) {
		double num = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int x = i + 1; x < numeros.length; x++) {
				if (numeros[x] > numeros[i]) {
					num = numeros[i];
					numeros[i] = numeros[x];
					numeros[x] = num;
				}
			}
		}
		return numeros;
	}

	public ArrayList<Cancion> listadoCanciones(double dur) {
		ArrayList<Cancion> song = new ArrayList<>();
		String sql = "SELECT titulo FROM cancion WHERE duracion < " + dur;
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				song.add(new Cancion(rs.getInt("cod"), rs.getString("titulo"), rs.getDouble("duracion")));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return song;
	}

	public ArrayList<Cancion> listadoSongDisc(String cod) {
		ArrayList<Cancion> song = new ArrayList<>();
		String sql = "SELECT * FROM cancion,disco,esta WHERE esta.can=cancion.cod AND esta.cod=disco.cod AND esta.cod="
				+ cod;
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				song.add(new Cancion(rs.getInt("cod"), rs.getString("titulo"), rs.getDouble("duracion")));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return song;
	}

	public ArrayList<String> grupArch(String cod) {
		ArrayList<String> grup = new ArrayList<>();
		String sql = "SELECT titulo FROM cancion, esta, grupo WHERE grupo.cod=" + cod
				+ " AND esta.can=cancion.cod AND esta.cod=grupo.cod";

		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				grup.add(rs.getString("titulo"));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return grup;
	}

	public ArrayList<String> listadoArts(String cod) {
		ArrayList<String> arts = new ArrayList<>();
		String sql = "SELECT artista.nombre FROM artista, grupo, pertenece WHERE grupo.cod = " + cod
				+ " AND pertenece.dni = artista.dni AND pertenece.cod = grupo.cod";
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				arts.add(rs.getString("titulo"));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return arts;
	}

	public ArrayList<Disco> greaterSix() {
		ArrayList<Disco> disc = new ArrayList<>();
		String sql = "SELECT * FROM disco WHERE cod IN (SELECT cod FROM esta GROUP BY cod HAVING COUNT(can)>=6)";

		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				disc.add(new Disco(rs.getString("cod"), rs.getString("nombre"), rs.getString("fecha"),
						rs.getString("cod_comp"), rs.getString("cod_gru")));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return disc;
	}

	public ArrayList<String> noDisc() {
		ArrayList<String> titulos = new ArrayList<>();
		String sql = "SELECT titulo FROM cancion WHERE cod NOT IN(SELECT can FROM esta)";
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				titulos.add(rs.getString("nombre"));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return titulos;
	}

	public ArrayList<String> noGrupArt() {
		String sql = "SELECT nombre FROM artista WHERE dni NOT IN (SELECT dni FROM pertenece)";
		ArrayList<String> arts = new ArrayList<>();
		Statement mySt;
		try {
			mySt = con.createStatement();
			ResultSet rs = mySt.executeQuery(sql);
			while (rs.next()) {
				arts.add(rs.getString("nombre"));
			}
			mySt.close();
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return arts;
	}

}
