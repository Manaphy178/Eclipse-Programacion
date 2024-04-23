package NBA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {

	private Connection conexion;

	public BDController() {
		super();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/nba","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el constructor del BDController" + e.getMessage());
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	public boolean existeDatoEnTabla(String tabla, String campo, String dato) {
        boolean existe = false;
            
        String sql = "SELECT * FROM " + tabla + " WHERE " + campo + " LIKE '" + dato + "'";
        
        try {
        	Statement myStatement = this.conexion.createStatement();
            ResultSet rs = myStatement.executeQuery(sql);
            
            while (rs.next()) {
                existe = true;
            }
            rs.close();
            myStatement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return existe;
    }
	
	public void insertarJugador(Jugador jugador) {
		
		String sql = "INSERT jugadores (codigo, Nombre, Procedencia, Altura, Peso, Posicion, Nombre_equipo) VALUES(" 
		+ jugador.getCodigo() + ",'" + jugador.getNombre() + "','" + jugador.getProcedencia() + "','"
		+ jugador.getAltura() + "'," + jugador.getPeso() + ",'" + jugador.getPosicion() + "','" + jugador.getNombre_equipo() + "');";
		
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeUpdate(sql);
			myStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void bajaJugador(int codigo) {
		
		String sql = "DELETE FROM jugadores WHERE codigo=" + codigo;
		
		
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeUpdate(sql);
			myStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public ArrayList<Equipo> dameEquipos() {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		String sql = "SELECT * FROM equipos";
		
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Equipo equipoAux = new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"), rs.getString("division"));
				equipos.add(equipoAux);
			}
			rs.close();
            myStatement.close();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return equipos;
	}
	
	public ArrayList<Jugador> dameJugadores() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT * FROM jugadores";
		
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Jugador jugadorAux = new Jugador(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("Procedencia"),
						rs.getString("Altura"),rs.getInt("Peso"), rs.getString("Posicion"),	rs.getString("Nombre_equipo"));
				jugadores.add(jugadorAux);
			}
			rs.close();
            myStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jugadores;
	}
	
	public Jugador dameJugador(String codigoJugador) {
		Jugador jugador = new Jugador();
		String sql = "SELECT * FROM jugadores WHERE codigo=" + codigoJugador;
		
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Jugador jugadorAux = new Jugador(rs.getInt("codigo"), rs.getString("nombre"),
						rs.getString("procedencia"), rs.getString("altura"), rs.getInt("peso"),
						rs.getString("posicion"), rs.getString("nombre_equipo"));
				jugador = jugadorAux;
			}
			rs.close();
			myStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jugador;
	}
	
	public void altaEstadistica(Estadistica estadisticas) {
		
		String sql = "INSERT estadisticas (temporada, jugador, puntos_por_partido,	asistencias_por_partido, tapones_por_partido, rebotes_por_partido) VALUES ("
				+ "('"+ estadisticas.getTemporada() +"', " + estadisticas.getJugador().getCodigo() + ", " + estadisticas.getPuntos_por_partido() + ", " + estadisticas.getAsistencias_por_partido()
				+ ", " + estadisticas.getTapones_por_partido() + ", " + estadisticas.getRebotes_por_partido() + ")";
		
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> todasTemporadas() {
		
		ArrayList<String> temporadas = new ArrayList<String>();
		String sql = "SELECT DISTINCT temporada FROM partidos";
		
		
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				temporadas.add(rs.getString("temporada"));
			}
			rs.close();
			myStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temporadas;
	}
	
	public ArrayList<String> nombreTodosEquipos() {
		ArrayList<String> equipos = new ArrayList<String>();
		
		String sql = "SELECT nombre FROM equipos";
		
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				equipos.add(rs.getString("nombre"));
			}
			rs.close();
			myStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return equipos;
	}
	
	public ArrayList<String> nombreTodosEquiposTemporada(String temporada) {
		
		ArrayList<String> equiposTemporada = new ArrayList<String>();
		
		String sql = "SELECT DISTINCT equipo_visitante FROM partidos WHERE temporada LIKE ?";
		
		try {
			PreparedStatement consultaPrep = conexion.prepareStatement(sql);
			consultaPrep.setString(1, temporada);
			ResultSet rs = consultaPrep.executeQuery();
			while (rs.next()) {
				equiposTemporada.add(rs.getString("equipo_visitante"));
			}
			rs.close();
			consultaPrep.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return equiposTemporada;
		
		
	}
	
	public ArrayList<Partido> todosPartidosUnaTemp (String temporada) {
		ArrayList<Partido> partidos = new ArrayList<Partido>();
		String sql = "SELECT * FROM partidos WHERE temporada =?";
		
		try {
			PreparedStatement consultaPrep = conexion.prepareStatement(sql);
			consultaPrep.setString(1, temporada);
			ResultSet rs = consultaPrep.executeQuery();
			while (rs.next()) {
				Equipo local = equipoSegunNombre(rs.getString("equipo_local"));
				Equipo visitante = equipoSegunNombre(rs.getString("equipo_visitante"));
				Partido partidoAux = new Partido(rs.getInt("codigo"), local, visitante,
				rs.getInt("puntos_local"), rs.getInt("puntos_visitante"), rs.getString("temporada"));
				partidos.add(partidoAux);
			}
			rs.close();
			consultaPrep.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return partidos;
	}
	
	public Equipo equipoSegunNombre(String nombre) {
		Equipo equipoAux = new Equipo();
		
		String sql = "SELECT * FROM equipos WHERE nombre LIKE ?";
		
		try {
			PreparedStatement consultaPrep = conexion.prepareStatement(sql);
			consultaPrep.setString(1, nombre);
			ResultSet rs = consultaPrep.executeQuery();
			while (rs.next()) {
				equipoAux = new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"), rs.getString("division"));
			}
			rs.close();
			consultaPrep.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return equipoAux;
	}
	
	public ArrayList<Jugador> jugadoresJueganEnEquipo(String nombreEquipo) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

		String sql = "SELECT * FROM jugadores WHERE nombre_equipo LIKE ?";
		
		try {
			PreparedStatement consultaPrep = conexion.prepareStatement(sql);
			consultaPrep.setString(1, nombreEquipo);
			ResultSet rs = consultaPrep.executeQuery();
			while (rs.next()) {
				Jugador jugadorAux = new Jugador(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("Procedencia"),
						rs.getString("Altura"),rs.getInt("Peso"), rs.getString("Posicion"),	rs.getString("Nombre_equipo"));
				jugadores.add(jugadorAux);
			}
			rs.close();
			consultaPrep.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jugadores;
	}
	
	public double pppJugadorTodasTemp(int codigoJugador){
		
		String sql = "SELECT puntos_por_partido FROM estadisticas WHERE jugador=?";
		double ppp = 0;
		
		try {
			PreparedStatement consultaPrep = conexion.prepareStatement(sql);
			consultaPrep.setInt(1, codigoJugador);
			
			ResultSet rs = consultaPrep.executeQuery();
			while (rs.next()) {
				ppp += rs.getDouble("puntos_por_partido");
			}
			rs.close();
			consultaPrep.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ppp;
	} 
	
	public ArrayList<Estadistica> estadisticasJug(int cod){
        ArrayList<Estadistica> estadisticas = new ArrayList<Estadistica>();
            
        String sql = "SELECT * FROM estadisticas, jugadores WHERE estadisticas.jugador = jugadores.codigo AND jugadores.codigo = " + cod;
        
        try {
            Statement myStatement = this.conexion.createStatement();
            ResultSet rs = myStatement.executeQuery(sql);
            while (rs.next()) {
            	Jugador jugadoraux = dameJugador(rs.getString("jugador"));
                Estadistica estaAux = new Estadistica(rs.getString("temporada"), jugadoraux, rs.getDouble("puntos_por_partido"), 
                        rs.getDouble("asistencias_por_partido"), rs.getDouble("tapones_por_partido"), rs.getDouble("rebotes_por_partido"));
                estadisticas.add(estaAux);
            }
            myStatement.close();
            rs.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return estadisticas;
    }
	
}
