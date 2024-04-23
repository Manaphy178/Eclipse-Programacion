package Ejer13_TiendaVideojuegosV2;

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
		personajes.add(new Personaje("Canela", "Perro"));
		personajes.add(new Personaje("Ankha", "Gato"));
		personajes.add(new Personaje("Aldeano", "Imbecil"));
		videojuegos.add(new Videojuego("Animal Crossing", "Aventura", personajes));
		letrasInicioFin(videojuegos);

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

	static void letrasInicioFin(ArrayList<Videojuego> videojuegos) {
		System.out.println("Dime una letra (si pones mas de una cogera la primera)");
		String letra = sc.nextLine().trim().toLowerCase();

		for (Videojuego v : videojuegos) {
			v.letraInicioFinPersonaje(String.valueOf(letra.charAt(0)));
		}
	}

	static Cliente dameCliente(String dni, ArrayList<Cliente> clientes) {
		for (Cliente c : clientes) {
			if (c.clienteExiste(dni)) {
				return c;
			}
		}
		System.out.println("El cliente no existe");
		return null;
	}

	static Empleado dameEmpleado(String dni, ArrayList<Empleado> empleados) {
		for (Empleado e : empleados) {
			if (e.empleadoExiste(dni)) {
				return e;
			}
		}
		System.out.println("El empleado no existe");
		return null;
	}

	static Tienda dameTienda(String num_tienda, ArrayList<Tienda> tiendas) {
		for (Tienda t : tiendas) {
			if (t.tiendaExiste(num_tienda)) {
				return t;
			}
		}
		System.out.println("La tienda no existe");
		return null;
	}

	static ArrayList<String> nombresGamesEvenMeses(ArrayList<Venta> ventas) {
		ArrayList<String> nombres = new ArrayList<String>();
		for (Venta v : ventas) {
			String[] fechas = v.getFecha_venta().split("\\/");
			if (Integer.parseInt(fechas[1]) % 2 == 0) {
				for (Linea_Venta l : v.getLineas_venta()) {
					nombres.add(l.getVideojuego().getNombre());
				}
			}
		}
		return nombres;
	}

	static void altaVenta(String dniCliente, String dniEmpleado, String fechaVenta, String nTienda,
			ArrayList<Cliente> clientes, ArrayList<Empleado> empleados, ArrayList<Tienda> tiendas) {

	}
}
