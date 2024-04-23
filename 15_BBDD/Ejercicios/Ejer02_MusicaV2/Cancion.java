package Ejer02_MusicaV2;

public class Cancion {
	private int cod;
	private String titulo;
	private double duracion;

	public Cancion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cancion(int cod, String titulo, double duracion) {
		super();
		this.cod = cod;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public int getCod() {
		return cod;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public void mostrarDatos() {
		System.out.println("Codigo: " + this.cod + " | Titulo: " + this.titulo + " | Duracion: " + this.duracion);
	}
}
