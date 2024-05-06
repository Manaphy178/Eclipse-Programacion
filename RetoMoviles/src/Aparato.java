
public class Aparato {
	private String nombre;
	private int watios;
	private boolean encendido;
	
	public Aparato(String nombre, int watios, boolean encendido) {
		super();
		this.nombre = nombre;
		this.watios = watios;
		this.encendido = encendido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getWatios() {
		return watios;
	}
	public void setWatios(int watios) {
		this.watios = watios;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
}
