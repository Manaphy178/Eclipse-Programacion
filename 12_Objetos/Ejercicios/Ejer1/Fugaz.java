package Ejer1;

public class Fugaz {
	private double velocidad;
	private double distancia;
	private double tamanno;
	private double intensidad;
	private int nVisualizaciones;

	public Fugaz() {
	}

	public Fugaz(double velocidad, double distancia, double tamanno, double intensidad, int nVisualizaciones) {
		super();
		this.velocidad = velocidad;
		this.distancia = distancia;
		this.tamanno = tamanno;
		this.intensidad = intensidad;
		this.nVisualizaciones = nVisualizaciones;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getTamanno() {
		return tamanno;
	}

	public void setTamanno(double tamanno) {
		this.tamanno = tamanno;
	}

	public double getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(double intensidad) {
		this.intensidad = intensidad;
	}

	public int getnVisualizaciones() {
		return nVisualizaciones;
	}

	public void setnVisualizaciones(int nVisualizaciones) {
		this.nVisualizaciones = nVisualizaciones;
	}

	public void imprimirEstrella() {
		System.out.println("Estrella Fugaz");
		System.out.println("******************************************************");
		System.out.println("Velocidad: " + this.velocidad);
		System.out.println("Distancia: " + this.distancia);
		System.out.println("Tamaño: " + this.tamanno);
		System.out.println("Intensidad: " + this.intensidad);
		System.out.println("Nº de veces vista: " + this.nVisualizaciones);
		System.out.println("******************************************************\r");
	}
}
