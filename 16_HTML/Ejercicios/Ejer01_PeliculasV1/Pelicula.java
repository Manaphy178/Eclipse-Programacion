package Ejer01_PeliculasV1;

import java.util.*;

public class Pelicula {
	private int matricula;

	private String titulo;
	private int anno;
	private int coste;
	private String pais;
	private String director;
	private String guionista;
	private ArrayList<String> actores;

	public Pelicula() {
		super();
	}

	public Pelicula(int matricula, String titulo, int anno, int coste, String pais, String director, String guionista,
			ArrayList<String> actores) {
		super();
		this.matricula = matricula;
		this.titulo = titulo;
		this.anno = anno;
		this.coste = coste;
		this.pais = pais;
		this.director = director;
		this.guionista = guionista;
		this.actores = actores;
	}
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGuionista() {
		return guionista;
	}

	public void setGuionista(String guionista) {
		this.guionista = guionista;
	}

	public ArrayList<String> getActores() {
		return actores;
	}

	public void setActores(ArrayList<String> actores) {
		this.actores = actores;
	}

	public String actor() {
		String aux = "";
		for (int i = 0; i < actores.size(); i++) {
			if (i == actores.size() - 1) {
				aux += actores.get(i) + ".";
			} else {
				aux += actores.get(i) + ", ";
			}
		}
		return aux;
	}
}
