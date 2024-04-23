package Ejer10;

public class Avion {

	private String modeloAvion;
	private int capacidadPasajeros;
	private String matricula;
	private double capacidadDeposito;
	private int anoFabricadion;

	public Avion() {

	}

	public Avion(String modelo, int capacidadPasajeros, String matricula, double capacidadDeposito,
			int anoFabricacion) {
		this.modeloAvion = modelo;
		this.capacidadPasajeros = capacidadPasajeros;
		this.matricula = matricula;
		this.capacidadDeposito = capacidadDeposito;
		this.anoFabricadion = anoFabricacion;

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

	@Override
	public String toString() {
		return "*****************************" + "\n* Modelo Avión: " + this.modeloAvion + "\n* Capacidad: "
				+ this.capacidadPasajeros + "\n* Matrícula: " + this.matricula + "\n* Capacidad depósito: "
				+ this.capacidadDeposito + "\n* Año de Fabricación: " + this.anoFabricadion + "\n*"
				+ "*****************************";
	}

}
