package Ejer04;

public class Venta {
	private String fecha_vta; // Formato 02-03-2022
	private String dni_cliente;
	private double importe;
	private String n_serie;
	private String dni_vendedor;

	public Venta() {
		super();
	}

	public Venta(String fecha_vta, String dni_cliente, double importe, String n_serie, String dni_vendedor) {
		super();
		this.fecha_vta = fecha_vta;
		this.dni_cliente = dni_cliente;
		this.importe = importe;
		this.n_serie = n_serie;
		this.dni_vendedor = dni_vendedor;
	}

	public String getFecha_vta() {
		return fecha_vta;
	}

	public String getDni_cliente() {
		return dni_cliente;
	}

	public double getImporte() {
		return importe;
	}

	public String getN_serie() {
		return n_serie;
	}

	public String getDni_vendedor() {
		return dni_vendedor;
	}

	public void setFecha_vta(String fecha_vta) {
		this.fecha_vta = fecha_vta;
	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public void setN_serie(String n_serie) {
		this.n_serie = n_serie;
	}

	public void setDni_vendedor(String dni_vendedor) {
		this.dni_vendedor = dni_vendedor;
	}

	@Override
	public String toString() {
		return "Venta\nfecha_vta: " + fecha_vta + "\ndni_cliente: " + dni_cliente + "\nimporte: " + importe
				+ "\nn_serie: " + n_serie + "\ndni_vendedor: " + dni_vendedor + "\n";
	}

	public void MostrarDatos() {
		System.out.println("Venta: ");
		System.out.println("Fecha de venta: " + this.fecha_vta);
		System.out.println("DNI Cliente: " + this.dni_cliente);
		System.out.println("Nº de importe: " + this.importe);
		System.out.println("Nº de serie: " + this.n_serie);
		System.out.println("DNI Vendedor: " + this.dni_vendedor+"\r");
	}

}
