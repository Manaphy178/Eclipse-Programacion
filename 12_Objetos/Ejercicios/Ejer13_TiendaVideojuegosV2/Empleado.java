package Ejer13_TiendaVideojuegosV2;

public class Empleado {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String dni;
	private String num_empleado;

	public Empleado() {
	}

	public Empleado(String nombre, String apellidos, String direccion, String dni, String num_empleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.dni = dni;
		this.num_empleado = num_empleado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getDni() {
		return dni;
	}

	public String getNum_empleado() {
		return num_empleado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNum_empleado(String num_empleado) {
		this.num_empleado = num_empleado;
	}

	public boolean empleadoExiste(String dni) {
		if (this.dni.equalsIgnoreCase(dni)) {
			return true;
		}
		return false;
	}
}
