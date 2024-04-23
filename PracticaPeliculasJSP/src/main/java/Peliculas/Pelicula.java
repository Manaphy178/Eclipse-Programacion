package Peliculas;

import java.util.*;

public class Pelicula {
	private int matricula;
	private String titulo;
	private int anno;
	private int duracion;
	private String pais;
	private String director;
	private String guionista;
	private String fotografo;
	private ArrayList<String> reparto;

	public Pelicula() {
		super();
	}

	public Pelicula(int matricula, String titulo, int anno, int duracion, String pais, String director,
			String guionista, String fotografo, ArrayList<String> reparto) {
		super();
		this.matricula = matricula;
		this.titulo = titulo;
		this.anno = anno;
		this.duracion = duracion;
		this.pais = pais;
		this.director = director;
		this.guionista = guionista;
		this.fotografo = fotografo;
		this.reparto = reparto;
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
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

	public String getFotografo() {
		return fotografo;
	}

	public void setFotografo(String fotografo) {
		this.fotografo = fotografo;
	}

	public ArrayList<String> getReparto() {
		return reparto;
	}

	public void setReparto(ArrayList<String> reparto) {
		this.reparto = reparto;
	}

	public String actor() {
		String aux = "";
		for (int i = 0; i < reparto.size(); i++) {
			if (i == reparto.size() - 1) {
				aux += reparto.get(i) + ".";
			} else {
				aux += reparto.get(i) + ", ";
			}
		}
		return aux;
	}
}
