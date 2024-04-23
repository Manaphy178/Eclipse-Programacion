package Ejer01;

public class fruto_seco {
	private String nombre;
	private int cal;
	private int grasas;
	private double precio;
	private String color;
	private boolean dulce;

	public fruto_seco() {

	}

	public fruto_seco(String nombre, int cal, int grasas, double precio, String color, boolean dulce) {
		this.nombre = nombre;
		this.cal = cal;
		this.grasas = grasas;
		this.precio = precio;
		this.color = color;
		this.dulce = dulce;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getColor() {
		return this.color;
	}

	public int getCal() {
		return this.cal;
	}

	public int getGrasas() {
		return this.grasas;
	}

	public double getPrecio() {
		return this.precio;
	}

	public boolean getDulce() {
		return this.dulce;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public void setGrasa(int grasas) {
		this.grasas = grasas;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setDulce(boolean dulce) {
		this.dulce = dulce;
	}

	public void imprimirFrutos() {
		System.out.println("Fruto Seco");
		System.out.println("******************************************************");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Calorias: " + this.cal);
		System.out.println("% de grasas: " + this.grasas + "%");
		System.out.println("Precio: " + this.precio + "€ por kg");
		System.out.println("Color: " + this.color);
		System.out.println("Es dulce?: " + this.dulce);
		System.out.println("******************************************************\r");

	}

}
