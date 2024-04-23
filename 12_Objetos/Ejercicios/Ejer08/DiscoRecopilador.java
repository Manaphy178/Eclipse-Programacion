package Ejer08;

public class DiscoRecopilador {
	private String titulo;
	private int codigo;
	private Disco[] discos;

	public DiscoRecopilador() {
	}

	public DiscoRecopilador(String titulo, int codigo, Disco[] discos) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.discos = discos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Disco[] getDiscos() {
		return discos;
	}

	public void setDiscos(Disco[] discos) {
		this.discos = discos;
	}

	public void mostrarDatosDiscoRec() {
		System.out.println("El titulo del disco es: " + this.titulo);
		System.out.println("El codigo del disco es: " + this.codigo);
		System.out.println("El disco contiene estos discos: ");
		for (int i = 0; i < discos.length; i++) {
			System.out.print(i + 1 + "-" + this.discos[i]);
			System.out.println();
		}
	}
}
