package Ejemplo1;
/*
 * Cuando a una clase le pones extends y una clase ya creada indica qu este pertenece a esta clase, por eso taxi es una clase hijo de vehiculo
 */
public class Taxi extends Vehiculo {
	private String licencia;
	private String modeloContador;
	private String modeloCiudad;
	private boolean ocupado;
	private String turno;
//Constructor vacio
	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * A la hora de crear un constructor superClass, hereda todos los atributos del padre 
	 */

	public Taxi(String matricula, String marca, String modelo, String t_combustible, int cc, int cv, int consumo) {
		super(matricula, marca, modelo, t_combustible, cc, cv, consumo);
		// TODO Auto-generated constructor stub
	}

	public Taxi(String licencia, String modeloContador, String modeloCiudad, boolean ocupado, String turno) {
		super();
		this.licencia = licencia;
		this.modeloContador = modeloContador;
		this.modeloCiudad = modeloCiudad;
		this.ocupado = ocupado;
		this.turno = turno;
	}

	public String getLicencia() {
		return licencia;
	}

	public String getModeloContador() {
		return modeloContador;
	}

	public String getModeloCiudad() {
		return modeloCiudad;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public String getTurno() {
		return turno;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public void setModeloContador(String modeloContador) {
		this.modeloContador = modeloContador;
	}

	public void setModeloCiudad(String modeloCiudad) {
		this.modeloCiudad = modeloCiudad;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Taxi [licencia=" + licencia + ", modeloContador=" + modeloContador + ", modeloCiudad=" + modeloCiudad
				+ ", ocupado=" + ocupado + ", turno=" + turno + "]";
	}

}
