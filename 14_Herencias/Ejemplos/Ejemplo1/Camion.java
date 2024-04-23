package Ejemplo1;

public class Camion extends Vehiculo {
//	Clase que hereda de la clase Vehiculo
	private int nEjes;
	private String modeloTacografo;
	private String tipo_suspension;
	private double capacidadCarga;
	private String licencia;

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(int nEjes, String modeloTacografo, String tipo_suspension, double capacidadCarga, String licencia) {
		super();
		this.nEjes = nEjes;
		this.modeloTacografo = modeloTacografo;
		this.tipo_suspension = tipo_suspension;
		this.capacidadCarga = capacidadCarga;
		this.licencia = licencia;
	}

	public Camion(String matricula, String marca, String modelo, String t_combustible, int cc, int cv, int consumo) {
		super(matricula, marca, modelo, t_combustible, cc, cv, consumo);
		// TODO Auto-generated constructor stub
	}

	public Camion(String matricula, String marca, String modelo, String t_combustible, int cc, int cv, int consumo,
			int nEjes, String modeloTacografo, String tipo_suspension, double capacidadCarga, String licencia) {
		super(matricula, marca, modelo, t_combustible, cc, cv, consumo);
		this.nEjes = nEjes;
		this.modeloTacografo = modeloTacografo;
		this.tipo_suspension = tipo_suspension;
		this.capacidadCarga = capacidadCarga;
		this.licencia = licencia;
	}

	public int getnEjes() {
		return nEjes;
	}

	public String getModeloTacografo() {
		return modeloTacografo;
	}

	public String getTipo_suspension() {
		return tipo_suspension;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setnEjes(int nEjes) {
		this.nEjes = nEjes;
	}

	public void setModeloTacografo(String modeloTacografo) {
		this.modeloTacografo = modeloTacografo;
	}

	public void setTipo_suspension(String tipo_suspension) {
		this.tipo_suspension = tipo_suspension;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	@Override
	public String toString() {
		return "Camion [nEjes=" + nEjes + ", modeloTacografo=" + modeloTacografo + ", tipo_suspension="
				+ tipo_suspension + ", capacidadCarga=" + capacidadCarga + ", licencia=" + licencia + "]";
	}
}
