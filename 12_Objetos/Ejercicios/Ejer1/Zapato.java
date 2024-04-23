package Ejer1;

public class Zapato {
	private String tipo;
	private String marca;
	private String color;
	private double talla;

	private double precio;
	private String tela;

	public Zapato() {
	}

	public Zapato(String tipo, String marca, String color, double talla, double precio, String tela) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.tela = tela;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public void imprimirZapato() {
		System.out.println("Zapato");
		System.out.println("******************************************************");
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Tela: " + this.tela);
		System.out.println("Color: " + this.color);
		System.out.println("Talla: " + this.talla);
		System.out.println("Precio: " + this.precio);
		System.out.println("******************************************************\r");
	}
}
