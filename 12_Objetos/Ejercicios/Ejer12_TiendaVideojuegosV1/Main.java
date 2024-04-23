package Ejer12_TiendaVideojuegosV1;

import java.util.*;

public class Main {
	public static Scanner sn = new Scanner(System.in);
	public static Scanner sc = new Scanner(System.in);
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
	static ArrayList<Tienda> tiendas = new ArrayList<Tienda>();
	static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	static ArrayList<Compannia> compannias = new ArrayList<Compannia>();
	static ArrayList<Venta> ventas = new ArrayList<Venta>();
	static ArrayList<Linea_Venta> lineas_ventas = new ArrayList<Linea_Venta>();
	static ArrayList<Personaje> personajes = new ArrayList<Personaje>();

	public static void main(String[] args) {
		if (ExisteVideojuego(videojuegos, null)) {
			System.out.println("El videojuego existe");
		} else {
			System.out.println("El videojuego no existe");
		}
	}

	static boolean ExisteVideojuego(ArrayList<Videojuego> videojuegos, Videojuego videojuego) {

		for (Videojuego v : videojuegos) {
			if (v == videojuego) {
				return true;
			}
		}
		return false;

	}

	static boolean ExisteCliente(ArrayList<Cliente> clientes, Cliente cliente) {
		for (Cliente c : clientes) {
			if (c == cliente) {
				return true;
			}
		}
		return false;
	}

	static boolean ExisteEmpleado(ArrayList<Empleado> empleados, Empleado empleado) {
		for (Empleado e : empleados) {
			if (e == empleado) {
				return true;
			}
		}
		return false;
	}

	static double importeTotal(ArrayList<Venta> ventas, Cliente cliente) {
		for (Venta v : ventas) {
			if (v.getCliente() == cliente) {
				return v.getImporte_tot_venta();
			}
		}
		System.out.println("El cliente indicado no existe");
		return 0;
	}

	static void juegosMayorSetenta(ArrayList<Venta> ventas, Tienda tienda) {
		for (Venta v : ventas) {
			if (v.getTienda() == tienda) {
				for (Linea_Venta l : v.getLineas_venta()) {
					if (l.getImporte() >= 70) {
						System.out.println(l.getVideojuego().getNombre());
					}
				}
			}
		}
	}

	static double importeTotalVenta(ArrayList<Venta> ventas, Venta venta) {
		double total = 0;
		if (ventas.contains(venta)) {
			for (Venta v : ventas) {
				for (Linea_Venta l : v.getLineas_venta()) {
					total += l.getImporte() * l.getUnidades();
				}
			}
		}
		return total;

	}
}
