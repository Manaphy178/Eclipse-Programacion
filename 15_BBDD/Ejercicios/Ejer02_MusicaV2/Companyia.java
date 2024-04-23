package Ejer02_MusicaV2;

public class Companyia {
	private String cod;
	private String nombre;
	private String dir;
	private String fax;
	private String tlf;

	public Companyia() {
	};

	public Companyia(String cod, String nombre, String dir, String fax, String tlf) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.dir = dir;
		this.fax = fax;
		this.tlf = tlf;
	}

	public String getCod() {
		return cod;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDir() {
		return dir;
	}

	public String getFax() {
		return fax;
	}

	public String getTlf() {
		return tlf;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
}
