package Ejer5;

import java.util.*;

public class Hundir_el_Imperio {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	public static String ANSI_RED = "\u001B[31m";
	public static String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) {
		String[][] alianza = tablero();
		String[][] imperio = tablero();
		naves(alianza, imperio);
		opciones(alianza, imperio);
	}

	static int menu() {

		int opc;
		System.out.println("\rMenu");
		System.out.println("1. Hacer lanzamiento Alianza.");
		System.out.println("2. Hacer lanzamiento Imperio.");
		System.out.println("3. Mostrar Tablero Alianza.");
		System.out.println("4. Mostrar Tablero Imperio.");
		System.out.println("5. Salir.");
		System.out.println("\rElige una opcion");
		opc = sn.nextInt();
		return opc;
	}

	static void opciones(String[][] alianza, String[][] imperio) {
		int opc = 0;
		boolean ganar = false;
		do {
			opc = menu();
			switch (opc) {
			case 1:
				System.out.println("Vamos a tirar una nave a los sucios del imperio");
				ganar = realizarTirada(imperio);
				if (ganar) {
					System.out.println("¡¡Lord Coordinador y Lord Profesor han caido!!");
					System.out.println(ANSI_RED + "Victoria para la Alianza" + ANSI_RESET);
					opc = 5;
				}
				break;
			case 2:
				System.out.println("La victoria del lado oscuro se alzara");
				ganar = realizarTirada(alianza);
				if (ganar) {
					System.out.println("Nadie puede vencer al lado oscuro");
					System.out.println(ANSI_RED + "Victoria para el lado oscuro" + ANSI_RESET);
					opc = 5;
				}
				break;
			case 3:
				decirA(alianza);
				break;
			case 4:
				decirI(imperio);
				break;
			case 5:

				break;
			}
		} while (opc < 5 && opc > 0);
		System.out.println("Bye bye, el lado oscuro volvera");
	}

	static String[][] tablero() {
		String[][] tablero = new String[11][11];
		tablero[0][0] = " ";
		String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
//		Numeros
		for (int i = 1; i < tablero[0].length; i++) {
			tablero[0][i] = "  (" + String.valueOf(i - 1) + ")";
		}
//		Letras
		for (int i = 1; i < tablero.length; i++) {
			tablero[i][0] = letras[i - 1];
		}
//		Rellenar con 0
		for (int i = 1; i < tablero.length; i++) {
			for (int j = 1; j < tablero[i].length; j++) {
				tablero[i][j] = "|  0";
			}
		}
		return tablero;
	}

	static void decirA(String[][] array) {
		System.out.println("\r-------------------------------------------------------------------------------");
		System.out.println("|\t\t\t\t      ALIANZA        \t\t\t      |");
		System.out.println("-------------------------------------------------------------------------------\r");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == 0) {
					System.out.print(array[i][j] + " ");
				} else {
					System.out.print(array[i][j] + "\t");
				}

			}
			System.out.print("\r  -------------------------------------" + "----------------------------------------");
			System.out.println();
		}
	}

	static void decirI(String[][] array) {
		System.out.println("\r-------------------------------------------------------------------------------");
		System.out.println("|\t\t\t\t      IMPERIO        \t\t\t      |");
		System.out.println("-------------------------------------------------------------------------------\r");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == 0) {
					System.out.print(array[i][j] + " ");
				} else {
					System.out.print(array[i][j] + "\t");
				}

			}
			System.out.print("\r  -------------------------------------" + "----------------------------------------");
			System.out.println();
		}
	}

	static void naves(String[][] alianza, String[][] imperio) {
		int ali = 0;
		int imp = 0;
		System.out.println("Despliega la nave de la alianza. En formato numero y letra, ej: A9");
		while (ali < 6) {
			System.out.println("Despliega tu nave: ");
			int[] pos = coordenada();
			boolean hay = validar(pos, alianza);
			if (hay) {
				System.out.println("Ya has posicionado ahi una nave");
			} else {
				alianza[pos[0]][pos[1]] = alianza[pos[0]][pos[1]].replace("0", "H");
				System.out.println("Se ha posicionado la nave");
				ali++;

			}

		}
		System.out.println("Despliega la nave del imperio. En formato numero y letra, ej: A9");
		while (imp < 6) {
			System.out.println("Despliega tu nave");
			int[] pos = coordenada();
			boolean hay = validar(pos, imperio);
			if (hay) {
				System.out.println("Ya has posicionado ahi una nave");
			} else {
				imperio[pos[0]][pos[1]] = imperio[pos[0]][pos[1]].replace("0", "H");
				System.out.println("Se ha posicionado la nave");
				imp++;

			}
		}

	}

	static int[] coordenada() {
		String[] posX = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String[] posY = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		int[] pos = new int[2];
		boolean formato = false;
		while (formato == false) {

			String posicion = sc.nextLine();
			for (int i = 0; i < posX.length; i++) {
				if (String.valueOf(posicion.charAt(0)).equalsIgnoreCase(posY[i])) {
					pos[0] = i + 1;
					for (int j = 0; j < posY.length; j++) {
						if (String.valueOf(posicion.charAt(1)).equals(posX[j])) {
							pos[1] = j + 1;
							formato = true;
							break;
						} else {
							formato = false;
						}
					}
					break;
				} else {
					formato = false;
				}
			}
			if (formato == false) {
				System.out.println("El formato que has introducido es erroneo. Diga una nueva posicion");
			}
		}
		return pos;
	}

	static boolean validar(int[] pos, String[][] equipo) {
		boolean formato = true;
		if (equipo[pos[0]][pos[1]].contains("H")) {
			formato = true;
		} else {
			formato = false;
		}
		return formato;
	}

	static boolean realizarTirada(String[][] tabla) {
		boolean repetir = false;
		boolean victoria = false;
		do {
			System.out.println("Dime las coordenadas para lanzar tu ataque con formato numero y letra, ej: A9");
			int[] pos = coordenada();
			repetir = rep(pos, tabla);
			if (repetir == false) {

				boolean agua = marcarAgua(pos, tabla);
				if (agua) {
					System.out.println("Espacio, has fallado el tiro");
				}

				boolean hit = marcarHundido(pos, tabla);
				if (hit) {
					System.out.println("¡Bien, hemos hundido una nave!");
				}

			} else {
				System.out.println("Ya has realizado una tirada en esa posicion");
			}
		} while (repetir);
		if (contarNaves(tabla) == 0) {
			victoria = true;
		}
		return victoria;

	}

	static boolean rep(int[] pos, String[][] tabla) {
		boolean repetir = false;
		if (tabla[pos[0]][pos[1]].contains("A") || tabla[pos[0]][pos[1]].contains("X")) {
			repetir = true;
		} else {
			repetir = false;
		}
		return repetir;
	}

	static boolean marcarHundido(int[] pos, String[][] tabla) {
		boolean hit = false;
		if (tabla[pos[0]][pos[1]].contains("H")) {
			tabla[pos[0]][pos[1]] = tabla[pos[0]][pos[1]].replace("H", "X");
			hit = true;
		} else {
			hit = false;
		}
		return hit;
	}

	static boolean marcarAgua(int[] pos, String[][] tabla) {
		boolean agua = false;
		if (tabla[pos[0]][pos[1]].contains("0")) {
			tabla[pos[0]][pos[1]] = tabla[pos[0]][pos[1]].replace("0", "A");
			agua = true;
		} else {
			agua = false;
		}
		return agua;
	}

	static int contarNaves(String[][] tabla) {
		int naves = 0;
		for (int i = 1; i < tabla.length; i++) {
			for (int j = 1; j < tabla[0].length; j++) {
				if (tabla[i][j].contains("H")) {
					naves++;
				}
			}
		}
		return naves;
	}
}
