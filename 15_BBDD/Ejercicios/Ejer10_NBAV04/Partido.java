package Ejer10_NBAV04;

public class Partido {
	private int cod;
	private String local;
	private String visitante;
	private int ptn_local;
	private int ptn_visitante;
	private String temporada;

	public Partido() {
		super();
	}

	public Partido(int cod, String local, String visitante, int ptn_local, int ptn_visitante, String temporada) {
		super();
		this.cod = cod;
		this.local = local;
		this.visitante = visitante;
		this.ptn_local = ptn_local;
		this.ptn_visitante = ptn_visitante;
		this.temporada = temporada;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public int getPtn_local() {
		return ptn_local;
	}

	public void setPtn_local(int ptn_local) {
		this.ptn_local = ptn_local;
	}

	public int getPtn_visitante() {
		return ptn_visitante;
	}

	public void setPtn_visitante(int ptn_visitante) {
		this.ptn_visitante = ptn_visitante;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public void mostrarPuntuacion() {
		System.out.println(
				"Temporada: " + temporada + " | " + local + " " + ptn_local + ":" + ptn_visitante + " " + visitante);
	}

	public void mostrarDatos() {
		System.out.println("Codigo: " + cod + " | Equipo Local: " + local + " | Equipo Visitante: " + visitante
				+ " | Puntos Local: " + ptn_local + " | Puntos Visitantes: " + ptn_visitante + " | Temporada: "
				+ temporada);
	}
}
