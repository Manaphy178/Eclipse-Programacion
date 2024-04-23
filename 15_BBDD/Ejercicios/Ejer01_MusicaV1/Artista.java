package Ejer01_MusicaV1;

public class Artista {
	private String dni;
	private String nombre;

	public Artista() {
	}

	public Artista(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void mostrarDatos() {
		System.out.println("Nombre: "+this.nombre +" | DNI: "+ this.dni);
	}
}
