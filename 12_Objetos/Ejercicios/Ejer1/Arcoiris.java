package Ejer1;

public class Arcoiris {
	private int nColores;
	private double longitud;
	private double angulo;
	private String tipo;

	public Arcoiris() {
	}

	public Arcoiris(int nColores, double longitud, double angulo, String tipo) {
		super();
		this.nColores = nColores;
		this.longitud = longitud;
		this.angulo = angulo;
		this.tipo = tipo;
	}

	public int getnColores() {
		return nColores;
	}

	public void setnColores(int nColores) {
		this.nColores = nColores;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void imprimirArcoiris() {
		System.out.println("Arcoiris");
		System.out.println("******************************************************");
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Nº de colores: " + this.nColores);
		System.out.println("Longitud: " + this.longitud);
		System.out.println("Angulo: " + this.angulo);
		System.out.println("******************************************************\r");
	}
}
