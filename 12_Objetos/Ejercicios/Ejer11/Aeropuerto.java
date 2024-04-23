package Ejer11;

import java.util.*;

public class Aeropuerto {

	private String nombre;
	private String ciudad;
	private String codAeropuerto;
	private ArrayList<Avion> aviones = new ArrayList<>();

	public Aeropuerto() {

	}

	public Aeropuerto(String nombre, String ciudad, String codAeropuerto, ArrayList<Avion> aviones) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codAeropuerto = codAeropuerto;
		this.aviones = aviones;
	}

	public Aeropuerto(String codAeropuerto) {
		this.codAeropuerto = codAeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCod() {
		return codAeropuerto;
	}

	public void setCod(String codAeropuerto) {
		this.codAeropuerto = codAeropuerto;
	}

	public String getCodAeropuerto() {
		return codAeropuerto;
	}

	public void setCodAeropuerto(String codAeropuerto) {
		this.codAeropuerto = codAeropuerto;
	}

	public ArrayList<Avion> getAviones() {
		return aviones;
	}

	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}

	public void mostrarDatos() {
		System.out.println("*****************************");
		System.out.println("* Aeropuerto: " + this.nombre);
		System.out.println("* Ciudad: " + this.ciudad);
		System.out.println("* Código: " + this.codAeropuerto);
		System.out.print("* Aviones: ");
		for (int i = 0; i < this.aviones.size(); i++) {
			System.out.print(this.aviones.get(i).getModeloAvion() + ", ");
		}
		System.out.println("\n*****************************");
	}

	@Override
	public String toString() {
		return "*****************************" + "\n* Aeropuerto: " + this.nombre + "\n* Ciudad: " + this.ciudad
				+ "\n* Código: " + this.codAeropuerto + "\n*" + "*****************************";
	}

	public boolean mostrarDatosCod(int num) {
		String aux = "";
		for (int i = 0; i < this.codAeropuerto.length(); i++) {
			if (Character.isLetter(this.codAeropuerto.charAt(i))) {
				break;
			} else {
				aux += this.codAeropuerto.charAt(i);
			}
		}
		int numero = Integer.parseInt(aux);
		if (numero < num) {
			return true;
		} else {
			return false;
		}
	}
}