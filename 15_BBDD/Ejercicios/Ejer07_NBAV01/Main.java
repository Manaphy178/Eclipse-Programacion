package Ejer07_NBAV01;

import java.util.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static BDController bd = new BDController();
	static ArrayList<Jugador> jugadores = bd.todosJugadores();
	static ArrayList<Equipo> equipos = bd.todosEquipos();
	static ArrayList<Estadistica> stats = bd.todasEstadisticas();
	static ArrayList<Partido> partidos = bd.todosPartidos();
	static String numerico = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		opciones();
	}

	private static int menu() {
		System.out.println("MENU");
		System.out.println(
				"1. Alta Jugador" + "\n2. Baja Jugador" + "\n3. Listado de equipos" + "\n4. Listado de Jugadores");
		System.out.println("5. Salir");
		return sn.nextInt();
	}

	private static void opciones() {
		boolean si = true;
		do {
			switch (menu()) {
			case 1:
				altaJugador();
				jugadores = bd.todosJugadores();
				break;
			case 2:
				bajaJugador();
				jugadores = bd.todosJugadores();
				break;
			case 3:
				mostrarEquipos();
				break;
			case 4:
				mostrarJugadores();
				break;
			case 5:
				si = false;
			default:
				System.out.println(si ? "Valor introducido incorrecto" : "Adios");
				break;
			}
		} while (si);
	}

	private static void altaJugador() {
		do {
			System.out.println("Dime el codigo del jugador y vemos si existe");
			numerico = sc.nextLine().trim();
		} while (esNumerico(numerico));
		int cod = Integer.parseInt(numerico);
		if (!bd.existeJugador(cod)) {
			mostrarEquipos();
			System.out.println("Dime el equipo en el que estara el jugador");
			String equipo = sc.nextLine();
			if (bd.existeEquipo(equipo)) {
				System.out.println("Dime el nombre del jugador");
				String nombre = sc.nextLine();
				System.out.println("Dime la procedencia del jugador");
				String procedencia = sc.nextLine();
				System.out.println("Dime la altura del jugador");
				String altura = sc.nextLine();
				do {
					System.out.println("Dime el peso del jugador");
					numerico = sc.nextLine().trim();
				} while (esNumerico(numerico));

				int peso = Integer.parseInt(numerico);
				System.out.println("Dime la posicion del jugador");
				String pos = sc.nextLine();
				bd.altaJugador(cod, nombre, procedencia, altura, peso, pos, equipo);
			}

		}
	}

	private static void bajaJugador() {
		mostrarJugadores();
		do {
			System.out.println("Dime el codigo del jugador");
			numerico = sc.nextLine().trim();
		} while (esNumerico(numerico));
		int cod = Integer.parseInt(numerico);
		bd.bajaJugador(cod);

	}

	private static void mostrarEquipos() {
		for (Equipo equipo : equipos) {
			equipo.mostrarDatos();
		}
	}

	private static void mostrarJugadores() {
		for (Jugador play : jugadores) {
			play.mostrarDatos();
		}
	}

	private static boolean esNumerico(String numerico) {
		if (!numerico.isBlank()) {
			for (int i = 0; i < numerico.length(); i++) {
				if (Character.isLetter(numerico.charAt(i))) {
					System.out.println("Has introducido una letra en el codigo numerico");
					System.out.println("Vuelve a introducir el codigo");
					return true;
				}
			}
		} else {
			System.out.println("Pon algo, animal");
			return true;
		}

		return false;

	}
}
