package Ejer05;

public class Padawan {
	private String nombre;
	private int edad;
	private int fuerza;
	private int potencial;
	private String planeta;

	public Padawan() {
	}

	public Padawan(String nombre, int edad, int fuerza, int potencial, String planeta) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fuerza = fuerza;
		this.potencial = potencial;
		this.planeta = planeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getPotencial() {
		return potencial;
	}

	public void setPotencial(int potencial) {
		this.potencial = potencial;
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	@Override
	public String toString() {
		return "Padawan :\nnombre= " + nombre + "\nedad= " + edad + "\nfuerza= " + fuerza + "\npotencial= " + potencial
				+ "\nplaneta= " + planeta;
	}

	public void incrementoPotencial(int incremento) {
		this.fuerza = this.fuerza + incremento;
	}

}
