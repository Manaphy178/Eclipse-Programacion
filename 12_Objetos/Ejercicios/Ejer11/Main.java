package Ejer11;

import java.util.*;

public class Main {
	static int numAdd = 13;
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Pasajero> pasajeros = new ArrayList<>();
	static ArrayList<Comandante> comandantes = new ArrayList<>();
	static ArrayList<Avion> aviones = new ArrayList<>();
	static ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
	static ArrayList<Vuelo> vuelos = new ArrayList<>();

	public static void main(String[] args) {
		ejer11_basura.rellenarTodo(aeropuertos, aviones, pasajeros, comandantes, vuelos);
		opciones();
	}

	static int menu() {
		System.out.println("MENU:");
		System.out.println("0. Rellenar mas datos de los objetos, automatico (" + numAdd + " veces restantes)");
		System.out.println("1. Decir los pasajeros que son mayores de edad");
		System.out.println("2. Sumar un numero pedido a los años de los pasajeros");
		System.out.println("3. Mostrar datos de codigo de aeropuerto si el numero dado es mayor");
		System.out.println("4. Decir nombre y apellido de los pasajeros mayores de edad");
		System.out.println("5. Decir nombre y apellido del comandante segun el rango introducido");
		System.out.println("6. Insertar un avion nuevo");
		System.out.println("7. Insertar un comandante nuevo");
		System.out.println("8. Insertar un aeropuerto nuevo");
		System.out.println("9. Insertar un pasajero nuevo");
		System.out.println("10. Insertar un vuelo nuevo");
		System.out.println("11. Mostrar datos de todos los aviones");
		System.out.println("12. Mostrar datos de todos los comandantes");
		System.out.println("13. Mostrar datos de todos los aeropuertos");
		System.out.println("14. Mostrar datos de todos los pasajeros");
		System.out.println("15. Mostrar datos de todos los vuelos");
		System.out.println("16. Salir");
		System.out.println("Elija una opcion");
		return sn.nextInt();
	}

