package Ejer05_Pacientes;

public class Paciente {
	private int cod;
	private String nombre;
	private String ape;
	private String dir;
	private String poblacion;
	private String telefono;
	private int postal;
	private String nacimiento;

	public Paciente() {
		super();
	}

	public Paciente(int cod, String nombre, String ape, String dir, String poblacion, String telefono, int postal,
			String nacimiento) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.ape = ape;
		this.dir = dir;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.postal = postal;
		this.nacimiento = nacimiento;
	}

	public int getCod() {
		return cod;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApe() {
		return ape;
	}

	public String getDir() {
		return dir;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getPostal() {
		return postal;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setPostal(int postal) {
		this.postal = postal;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public void nombreCompleto() {
		System.out.println(this.nombre.toUpperCase() + " " + this.ape.toUpperCase());
	}

	public void codigoTelefono() {
		System.out.println("Codigo: " + this.cod + " | Telefono: " + this.telefono);
	}

	@Override
	public String toString() {
		return cod + "|" + nombre.toUpperCase() + "|" + ape.toUpperCase() + "|" + dir.toUpperCase() + "|"
				+ poblacion.toUpperCase() + "|" + postal + "|" + telefono + "|" + nacimiento;
	}
}
