package Ejemplo1;
/*
 * Clase Padre
 */
public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private String t_combustible;
	private int cc;
	private int cv;
	private int consumo;

	public Vehiculo() {
		super();
	}

	public Vehiculo(String matricula, String marca, String modelo, String t_combustible, int cc, int cv, int consumo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.t_combustible = t_combustible;
		this.cc = cc;
		this.cv = cv;
		this.consumo = consumo;
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

	public String getT_combustible() {
		return t_combustible;
	}

	public int getCc() {
		return cc;
	}

	public int getCv() {
		return cv;
	}

	public int getConsumo() {
		return consumo;
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

	public void setT_combustible(String t_combustible) {
		this.t_combustible = t_combustible;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", t_combustible="
				+ t_combustible + ", cc=" + cc + ", cv=" + cv + ", consumo=" + consumo + "]";
	}

	public double indiceFia() {
		return ((this.cc + this.cv) / this.consumo);
	}
}
