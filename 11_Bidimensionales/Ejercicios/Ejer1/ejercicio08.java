package Ejer1;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String[][] jugadores = new String[12][5];
		ejercicio08.rellenar(jugadores);
		int opc = 1;
		do {
			System.out.println("Menu: \r" + "1.Ver estadisticas de todos los jugadores \r"
					+ "2.Ver estadisticas de un solo jugador \r" + "3.Salir");
			System.out.println("Dime una opcion:");
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				for (int i = 0; i < jugadores.length; i++) {
					for (int j = 0; j < jugadores[i].length; j++) {
						System.out.print(jugadores[i][j] + " - ");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Dime el nombre del jugador");
				String jugador = sc.nextLine();
				int numero = -1;
				for (int i = 0; i < jugadores.length; i++) {
					if (jugadores[i][0].equalsIgnoreCase(jugador)) {
						numero = i;
					}
				}
				if (numero > -1) {
					System.out.println("Jugador encontrado");
					for (int i = 0; i < jugadores[i].length; i++) {
						System.out.println(jugadores[numero][i] + " - ");
					}
				} else {
					System.out.println("No se ha encontrado el jugador deseado o se ha escrito mal");
				}
				break;
			case 3:
				opc = 5;
				break;
			}

		} while (opc < 4 && opc > 0);
		System.out.println("Adios");
	}

	static String[][] rellenar(String[][] jugadores) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		for (int i = 0; i < jugadores.length; i++) {
			for (int j = 0; j < jugadores[i].length; j++) {
				if (j == 0) {
					System.out.println("Dime el nombre del jugador");
					jugadores[i][j] = sc.nextLine();
				}
				if (j == 1) {
					System.out.println("Dime el Nº del dorsal");
					int numero = sn.nextInt();
					jugadores[i][j] = "nº " + numero;
				}
				if (j == 2) {
					System.out.println("Dime la cantidad de puntos del jugador");
					int numero = sn.nextInt();
					jugadores[i][j] = numero + " puntos ";
				}
				if (j == 3) {
					System.out.println("Dime el numero de rebotes del jugador");
					int numero = sn.nextInt();
					char caracter = (char) numero;
					jugadores[i][j] = numero + " rebotes";
				}
				if (j == 4) {
					System.out.println("Dime el numero de robos del jugador");
					int numero = sn.nextInt();

					jugadores[i][j] = numero + " robos";
				}
				System.out.println();
			}
		}
		return jugadores;
	}
}
