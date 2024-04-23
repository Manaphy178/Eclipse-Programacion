package NBA;

public class Partido {

	private int codigo;
	private Equipo equipo_local;
	private Equipo equipo_visitante;
	private int puntos_local;
	private int puntos_visitante;
	private String temporada;
	
	
	public Partido(int codigo, Equipo equipo_local, Equipo equipo_visitante, int puntos_local, int puntos_visitante,
			String temporada) {
		super();
		this.codigo = codigo;
		this.equipo_local = equipo_local;
		this.equipo_visitante = equipo_visitante;
		this.puntos_local = puntos_local;
		this.puntos_visitante = puntos_visitante;
		this.temporada = temporada;
	}


	public Partido() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Equipo getEquipo_local() {
		return equipo_local;
	}


	public void setEquipo_local(Equipo equipo_local) {
		this.equipo_local = equipo_local;
	}


	public Equipo getEquipo_visitante() {
		return equipo_visitante;
	}


	public void setEquipo_visitante(Equipo equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}


	public int getPuntos_local() {
		return puntos_local;
	}


	public void setPuntos_local(int puntos_local) {
		this.puntos_local = puntos_local;
	}


	public int getPuntos_visitante() {
		return puntos_visitante;
	}


	public void setPuntos_visitante(int puntos_visitante) {
		this.puntos_visitante = puntos_visitante;
	}


	public String getTemporada() {
		return temporada;
	}


	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	
	@Override
	public String toString() {
		return "Partido [codigo=" + codigo + ", equipo_local=" + equipo_local + ", equipo_visitante=" + equipo_visitante
				+ ", puntos_local=" + puntos_local + ", puntos_visitante=" + puntos_visitante + ", temporada="
				+ temporada + "]";
	}


	public String mostrarDatos() {
		return "codigo=" + codigo + " \nequipo_local=" + equipo_local + " \nequipo_visitante=" + equipo_visitante
				+ " \npuntos_local=" + puntos_local + " \npuntos_visitante=" + puntos_visitante + " \ntemporada="
				+ temporada + " \n";
	}
	
	
	
	
	
}
