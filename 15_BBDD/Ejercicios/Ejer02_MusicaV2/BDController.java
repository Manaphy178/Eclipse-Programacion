package Ejer02_MusicaV2;

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
		ArrayList<Artista> artis = new ArrayList<Artista>();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return artis;
	}

	public ArrayList<Cancion> todasCanciones() {
		ArrayList<Cancion> can = new ArrayList<Cancion>();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return can;
	}

	public ArrayList<Disco> todosDiscos() {
		ArrayList<Disco> disc = new ArrayList<Disco>();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return disc;
	}

	public ArrayList<Grupo> todosGrupos() {
		ArrayList<Grupo> grup = new ArrayList<Grupo>();
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("La cancion ya esta en un disco");
		}
	}
	public void sacarArtistaGrupo(String dni, String cod) {
		if (existeArtYGrp(dni, cod)) {
			String sql = "DELETE FROM pertenece WHERE dni LIKE '" + dni + "' AND cod LIKE '"+cod+"'";
			try {
				Statement mySt = con.createStatement();
				mySt.execute(sql);
				mySt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	

}
