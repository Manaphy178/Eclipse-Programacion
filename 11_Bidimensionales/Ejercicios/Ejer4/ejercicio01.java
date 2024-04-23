package Ejer4;

import java.util.*;

public class ejercicio01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[][] cadenas = new String[5][5];
		rellenar(cadenas);
		String todos = all(cadenas);
		System.out.println(todos);
	}

	static String[][] rellenar(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Dime una cadena:");
				array[i][j] = sc.nextLine().trim();
			}
		}
		return array;
	}

	static String all(String[][] array) {
		String aux = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				aux += array[i][j] + " ";
			}
		}
		return aux;
	}
}
