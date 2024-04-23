package Ejer1;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		String[][] datos = new String[10][2];
		ejercicio04.rellenar(datos);

		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.print(datos[i][j] + " ");
			}
			System.out.println();
		}
	}

	static String[][] rellenar(String[][] datos) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					System.out.println("Dime tu nombre");
					datos[i][j] = sc.nextLine();
				} else {
					System.out.println("Dime tu DNI");
					datos[i][j] = sc.nextLine();
				}

			}

		}
		return datos;
	}
}
