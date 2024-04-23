package Ejer6_Repaso;

import java.util.*;

public class ejercicio03 {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[][] cadenas = rellenar();
		int[][] numCons = numeros(cadenas);
		print(cadenas, numCons);
	}

	static String[][] rellenar() {
		String[][] cadena = new String[3][3];
		for (int i = 0; i < cadena.length; i++) {
			for (int j = 0; j < cadena[0].length; j++) {
				System.out.print("Dime una palabra: ");
				cadena[i][j] = sc.nextLine().trim().toLowerCase();
			}
		}
		return cadena;
	}

	static int[][] numeros(String[][] cadenas) {
		int[][] numCons = new int[cadenas.length][cadenas[0].length];
		for (int i = 0; i < cadenas.length; i++) {
			for (int j = 0; j < cadenas[0].length; j++) {
				numCons[i][j] = contar(cadenas[i][j]);
			}
		}
		return numCons;
	}

	static int contar(String palabra) {
		String consonantes = "qwrtypsdfghjklñzxcvbnm";
		int cont = 0;
		for (int i = 0; i < palabra.length(); i++) {
			for (int j = 0; j < consonantes.length(); j++) {
				if (palabra.charAt(i) == consonantes.charAt(j)) {
					cont++;
					consonantes = consonantes.replace(String.valueOf(consonantes.charAt(j)), "");
				}
			}
		}
		return cont;
	}

	static void print(String[][] cadena, int[][] num) {
		for (int i = 0; i < cadena.length; i++) {
			for (int j = 0; j < cadena[0].length; j++) {
				System.out.println(cadena[i][j] + " - " + num[i][j]);
			}
		}
	}
}
