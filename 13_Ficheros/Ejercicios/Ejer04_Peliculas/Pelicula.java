package Ejer04_Peliculas;

public class Pelicula {
	private String cod;
	private String nombre;
	private int anno;
	private String estrella;
	private double coste;
	
	
	public Pelicula() {
		super();
	}
	public Pelicula(String cod, String nombre, int anno, String estrella, double coste) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.anno = anno;
		this.estrella = estrella;
		this.coste = coste;
	}
	public String getCod() {
		return cod;
	}
	public String getNombre() {
		return nombre;
	}
	public int getAnno() {
		return anno;
	}
	public String getEstrella() {
		return estrella;
	}
	public double getCoste() {
		return coste;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public void setEstrella(String estrella) {
		this.estrella = estrella;
	}
	public void setCoste(double coste) {
		this.coste = coste;
	}
	@Override
	public String toString() {
		return  cod + " || " + nombre + " || " + anno + " || " + estrella
				+ " || " + coste;
	}

}
