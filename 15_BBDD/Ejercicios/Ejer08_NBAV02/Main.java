package Ejer08_NBAV02;

import java.util.*;
import java.io.*;

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
		System.out.println("5. Alta Estadistica" + "\n6. Baja Estadistica"
				+ "\n7. Generar archivo con jugadores que tengan mas de 30 puntos");
		System.out.println("8. Salir");
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
				altaStat();
				stats = bd.todasEstadisticas();
				break;
			case 6:
				bajaStat();
				stats = bd.todasEstadisticas();
				break;
			case 7:
				archJug();
				break;
			case 8:
				si = false;
			default:
				System.out.println(si ? "Valor introducido incorrecto" : "Adios");
				break;
			}
		} while (si);
	}

	/*
	 * Ejercicio 1
	 */

	private static void altaJugador() {
		int cod = sacarCodJug();
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

		int cod = sacarCodJug();
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

	/*
	 * Fin ejercicio 1
	 */

	/*
	 * Ejercicio 2
	 */

	private static void altaStat() {

		int cod = sacarCodJug();
		if (bd.existeJugador(cod)) {
			System.out.println("Dime la temporada en la que se va a guardar los datos");
			String temp = sc.nextLine().trim();
			if (!bd.existeJugStat(cod, temp)) {
				System.out.println("Dime cuantos puntos por partido ha marcado");
				float ppp = sc.nextFloat();
				System.out.println("Dime cuantas asistencias ha tenido");
				float app = sc.nextFloat();
				System.out.println("Dime cuantos tapones por partido ha tenido");
				float tpp = sc.nextFloat();
				System.out.println("Dime cuantos rebotes por partido ha tenido");
				float rpp = sc.nextFloat();
				bd.altaStat(temp, cod, ppp, app, tpp, rpp);
			}
		}
	}

	private static void bajaStat() {
		int cod = sacarCodJug();
		System.out.println("Dime la temporada en la que esta el jugador");
		String temp = sc.nextLine().trim();
		if (bd.existeJugStat(cod, temp)) {
			bd.bajaEstadistica(temp, cod);
		}
	}

	private static void archJug() {
		File arch = new File("Jugones.txt");
		if (!arch.exists()) {
			try {
				arch.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ArrayList<String> stat = bd.jugonesArchList();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(arch, false));
			for (String sta : stat) {
				bw.write(sta);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Se ha creado el archivo");
	}

	private static int sacarCodJug() {
		numerico="";
		do {
			System.out.println("Dime el codigo del jugador y vemos si existe");
			numerico = sc.nextLine().trim();
		} while (esNumerico(numerico));
		return Integer.parseInt(numerico);
	}

	/*
	 * Fin Ejercicio 2
	 */

}
