package NBA;

public class Estadistica {
	private String temporada;
	private Jugador jugador;
	private double puntos_por_partido;
	private double asistencias_por_partido;
	private double tapones_por_partido;
	private double rebotes_por_partido;
	
	public Estadistica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estadistica(String temporada, Jugador jugador, double puntos_por_partido, double asistencias_por_partido,
			double tapones_por_partido, double rebotes_por_partido) {
		super();
		this.temporada = temporada;
		this.jugador = jugador;
		this.puntos_por_partido = puntos_por_partido;
		this.asistencias_por_partido = asistencias_por_partido;
		this.tapones_por_partido = tapones_por_partido;
		this.rebotes_por_partido = rebotes_por_partido;
	}

	/**
	 * @return the temporada
	 */
	public String getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	/**
	 * @return the jugador
	 */
	public Jugador getJugador() {
		return jugador;
	}

	/**
	 * @param jugador the jugador to set
	 */
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	/**
	 * @return the puntos_por_partido
	 */
	public double getPuntos_por_partido() {
		return puntos_por_partido;
	}

	/**
	 * @param puntos_por_partido the puntos_por_partido to set
	 */
	public void setPuntos_por_partido(double puntos_por_partido) {
		this.puntos_por_partido = puntos_por_partido;
	}

	/**
	 * @return the asistencias_por_partido
	 */
	public double getAsistencias_por_partido() {
		return asistencias_por_partido;
	}

	/**
	 * @param asistencias_por_partido the asistencias_por_partido to set
	 */
	public void setAsistencias_por_partido(double asistencias_por_partido) {
		this.asistencias_por_partido = asistencias_por_partido;
	}

	/**
	 * @return the tapones_por_partido
	 */
	public double getTapones_por_partido() {
		return tapones_por_partido;
	}

	/**
	 * @param tapones_por_partido the tapones_por_partido to set
	 */
	public void setTapones_por_partido(double tapones_por_partido) {
		this.tapones_por_partido = tapones_por_partido;
	}

	/**
	 * @return the rebotes_por_partido
	 */
	public double getRebotes_por_partido() {
		return rebotes_por_partido;
	}

	/**
	 * @param rebotes_por_partido the rebotes_por_partido to set
	 */
	public void setRebotes_por_partido(double rebotes_por_partido) {
		this.rebotes_por_partido = rebotes_por_partido;
	}

	@Override
	public String toString() {
		return "Estadistica [temporada=" + temporada + ",\n\nId_jugador=" + this.jugador.getCodigo() + ",\n\npuntos_por_partido="
				+ puntos_por_partido + ",\n\nasistencias_por_partido=" + asistencias_por_partido
				+ ",\n\ntapones_por_partido=" + tapones_por_partido + ",\n\nrebotes_por_partido=" + rebotes_por_partido
				+ "]";
	}
	
	public String mostrarDatos() {
		return "temporada=" + temporada + "\nIdJugador=" + jugador.getCodigo() + "\npuntos_por_partido=" + puntos_por_partido
				+ "\nasistencias_por_partido=" + asistencias_por_partido + "\ntapones_por_partido="
				+ tapones_por_partido + "\nrebotes_por_partido=" + rebotes_por_partido
				+ "\n***************************************";
	}
	
}
