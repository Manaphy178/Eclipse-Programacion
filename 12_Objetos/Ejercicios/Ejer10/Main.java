package Ejer10;

import java.util.*;

public class Main {
	static int numAdd = 13;
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Pasajero> pasajeros = new ArrayList<>();
		ArrayList<Comandante> comandantes = new ArrayList<>();
		ArrayList<Avion> aviones = new ArrayList<>();
		ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
		ArrayList<Vuelo> vuelos = new ArrayList<>();
		ejer10_basura.rellenarTodo(aeropuertos, aviones, pasajeros, comandantes, vuelos);
		opciones(pasajeros, comandantes, aviones, aeropuertos, vuelos);

	}

	static int menu() {
		System.out.println("MENU:");
		System.out.println("0. Rellenar mas datos de los objetos, automatico (" + numAdd + " veces restantes)");
		System.out.println("1. Decir los pasajeros que son mayores de edad");
		System.out.println("2. Sumar un numero pedido a los años de los pasajeros");
		System.out.println("3. Mostrar datos de codigo de aeropuerto si el numero dado es mayor");
		System.out.println("4. Decir nombre y apellido de los pasajeros mayores de edad");
		System.out.println("5. Decir nombre y apellido del comandante segun el rango introducido");
		System.out.println("Elija una opcion");
		return sn.nextInt();
	}

	static void opciones(ArrayList<Pasajero> pasajeros, ArrayList<Comandante> comandantes, ArrayList<Avion> aviones,
			ArrayList<Aeropuerto> aeropuertos, ArrayList<Vuelo> vuelos) {
		boolean bucle = true;
		do {
			switch (menu()) {
			case 0:
				System.out.println("Cuantos elementos quieres meter de cada, puedes hacerlo " + numAdd + " veces");
				int add = sn.nextInt();
				if (add > numAdd) {
					System.out.println("Has introducido un numero mayor al maximo");
				} else if (add <= numAdd) {
					ejer10_basura.rellenarPeticion(add, aeropuertos, aviones, pasajeros, comandantes);
					numAdd -= add;
					System.out.println("Se han añadido");
				}
				break;
			case 1:
				mayorEdad(pasajeros);
				break;
			case 2:
				System.out.println("Cuanto le quieres sumar a los pasajeros");
				sumaEdad(pasajeros, sn.nextInt());
				break;
			case 3:
				System.out.println("Dime un numero para el codigo del aeropuerto");
				mostrarDatosCod(aeropuertos, sn.nextInt());
				break;
			case 4:
				System.out.println("Dime una edad para decir los pasajeros con mayor edad a la introducida");
				nombreSiMayorEdad(pasajeros, sn.nextInt());
				break;
			case 5:
				System.out.println("Dime un rango especifico y dire el comandante con ese rango");
				sameRango(comandantes, sn.nextInt());
				break;
			default:
				bucle = false;
				break;
			}
		} while (bucle);
		System.out.println("Byeeeee");
	}

	static void mayorEdad(ArrayList<Pasajero> pasajero) {
		for (int i = 0; i < pasajero.size(); i++) {
			if (pasajero.get(i).mayorEdad()) {
				System.out.println("Pasajero " + (i + 1) + " es mayor de edad");
			}
		}
	}

	static void sumaEdad(ArrayList<Pasajero> pasajero, int num) {
		for (int i = 0; i < pasajero.size(); i++) {
			pasajero.get(i).sumaEdad(num);
		}
	}

	static void mostrarDatosCod(ArrayList<Aeropuerto> aeropuertos, int num) {
		for (int i = 0; i < aeropuertos.size(); i++) {
			if (aeropuertos.get(i).mostrarDatosCod(num)) {
				System.out.println("Aeropuerto nº" + (i + 1) + "\n");
				aeropuertos.get(i).toString();
			}
		}
	}

	static void nombreSiMayorEdad(ArrayList<Pasajero> pasajero, int num) {
		for (int i = 0; i < pasajero.size(); i++) {
			pasajero.get(i).nombreSiMayorEdad(num);
		}
	}

	static void sameRango(ArrayList<Comandante> comandantes, int rango) {
		for (int i = 0; i < comandantes.size(); i++) {
			if (comandantes.get(i).sameRango(rango)) {
				System.out.println("Comandante " + (i + 1) + comandantes.get(i).getNombre() + " "
						+ comandantes.get(i).getApellido());
			}
		}
	}

}
