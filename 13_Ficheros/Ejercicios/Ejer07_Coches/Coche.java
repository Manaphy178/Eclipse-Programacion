package Ejer07_Coches;

import java.util.*;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double precio;
	private ArrayList<String> extra;

	public Coche(String matricula, String marca, String modelo, String color, double precio, ArrayList<String> extra) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.extra = extra;
	}

	public Coche() {
		super();
	}

	public ArrayList<String> getExtra() {
		return extra;
	}

	public void setExtra(ArrayList<String> extra) {
		this.extra = extra;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		String linea = matricula+";"+marca+";"+modelo+";"+color+";";
		if (extra!= null) {
			for (Iterator<String> it = extra.iterator(); it.hasNext();) {
			String ex = (String) it.next();
			if (it.hasNext()) {
				linea += ex + ", ";
			} else {
				linea += ex;
			}
		}
		}
		
		return linea;
	}

}
