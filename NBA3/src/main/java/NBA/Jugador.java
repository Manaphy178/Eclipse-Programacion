package NBA;

public class Jugador {

	private int codigo;
	private String nombre;
	private String procedencia;
	private String altura;
	private int peso;
	private String posicion;
	private String nombre_equipo;
	
	
	public Jugador(int codigo, String nombre, String procedencia, String altura, int peso, String posicion,
			String nombre_equipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		this.nombre_equipo = nombre_equipo;
	}
	
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNombre_equipo() {
		return nombre_equipo;
	}
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	
	
	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", procedencia=" + procedencia + ", altura="
				+ altura + ", peso=" + peso + ", posicion=" + posicion + ", nombre_equipo=" + nombre_equipo + "]";
	}


	public String mostrarDatos() {
		return "codigo=" + codigo + " \nnombre=" + nombre + " \nprocedencia=" + procedencia + " \naltura=" + altura
				+ " \npeso=" + peso + " \nposicion=" + posicion + " \nnombre_equipo=" + nombre_equipo + " \n";
	}
	
	
	
	
}
