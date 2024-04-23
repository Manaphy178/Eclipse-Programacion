package Ejer1;

public class MVP {
	private String nombre;
	private String equipo;

	private int dorsal;
	private int goles;
	private int asistencias;
	private int faltas;
	private int pases;
	private int jornada;
	private int temporada;

	public MVP() {
	}

	public MVP(String nombre, String equipo, int dorsal, int goles, int asistencias, int faltas, int pases, int jornada,
			int temporada) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
		this.dorsal = dorsal;
		this.goles = goles;
		this.asistencias = asistencias;
		this.faltas = faltas;
		this.pases = pases;
		this.jornada = jornada;
		this.temporada = temporada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getPases() {
		return pases;
	}

	public void setPases(int pases) {
		this.pases = pases;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public void imprimirMVP() {
		System.out.println("MVP");
		System.out.println("******************************************************");
		System.out.println("Nombre del jugador: " + this.nombre);
		System.out.println("Nº de Dorsal: " + this.dorsal);
		System.out.println("Equipo: " + this.equipo);
		System.out.println("Nº de goles: " + this.goles);
		System.out.println("Nº de asistencias: " + this.asistencias);
		System.out.println("Nº de faltas: " + this.faltas);
		System.out.println("Nº de pases clave: " + this.pases);
		System.out.println("Nº de jornada: " + this.jornada);
		System.out.println("Nº de temporada: " + this.temporada);
		System.out.println("******************************************************\r");

	}
}
