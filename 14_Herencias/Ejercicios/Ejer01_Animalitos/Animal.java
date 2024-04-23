package Ejer01_Animalitos;

public class Animal {
	private String id;
	private double altura;
	private double peso;
	private int edad;
	private String especie;
	private String apodo;
	private String tipo;

	public Animal() {
	}

	public Animal(String id, double altura, double peso, int edad, String especie, String apodo, String tipo) {
		super();
		this.id = id;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
		this.especie = especie;
		this.apodo = apodo;
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public int getEdad() {
		return edad;
	}

	public String getEspecie() {
		return especie;
	}

	public String getApodo() {
		return apodo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", altura=" + altura + ", peso=" + peso + ", edad=" + edad + ", especie=" + especie
				+ ", apodo=" + apodo + ", tipo=" + tipo + "]";
	}

}
