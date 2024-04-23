package fifa;

public class Jugador {
	private int codJ;
	private String nombre;
	private int codE;
	private String pierna;
	private int altura;
	private String pais;

	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jugador(int codJ, String nombre, int codE, String pierna, int altura, String pais) {
		super();
		this.codJ = codJ;
		this.nombre = nombre;
		this.codE = codE;
		this.pierna = pierna;
		this.altura = altura;
		this.pais = pais;
	}

	public int getCodJ() {
		return codJ;
	}

	public void setCodJ(int codJ) {
		this.codJ = codJ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodE() {
		return codE;
	}

	public void setCodE(int codE) {
		this.codE = codE;
	}

	public String getPierna() {
		return pierna;
	}

	public void setPierna(String pierna) {
		this.pierna = pierna;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
