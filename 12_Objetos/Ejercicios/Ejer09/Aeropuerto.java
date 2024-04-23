package Ejer09;

public class Aeropuerto {

	private String nombre;
	private String ciudad;
	private String codAeropuerto;

	public Aeropuerto() {

	}

	public Aeropuerto(String nombre, String ciudad, String codAeropuerto) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codAeropuerto = codAeropuerto;

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