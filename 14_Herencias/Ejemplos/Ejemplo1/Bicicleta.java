package Ejemplo1;

// Creamos clase bicicleta que heredara la clase vehiculo
public class Bicicleta extends Vehiculo {
	private String categoria;
	private int n_pinnones;
	private String materialCuadro;
	private String grupoCambio;
	private boolean timbre;

	public Bicicleta(String matricula, String marca, String modelo, String t_combustible, int cc, int cv, int consumo,
			String categoria, int n_pinnones, String materialCuadro, String grupoCambio, boolean timbre) {
		super(matricula, marca, modelo, t_combustible, cc, cv, consumo);
		this.categoria = categoria;
		this.n_pinnones = n_pinnones;
		this.materialCuadro = materialCuadro;
		this.grupoCambio = grupoCambio;
		this.timbre = timbre;
	}

	public Bicicleta() {
		super();
	}

	public String getCategoria() {
		return categoria;
	}

	public int getN_pinnones() {
		return n_pinnones;
	}

	public String getMaterialCuadro() {
		return materialCuadro;
	}

	public String getGrupoCambio() {
		return grupoCambio;
	}

	public boolean isTimbre() {
		return timbre;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setN_pinnones(int n_pinnones) {
		this.n_pinnones = n_pinnones;
	}

	public void setMaterialCuadro(String materialCuadro) {
		this.materialCuadro = materialCuadro;
	}

	public void setGrupoCambio(String grupoCambio) {
		this.grupoCambio = grupoCambio;
	}

	public void setTimbre(boolean timbre) {
		this.timbre = timbre;
	}

	@Override
	public String toString() {
		return "Bicicleta [categoria=" + categoria + ", n_pinnones=" + n_pinnones + ", materialCuadro=" + materialCuadro
				+ ", grupoCambio=" + grupoCambio + ", timbre=" + timbre + "]";
	}

}
