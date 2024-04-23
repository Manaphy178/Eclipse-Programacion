package Ejer15_NBAV09;

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
		System.out.println("8. Listado de enfrentamientos de equipos"
				+ "\n9. Listado de los equipos ordenador por division"
				+ "\n10. Listado de partidos ganados por equipo pedido"
				+ "\n11. Listado de jugadores de procedencia pedida, juegen en conferencia, division y que no sea de una ciudad pedida");
		System.out.println("12. Listado Jugadores conferencia Este" + "\n13. Listado Jugadores Division Pacifico"
				+ "\n14. Alta desde archivo");
		System.out.println("15. Salir");
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
				listadoEquip();
				break;
			case 9:
				ArrayList<String> division = bd.divisionList();
				for (String string : division) {
					System.out.println(string);
				}
				break;
			case 10:
				listadoPartidosGanados();
				break;
			case 11:
				listProcedencia();
				break;
			case 12:
				bd.eastConf();
				break;
			case 13:
				bd.pacificDiv();
				break;
			case 14:
				bd.registrarArch();
				break;
			case 15:
				si = false;
				break;
			case 30:
				String nombreEq = nombreEquipoMasPG();
				System.out.println("El nombre del equipo que tiene el mayor numero de victorias es: " + nombreEq);
				break;
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
		numerico = "";
		do {
			System.out.println("Dime el codigo del jugador y vemos si existe");
			numerico = sc.nextLine().trim();
		} while (esNumerico(numerico));
		return Integer.parseInt(numerico);
	}

	/*
	 * Fin Ejercicio 2
	 */

	/*
	 * Ejercicio 3
	 */

	private static void listadoEquip() {
		System.out.println("Dime el nombre del primer equipo");
		String team1 = sc.nextLine().trim();
		System.out.println("Dime el nombre del segundo equipo");
		String team2 = sc.nextLine().trim();
		System.out.println("Se va a comprobar que ambos equipos existan");
		if (bd.existeEquipo(team1) && bd.existeEquipo(team2)) {
			bd.teamList(team1, team2);
		} else {
			System.out.println("Parece que un equipo esta mal introducido");
		}
	}

	private static void listadoPartidosGanados() {
		System.out.println("Dime el nombre del equipo que quieres el listado");
		String nombre = sc.nextLine().trim();
		if (bd.existeEquipo(nombre)) {
			ArrayList<Partido> match = bd.winnersMatch(nombre);
			for (Partido partido : match) {
				partido.mostrarPuntuacion();
			}
		}
	}

	private static void listProcedencia() {
		System.out.println("De donde procede el jugador");
		String procedencia = sc.nextLine();
		System.out.println("En que conferencia juegan");
		String conferencia = sc.nextLine();
		System.out.println("En que division juegan");
		String division = sc.nextLine();
		System.out.println("En que ciudad no quieres que sea el equipo");
		String ciudad = sc.nextLine();
		ArrayList<Jugador> players = bd.racistTownList(procedencia, conferencia, division, ciudad);
		for (Jugador jugador : players) {
			jugador.mostrarDatos();
		}
	}

	/*
	 * Fin Ejercicio 3
	 */
	/*
	 * Ultima parte
	 */
	public static String nombreEquipoMasPG() {
		String nombreEq = "";
		int max = 0;
		ArrayList<String> temporadas = bd.temporadas();
		ArrayList<String> equipos = bd.equipos();
		for (String st : temporadas) {
			ArrayList<Partido> partidos = bd.partidos(st);
			for (String se : equipos) {
				int cont = 0;
				for (Partido p : partidos) {
					if ((p.getLocal().equalsIgnoreCase(se) && p.getPtn_local() > p.getPtn_visitante())
							|| (p.getVisitante().equalsIgnoreCase(se) && p.getPtn_visitante() > p.getPtn_local())) {
						cont++;
					}
				}
				if (cont > max) {
					max = cont;
					nombreEq = se;
				}
			}
		}
		System.out.println(max);
		return nombreEq;
	}
//	public static String nombresJugM(String nomEq) {
//		String nombre= "";
//		for (int i = 0; i < bd.codigosJugM(nomEq).size(); i++) {
//			
//		}
//		
//		return nomJug;
//	}
}
