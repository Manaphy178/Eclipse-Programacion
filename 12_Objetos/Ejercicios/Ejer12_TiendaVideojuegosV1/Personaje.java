package Ejer12_TiendaVideojuegosV1;

public class Personaje {
	private String nombre;
	private String tipo;

	public Personaje() {
	}

	public Personaje(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
