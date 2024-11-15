package Ejer05;

public class Jedi {

	private String nombre;
	private int edad;
	private int fuerza;
	private String planeta;
	private String color_laser;

	public Jedi() {
	}

	public Jedi(String nombre, int edad, int fuerza, String planeta, String color_laser) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fuerza = fuerza;
		this.planeta = planeta;
		this.color_laser = color_laser;
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

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	public String getColor_laser() {
		return color_laser;
	}

	public void setColor_laser(String color_laser) {
		this.color_laser = color_laser;
	}

	@Override
	public String toString() {
		return "Jedi :\nnombre= " + nombre + "\nedad= " + edad + "\nfuerza= " + fuerza + "\nplaneta= " + planeta
				+ "\ncolor_laser= " + color_laser;
	}

	public void degradacionFuerza(int degradacion) {
		this.fuerza = this.fuerza - degradacion;
	}

}
