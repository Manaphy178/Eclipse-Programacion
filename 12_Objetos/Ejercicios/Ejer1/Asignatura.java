package Ejer1;

public class Asignatura {
	private String denominacion;
	private String nombre_profe;
	private int dificultad;
	private int ciclo;
	private String[] dnis;

	public Asignatura() {

	}

	public Asignatura(String denominacion, String nombre_profe, int dificultad, int ciclo, String[] dNIs) {
		super();
		this.denominacion = denominacion;
		this.nombre_profe = nombre_profe;
		boolean bien = true;
		do {
			if (dificultad >= 0 && dificultad <= 10) {
				this.dificultad = dificultad;
				bien = false;
			} else {
				System.out.println("La dificultad es de 0 a 10");
			}
		} while (bien);
		this.ciclo = ciclo;
		dnis = dNIs;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public String getNombre_profe() {
		return nombre_profe;
	}

	public int getDificultad() {
		return dificultad;
	}

	public int getCiclo() {
		return ciclo;
	}

	public String[] getDnis() {
		return dnis;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setNombre_profe(String nombre_profe) {
		this.nombre_profe = nombre_profe;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public void setDnis(String[] dnis) {
		this.dnis = dnis;
	}

	public void imprimirAsignatura() {
		System.out.println("Asignatura");
		System.out.println("******************************************************");
		System.out.println("Asignatura: " + this.denominacion);
		System.out.println("Nombre Profesor: " + this.nombre_profe);
		System.out.println("Dificultad: " + this.dificultad);
		System.out.println("Ciclo el que pertenece: " + this.ciclo);
		System.out.println("DNIs de los alumnos: ");
		for (int i = 0; i < dnis.length; i++) {
			System.out.println("\tAlumno " + (i + 1) + ":" + this.dnis[i]);
		}
		System.out.println("******************************************************\r");

	}
}
