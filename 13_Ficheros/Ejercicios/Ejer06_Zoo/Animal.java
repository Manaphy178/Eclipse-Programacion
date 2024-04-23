package Ejer06_Zoo;

public class Animal {
	private String id;
	private double altura;
	private double peso;
	private int edad;
	private String especie;
	private String apodo;
	private String tipo = "\t"; // salvaje o domestico
	private String nivelFuerza; // bajo medio alto
	private boolean esMimoso;
	private String sonidoQueEmite;
	private String propietario;

	public Animal() {
	}

	public Animal(String id, double altura, double peso, int edad, String especie, String apodo, String tipo,
			String nivelFuerza, boolean esMimoso, String sonidoQueEmite, String propietario) {
		super();
		this.id = id;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
		this.especie = especie;
		this.apodo = apodo;
		this.tipo = tipo;
		this.nivelFuerza = nivelFuerza;
		this.esMimoso = esMimoso;
		this.sonidoQueEmite = sonidoQueEmite;
		this.propietario = propietario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNivelFuerza() {
		return nivelFuerza;
	}

	public void setNivelFuerza(String nivelFuerza) {
		this.nivelFuerza = nivelFuerza;
	}

	public boolean isEsMimoso() {
		return esMimoso;
	}

	public void setEsMimoso(boolean esMimoso) {
		this.esMimoso = esMimoso;
	}

	public String getSonidoQueEmite() {
		return sonidoQueEmite;
	}

	public void setSonidoQueEmite(String sonidoQueEmite) {
		this.sonidoQueEmite = sonidoQueEmite;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public void datos() {
		String mimoso = "NO";
		if (esMimoso) {
			mimoso = "SI";
		}
		System.out.print("\nID: " + id);
		System.out.print(" | Altura: " + altura);
		System.out.print(" | Peso: " + peso);
		System.out.print(" | Edad: " + edad);
		System.out.print(" | Especie: " + especie);
		System.out.print(" | Apodo: " + apodo);
		System.out.print(" | Tipo: " + tipo);
		System.out.print(" | Nivel Fuerza: " + nivelFuerza);
		System.out.print(" | Es mimoso: " + mimoso);
		System.out.print(" | Sonido: " + sonidoQueEmite);
		System.out.println(" | Propietario: " + propietario);

	}

	@Override
	public String toString() {
		String mimoso = "NO ES MIMOSO";
		if (esMimoso) {
			mimoso = "SI ES MIMOSO";
		}
		return id.toUpperCase() + "$$" + altura + "$$" + peso + "$$" + edad + "$$" + especie.toUpperCase() + "$$"
				+ apodo.toUpperCase() + "$$" + tipo.toUpperCase() + "$$" + nivelFuerza.toUpperCase() + "$$" + mimoso
				+ "$$" + sonidoQueEmite.toUpperCase() + "$$" + propietario.toUpperCase();
	}
}
