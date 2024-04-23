package Ejemplos;

//Las calses que no ejecutamos en el main no tienen public (SOLO EL MAIN ES DONDE LAS CLASES SUBYACENTES DE LA CLASE PRINCIPAL NO LLEVAN MAIN)
//Es decir que no se ejecutan aqui
public class Coche {

//	Definimos los atributos de la Clase

	private String matricula;
	private String modelo;
	private String marca;
	private String color;
	private int cv;
	private double precio;

//	Creo los constructores de la clase
//	Creo el constructor vacio

	public Coche() {

	}

//	Creo el constructor con todos los atributos

	public Coche(String matricula, String modelo, String marca, String color, int cv, double precio) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
		this.cv = cv;
		this.precio = precio;

	}

//	Creo otro constructor con solo la matricula
	public Coche(String matricula) {
		this.matricula = matricula;
	}

//	Creo los getter y para obtener los valores de los atributos
	public String getMatricula() {
		return this.matricula;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getCv() {
		return this.cv;
	}

	public double getPrecio() {
		return this.precio;
	}

	public String getColor() {
		return this.color;
	}

	public String getMarcas() {
		return this.marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

//	Aqui creo los metodos particulares
	public void imprimirAtributos() {
		System.out.println("******************************************************");
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Color: " + this.color);
		System.out.println("Cv: " + this.cv);
		System.out.println("Precio: " + this.precio);
		System.out.println("******************************************************\r");

	}
}
