package Ejer15_TiendaVideojuegosV4;

public class Tienda {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String num_tienda;

	public Tienda() {
	}

	public Tienda(String nombre, String direccion, String ciudad, String num_tienda) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.num_tienda = num_tienda;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getNum_tienda() {
		return num_tienda;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setNum_tienda(String num_tienda) {
		this.num_tienda = num_tienda;
	}
}
