package Ejer15_TiendaVideojuegosV4;

public class Linea_Venta {
	private double importe;
	private Videojuego videojuego;
	private int unidades;

	public Linea_Venta() {
	}

	public Linea_Venta(double importe, Videojuego videojuego, int unidades) {
		super();
		this.importe = importe;
		this.videojuego = videojuego;
		this.unidades = unidades;
	}

	public double getImporte() {
		return importe;
	}

	public Videojuego getVideojuego() {
		return videojuego;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public void setVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
}
