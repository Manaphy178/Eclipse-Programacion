package Ejer13_TiendaVideojuegosV2;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String dni;
	private String num_cliente;

	public Cliente() {
	}

	public Cliente(String nombre, String apellidos, String direccion, String dni, String num_cliente) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.dni = dni;
		this.num_cliente = num_cliente;
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

	public String getNum_cliente() {
		return num_cliente;
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

	public void setNum_cliente(String num_cliente) {
		this.num_cliente = num_cliente;
	}

	public boolean clienteExiste(String dni) {
		if (this.dni.equalsIgnoreCase(dni)) {
			return true;
		}
		return false;
	}
}
