package Ejer01;

public class Flatulencia {
	private double duracion;
	private String tipo;
	private String olor;
	private int intensidad;
	private boolean sorpresa;

	public Flatulencia() {
	}

	public Flatulencia(double duracion, String tipo, String olor, int intensidad, boolean sorpresa) {
		super();
		this.duracion = duracion;
		this.tipo = tipo;
		this.olor = olor;
		this.intensidad = intensidad;
		this.sorpresa = sorpresa;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOlor() {
		return olor;
	}

	public void setOlor(String olor) {
		this.olor = olor;
	}

	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}

	public boolean isSorpresa() {
		return sorpresa;
	}

	public void setSorpresa(boolean sorpresa) {
		this.sorpresa = sorpresa;
	}

	public void imprimirPedo() {
		System.out.println("Te has cagado cabron");
		System.out.println("******************************************************");
		System.out.println("Duracion: " + this.duracion);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Olor: " + this.olor);
		System.out.println("Intensidad: " + this.intensidad);
		System.out.println("Sorpresa?: " + this.sorpresa);
		System.out.println("******************************************************\r");
	}
}
