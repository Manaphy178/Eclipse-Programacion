package Ejer07;

import java.util.ArrayList;
import java.util.Arrays;

public class Disco {
	private String titulo;
	private int anopublicacion;
	private int coddisco;
	private String productor;
	private Cancion[] canciones;
	

	public Disco() {

	}

	public Disco(String titulo, int anopublicacion, int coddisco, String productor, Cancion[] canciones) {
		super();
		this.titulo = titulo;
		this.anopublicacion = anopublicacion;
		this.coddisco = coddisco;
		this.productor = productor;
		this.canciones = canciones;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnopublicacion() {
		return anopublicacion;
	}

	public void setAnopublicacion(int anopublicacion) {
		this.anopublicacion = anopublicacion;
	}

	public int getCoddisco() {
		return coddisco;
	}

	public void setCoddisco(int coddisco) {
		this.coddisco = coddisco;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public Cancion[] getCanciones() {
		return canciones;
	}

	public void setCanciones(Cancion[] canciones) {
		this.canciones = canciones;
	}

	@Override
	public String toString() {
		return "Disco\ntitulo: " + titulo + "\nanopublicacion: " + anopublicacion + "\ncoddisco: " + coddisco
				+ "\nproductor: " + productor + "\ncanciones: " + Arrays.toString(canciones);
	}

	public double DuracionTotal() {
		double duracion=0;
		for (int i = 0; i < canciones.length; i++) {
			duracion += this.canciones[i].getDuracion();
		}
		return duracion;
	}


}
