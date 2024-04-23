package fifa;

public class Carta {
	private String nombre;
	private int cod;
	private int rat;
	private String pos;
	private int precio;
	private int pac;
	private int sho;
	private int pas;
	private int dri;
	private int def;
	private int phy;
	private int piernaM;
	private int fili;

	public Carta() {
		super();
	}

	public Carta(String nombre, int cod, int rat, String pos, int precio, int pac, int sho, int pas, int dri, int def,
			int phy, int piernaM, int fili) {
		super();
		this.nombre = nombre;
		this.cod = cod;
		this.rat = rat;
		this.pos = pos;
		this.precio = precio;
		this.pac = pac;
		this.sho = sho;
		this.pas = pas;
		this.dri = dri;
		this.def = def;
		this.phy = phy;
		this.piernaM = piernaM;
		this.fili = fili;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getRat() {
		return rat;
	}

	public void setRat(int rat) {
		if (rat >= 0 && rat <= 100) {
			this.rat = rat;
		}
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPac() {
		return pac;
	}

	public void setPac(int pac) {
		if (pac >= 0 && pac <= 100) {
			this.pac = pac;
		}
	}

	public int getSho() {
		return sho;
	}

	public void setSho(int sho) {
		if (sho >= 0 && sho <= 100) {
			this.sho = sho;
		}
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		if (pas >= 0 && pas <= 100) {
			this.pas = pas;
		}
	}

	public int getDri() {
		return dri;
	}

	public void setDri(int dri) {
		if (dri >= 0 && dri <= 100) {
			this.dri = dri;
		}
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		if (def >= 0 && def <= 100) {
			this.def = def;
		}
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		if (phy >= 0 && phy <= 100) {
			this.phy = phy;
		}
	}

	public int getPiernaM() {
		return piernaM;
	}

	public void setPiernaM(int piernaM) {
		if (piernaM >= 0 && piernaM <= 5) {
			this.piernaM = piernaM;
		}
	}

	public int getFili() {
		return fili;
	}

	public void setFili(int fili) {
		if (fili >= 0 && fili <= 5) {
			this.fili = fili;
		}
	}

}
