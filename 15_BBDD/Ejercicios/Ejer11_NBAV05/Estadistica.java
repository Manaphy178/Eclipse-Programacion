package Ejer11_NBAV05;

public class Estadistica {
	private String temporada;
	private int jugador;
	private float pnt_partido;
	private float asist_partido;
	private float tapn_partido;
	private float rebt_partido;

	public Estadistica() {
		super();
	}

	public Estadistica(String temporada, int jugador, float pnt_partido, float asist_partido, float tapn_partido,
			float rebt_partido) {
		super();
		this.temporada = temporada;
		this.jugador = jugador;
		this.pnt_partido = pnt_partido;
		this.asist_partido = asist_partido;
		this.tapn_partido = tapn_partido;
		this.rebt_partido = rebt_partido;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public int getJugador() {
		return jugador;
	}

	public void setJugador(int jugador) {
		this.jugador = jugador;
	}

	public float getPnt_partido() {
		return pnt_partido;
	}

	public void setPnt_partido(float pnt_partido) {
		this.pnt_partido = pnt_partido;
	}

	public float getAsist_partido() {
		return asist_partido;
	}

	public void setAsist_partido(float asist_partido) {
		this.asist_partido = asist_partido;
	}

	public float getTapn_partido() {
		return tapn_partido;
	}

	public void setTapn_partido(float tapn_partido) {
		this.tapn_partido = tapn_partido;
	}

	public float getRebt_partido() {
		return rebt_partido;
	}

	public void setRebt_partido(float rebt_partido) {
		this.rebt_partido = rebt_partido;
	}
	
	public void mostrarDatos() {
		System.out.println("Temporada: " + temporada + " | Jugador: " + jugador + " | Puntos por partido: "
				+ pnt_partido + " | Asistencias por partido: " + asist_partido + " | Tapones por partido: "
				+ tapn_partido + " | Rebotes por partido: " + rebt_partido);
	}
}
