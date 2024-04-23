package Ejer0_Opositores;

public class Opositor {
	private String dni;
	private String nombre;
	private String ciudad;
	private String telefono;

	public Opositor() {
	};

	public Opositor(String dni, String nombre, String ciudad, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String mostrarDatos() {
		return "Nombre: " + this.nombre + "\tDNI: " + this.dni + "\tCiudad: " + this.ciudad + "\tTelefono: "
				+ this.telefono;
	}

	@Override
	public String toString() {
		return "Opositor [dni=" + dni + ", nombre=" + nombre + ", ciudad=" + ciudad + ", telefono=" + telefono + "]";
	}

}
