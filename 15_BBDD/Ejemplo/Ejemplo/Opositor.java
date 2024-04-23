package Ejemplo;

public class Opositor {
	private String nombre;
	private String dni;
	private String ciudad;
	private String telefono;

	public Opositor() {
	};

	public Opositor(String nombre, String dni, String ciudad, String telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
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

	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre + "\tDNI: " + this.dni + "\tCiudad: " + this.ciudad + "\tTelefono: "
				+ this.telefono);
	}

	@Override
	public String toString() {
		return "Opositor [dni=" + dni + ", nombre=" + nombre + ", ciudad=" + ciudad + ", telefono=" + telefono + "]";
	}

}
