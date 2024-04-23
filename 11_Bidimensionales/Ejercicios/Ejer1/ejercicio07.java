package Ejer1;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String[][] jugadores = new String[12][5];

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
			}
		}
		for (int i = 0; i < jugadores.length; i++) {

			for (int j = 0; j < jugadores[i].length; j++) {
				System.out.print(jugadores[i][j] + " - ");
			}
			System.out.println();
		}
	}

}