	static void opciones() {
		boolean bucle = true;
		do {
			switch (menu()) {
			case 0:
				System.out.println("Cuantos elementos quieres meter de cada, puedes hacerlo " + numAdd + " veces");
				int add = sn.nextInt();
				if (add > numAdd) {
					System.out.println("Has introducido un numero mayor al maximo");
				} else if (add <= numAdd) {
					ejer11_basura.rellenarPeticion(add, aeropuertos, aviones, pasajeros, comandantes);
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
			case 6:
				meterAvion(aviones);
				break;
			case 7:
				meterComandante(comandantes);
				break;
			case 8:
				meterAeropuerto(aeropuertos);
				break;
			case 12:
				mostrarComandante(comandantes);
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

	static void meterAvion(ArrayList<Avion> aviones) {
		System.out.println("Cual es el modelo del avion");
		String modelo = sc.nextLine();
		System.out.println("Cual es la capacidad de pasajeros");
		int capPa = sn.nextInt();
		boolean bucle = true;
		String matricula = "";
		do {
			System.out.println("Cual es la matricula del avion");
			matricula = sc.nextLine();
			for (int i = 0; i < aviones.size(); i++) {
				if (!aviones.get(i).getMatricula().equalsIgnoreCase(matricula)) {
					bucle = false;
					break;
				}
			}
			if (bucle) {
				System.out.println("La matricula esta repetida");
			}
		} while (bucle);
		System.out.println("Cual es la capacidad de combustible");
		double capCom = sn.nextDouble();
		System.out.println("Cual fue el año de fabricacion");
		int anno = sn.nextInt();
		System.out.println("Dime el DNI del comandante, tiene que estar disponible");
		for (int i = 0; i < comandantes.size(); i++) {
			comandantes.get(i).mostrarDatos();
		}
		String id = sc.nextLine();
		boolean meter = false;
		if (ejer11_basura.existeComandante(comandantes, id)) {
			if (comandantes.get(ejer11_basura.numComandante(comandantes, id)).Disponible(id)) {
				aviones.add(new Avion(modelo, capPa, matricula, capCom, anno,
						comandantes.get(ejer11_basura.numComandante(comandantes, id))));
			} else {
				System.out.println("El comandante no esta disponible, vamos a meter un nuevo comandante");
				meter = true;
			}

		} else {
			System.out.println("El comandante no existe, vamos a introducirlo");
			meter = true;
		}

		if (meter) {
			System.out.println("Vamos a meter el comandante");
			meterComandante(comandantes);
			int ultCom = comandantes.size() - 1;
			aviones.add(new Avion(modelo, capPa, matricula, capCom, anno, comandantes.get(ultCom)));

		}

	}

	static void meterComandante(ArrayList<Comandante> comandante) {
		System.out.println("Dime el nombre del comandante");
		String nombre = sc.nextLine();
		System.out.println("Dime el apellido del comandante");
		String apellido = sc.nextLine();
		System.out.println("Dime el telefono del comandante");
		int tlf = sn.nextInt();
		String id = "";
		boolean bucle = true;
		do {
			System.out.println("Dime el DNI del comandante");
			id = sc.nextLine();
			for (int i = 0; i < comandante.size(); i++) {
				if (!comandante.get(i).getId().equalsIgnoreCase(id)) {
					bucle = false;
					break;
				}
			}
			if (bucle) {
				System.out.println("El DNI esta repetido");
			}
		} while (bucle);
		System.out.println("Dime la edad del comandante");
		int edad = sn.nextInt();
		System.out.println("Dime el rango del comandante");
		String rango = sc.nextLine();
		comandante.add(new Comandante(nombre, apellido, tlf, id, edad, rango));
		int ultCom = comandantes.size() - 1;
		comandante.get(ultCom).setId(id);

	}

	static void meterAeropuerto(ArrayList<Aeropuerto> aeropuerto) {
		System.out.println("Nombre del aeropuerto");
		String nombre = sc.nextLine();
		System.out.println("Ciudad del aeropuerto");
		String ciudad = sc.nextLine();
		String codAeropuerto = "";
		boolean bucle = true;
		do {
			System.out.println("Codigo de aeropuerto");
			codAeropuerto = sc.nextLine();
			for (int i = 0; i < aeropuerto.size(); i++) {
				if (!aeropuerto.get(i).getCodAeropuerto().equalsIgnoreCase(codAeropuerto)) {
					bucle = false;
					break;
				}
			}
			if (bucle) {
				System.out.println("El codigo de aeropuerto esta repetido");
			}
		} while (bucle);
		System.out.println("Ahora pediremos los datos de avion" + "\n Cuantos aviones hay en este aeropuerto");
		int veces = sn.nextInt();
		for (int i = 0; i < veces; i++) {
			meterAvion(aviones);
		}
		ArrayList<Avion> avionAero = new ArrayList<>();
		int index = veces;
		for (int i = 0; i < veces; i++) {
			int avioneta = aviones.size() - index;
			avionAero.add(aviones.get(avioneta));
			index--;
		}
		aeropuerto.add(new Aeropuerto(nombre, ciudad, codAeropuerto, avionAero));
	}

	static void meterPasajero(ArrayList<Pasajero> pasajero) {
		System.out.println("Nombre del pasajero");
		String nombre = sc.nextLine();
		System.out.println("Apellido del pasajero");
		String apellido = sc.nextLine();
		System.out.println("Telefono del pasajero");
		int telefono = sn.nextInt();
		System.out.println();
		String id = "";
		boolean bucle = true;
		do {
			System.out.println("Dime el DNI del pasajero");
			id = sc.nextLine();
			for (int i = 0; i < pasajero.size(); i++) {
				if (!pasajero.get(i).getId().equalsIgnoreCase(id)) {
					bucle = false;
					break;
				}
			}
			if (bucle) {
				System.out.println("El DNI esta repetido");
			}
		} while (bucle);
		System.out.println("Dime la edad del pasajero");
		int edad = sn.nextInt();
		pasajero.add(new Pasajero(nombre, apellido, telefono, id, edad));
		int ultPas = pasajero.size() - 1;
		pasajero.get(ultPas).setId(id);
	}

	static void mostrarComandante(ArrayList<Comandante> comand) {
		for (int i = 0; i < comand.size(); i++) {
			comand.get(i).mostrarDatos();
		}
	}
}
