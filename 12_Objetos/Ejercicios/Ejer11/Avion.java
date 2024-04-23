package Ejer11;

public class Avion {

	private String modeloAvion;
	private int capacidadPasajeros;
	private String matricula;
	private double capacidadDeposito;
	private int anoFabricadion;
	private Comandante comandante;

	public Avion() {

	}

	public Avion(String modelo, int capacidadPasajeros, String matricula, double capacidadDeposito, int anoFabricacion,
			Comandante comandante) {
		this.modeloAvion = modelo;
		this.capacidadPasajeros = capacidadPasajeros;
		this.matricula = matricula;
		this.capacidadDeposito = capacidadDeposito;
		this.anoFabricadion = anoFabricacion;
		this.comandante = comandante;

	}

	public Avion(String matricula) {
		this.matricula = matricula;
	}

	public String getModeloAvion() {
		return modeloAvion;
	}

	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setCapacidadDeposito(double capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	public int getAnoFabricadion() {
		return anoFabricadion;
	}

	public void setAnoFabricadion(int anoFabricadion) {
		this.anoFabricadion = anoFabricadion;
	}

	public Comandante getComandante() {
		return comandante;
	}

	public void setComandante(Comandante comandante) {
		this.comandante = comandante;
	}

	public void mostrarDatos() {
		System.out.println("*****************************");
		System.out.println("* Modelo Avión: " + this.modeloAvion);
		System.out.println("* Capacidad: " + this.capacidadPasajeros);
		System.out.println("* Matrícula: " + this.matricula);
		System.out.println("* Capacidad depósito: " + this.capacidadDeposito);
		System.out.println("* Año de Fabricación: " + this.anoFabricadion);
		System.out.println("* Comandante: " + this.comandante.getNombre() + " " + this.comandante.getApellido());
		System.out.println("*****************************");
	}

	@Override
	public String toString() {
		return "*****************************" + "\n* Modelo Avión: " + this.modeloAvion + "\n* Capacidad: "
				+ this.capacidadPasajeros + "\n* Matrícula: " + this.matricula + "\n* Capacidad depósito: "
				+ this.capacidadDeposito + "\n* Año de Fabricación: " + this.anoFabricadion + "\n*"
				+ "*****************************";
	}

}
