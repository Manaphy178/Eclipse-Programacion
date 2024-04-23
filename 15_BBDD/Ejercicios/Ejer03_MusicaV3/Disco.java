package Ejer03_MusicaV3;

public class Disco {
	private String cod;
	private String nombre;
	private String fecha;
	private String cod_comp;
	private String cod_gru;

	public Disco() {
	}

	public Disco(String cod, String nombre, String fecha, String cod_comp, String cod_gru) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.fecha = fecha;
		this.cod_comp = cod_comp;
		this.cod_gru = cod_gru;
	}

	public String getCod() {
		return cod;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public String getCod_comp() {
		return cod_comp;
	}

	public String getCod_gru() {
		return cod_gru;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}

	public void setCod_gru(String cod_gru) {
		this.cod_gru = cod_gru;
	}

	public void mostrarDatos() {
		System.out.println("Codigo: " + this.cod + " | Nombre: " + this.nombre + " | Salida: " + this.fecha
				+ " | Codigo compañia" + this.cod_comp + " | Codigo grupo: " + this.cod_gru);
	}
}
