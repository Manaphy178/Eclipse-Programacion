package fifa;

public class Liga {
	private int cod;
	private String nombre;
	private String pais;

	public Liga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Liga(int cod, String nombre, String pais) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.pais = pais;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
