package Ejer13_TiendaVideojuegosV2;

import java.util.*;

public class Videojuego {
	private String nombre;
	private String categoria;
	private ArrayList<Personaje> personajes;

	public Videojuego() {
	}

	public Videojuego(String nombre, String categoria, ArrayList<Personaje> personajes) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.personajes = personajes;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setPersonajes(ArrayList<Personaje> personajes) {
		this.personajes = personajes;
	}

	public void letraInicioFinPersonaje(String letra) {
		for (Personaje p : this.personajes) {
			if (p.getNombre().toLowerCase().startsWith(letra) && p.getNombre().toLowerCase().endsWith(letra)) {
				System.out.println(p.getNombre());
			}
		}
	}

}
