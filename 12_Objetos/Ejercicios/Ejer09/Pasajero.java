package Ejer09;

public class Pasajero {

	private String nombre;
	private String apellido;
	private int telefono;
	private String id;
	private int edad;

	public Pasajero() {

	}

	public Pasajero(String nombre, String apellido, int tlf, String id, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = tlf;
		this.edad = edad;
	}

	public Pasajero(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "*****************************" + "\n* Nombre y Apellido: " + this.nombre + " " + this.apellido
				+ "\n* ID: " + this.id + "\n* Edad: " + this.edad + "\n*" + "*****************************";
	}

	public boolean mayorEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public void sumaEdad(int num) {
		this.edad += num;
	}

	public void nombreSiMayorEdad(int num) {
		if (this.edad >= num) {
			System.out.println(this.nombre + " " + this.apellido);
		}
	}
}