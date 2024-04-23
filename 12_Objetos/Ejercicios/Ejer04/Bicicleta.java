package Ejer04;

public class Bicicleta {
	private int n_serie;
	private String marca;
	private String modelo;
	private String grupo;
	private String tipo_frenos;

	public Bicicleta(int n_serie, String marca, String modelo, String grupo, String tipo_frenos) {
		super();
		this.n_serie = n_serie;
		this.marca = marca;
		this.modelo = modelo;
		this.grupo = grupo;
		this.tipo_frenos = tipo_frenos;
	}

	public Bicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getN_serie() {
		return n_serie;
	}

	public void setN_serie(int n_serie) {
		this.n_serie = n_serie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getTipo_frenos() {
		return tipo_frenos;
	}

	public void setTipo_frenos(String tipo_frenos) {
		this.tipo_frenos = tipo_frenos;
	}

	@Override
	public String toString() {
		return "Bicicleta [n_serie=" + n_serie + ", marca=" + marca + ", modelo=" + modelo + ", grupo=" + grupo
				+ ", tipo_frenos=" + tipo_frenos + "]";
	}

}