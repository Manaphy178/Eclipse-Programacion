package Ejer15_TiendaVideojuegosV4;

import java.util.*;

public class Venta {
	private Empleado emple;
	private String fecha_venta;
	private double importe_tot_venta;
	private Tienda tienda;
	private Cliente cliente;
	private ArrayList<Linea_Venta> lineas_venta;

	public Venta() {
	}

	public Venta(Empleado emple, String fecha_venta, double importe_tot_venta, Tienda tienda, Cliente cliente,
			ArrayList<Linea_Venta> lineas_venta) {
		super();
		this.emple = emple;
		this.fecha_venta = fecha_venta;
		this.importe_tot_venta = importe_tot_venta;
		this.tienda = tienda;
		this.cliente = cliente;
		this.lineas_venta = lineas_venta;
	}

	public Empleado getEmple() {
		return emple;
	}

	public String getFecha_venta() {
		return fecha_venta;
	}

	public double getImporte_tot_venta() {
		return importe_tot_venta;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ArrayList<Linea_Venta> getLineas_venta() {
		return lineas_venta;
	}

	public void setEmple(Empleado emple) {
		this.emple = emple;
	}

	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public void setImporte_tot_venta(double importe_tot_venta) {
		this.importe_tot_venta = importe_tot_venta;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setLineas_venta(ArrayList<Linea_Venta> lineas_venta) {
		this.lineas_venta = lineas_venta;
	}
}
