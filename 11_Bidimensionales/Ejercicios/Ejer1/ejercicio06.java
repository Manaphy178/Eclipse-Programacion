package Ejer1;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String[][] notas = new String[5][3];
		notas[0][0] = "BD";
		notas[0][1] = "Programacion";
		notas[0][2] = "Moviles";
		for (int i = 1; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Dime la nota del alumno de " + notas[0][j]);
				notas[i][j] = sn.nextLine();
			}
		}
		for (int i = 0; i < notas[0].length; i++) {
			System.out.print(notas[0][i] + " ");
		}
		for (int i = 1; i < notas.length; i++) {

			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}

		}
	}

}
