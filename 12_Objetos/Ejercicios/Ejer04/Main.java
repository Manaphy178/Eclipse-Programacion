package Ejer04;
import java.util.*;
public class Main {

static Scanner sn= new Scanner (System.in);
static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venta[] ventas = new Venta[5];
		ventas[0] = new Venta("01-02-2024", "06015662N", 700, "22350", "06015334A");
		ventas[1] = new Venta("23-04-2022", "12510304T", 1700, "22351", "06015334A");
		ventas[2] = new Venta("12-05-2021", "48564837M", 400, "22352", "06015334A");
		ventas[3] = new Venta("01-06-2022", "48942531P", 600, "22353", "06015334A");
		ventas[4] = new Venta("30-03-2023", "12856143Y", 2700, "22354", "06015334A");
		imprimirVentas(ventas);
		mostrarVentasMayores(ventas);
		mostrarDNI(ventas);
		modNSerie(ventas);
		fecha(ventas);
	}

//	Ejer 2 - Mostrar los datos de ventas
	static void imprimirVentas(Venta[] ventas) {

		for (int i = 0; i < ventas.length; i++) {
//			System.out.println(ventas[i].toString());
			ventas[i].MostrarDatos();
		}
	}

//	Ejer 3 - Mostrar los datos de las ventas que tienen un importe mas de 800
	static void mostrarVentasMayores(Venta[] ventas) {
		System.out.println("\nVamos a mostrar las ventas mayores a 800:");
		for (int i = 0; i < ventas.length; i++) {
			if (ventas[i].getImporte() >= 800) {
				ventas[i].MostrarDatos();
			}
		}
	}

//	Ejer 4 - Mostrar DNi del cliente que ha comprado una bici a menos de 1000
	static void mostrarDNI(Venta[] ventas) {
		System.out.println("\nMostrar los DNI de los clientes que han comprado a menos de 1000:");
		for (int i = 0; i < ventas.length; i++) {
			if (ventas[i].getImporte() < 1000) {
				System.out.println(ventas[i].getDni_cliente());
			}
		}
	}

//	Ejer 5- Modificar los nº de series de las ventas del array y añade la M al principio
	static void modNSerie(Venta[] ventas) {
		System.out.println("\nAñadir M a todos los N_Serie:");
		for (int i = 0; i < ventas.length; i++) {
			ventas[i].setN_serie("M" + ventas[i].getN_serie());
			System.out.println(ventas[i].getN_serie());
		}
	}
	
//	Ejer 6- muestra las ventas de un año especifico pedido al usuario
	static void fecha(Venta[] ventas) {
		System.out.println("\nDime el año que quieres saber:");
		String anno= sc.nextLine();
		for (int i = 0; i < ventas.length; i++) {
			if (ventas[i].getFecha_vta().contains(anno)) {
				ventas[i].MostrarDatos();
			}
		}
		
	}
}
