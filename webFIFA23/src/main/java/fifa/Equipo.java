package fifa;

public class Equipo {
	private int codE;
	private String nombre;
	private int codL;

	public Equipo() {
	}

	public Equipo(int codE, String nombre, int codL) {
		super();
		this.codE = codE;
		this.nombre = nombre;
		this.codL = codL;
	}

	public int getCodE() {
		return codE;
	}

	public void setCodE(int codE) {
		this.codE = codE;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodL() {
		return codL;
	}

	public void setCodL(int codL) {
		this.codL = codL;
	}

}
