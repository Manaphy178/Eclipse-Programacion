package Ejer3;

import java.util.*;

public class ejercicio05 {

	public static void main(String[] args) {
		String[] ciudades = new String[7];
		pedir(ciudades);
		mayus(ciudades);
		decir(ciudades);
	}

	static String[] pedir(String array[]) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Dime el nombre de una ciudad");
			array[i] = sc.nextLine().trim();
		}

		return array;
	}

	static String[] mayus(String array[]) {

		for (int i = 0; i < array.length; i++) {
			int cont = 0;
			String aux = "";
			for (int j = 0; j < array[i].length(); j++) {
				if (j == 0) {
					aux += String.valueOf(array[i].charAt(j)).toUpperCase();
				} else if (j == array[i].length() - 2) {
					aux += String.valueOf(array[i].charAt(j)).toUpperCase();
				} else {
					aux += String.valueOf(array[i].charAt(j));
				}
			}
			array[i] = aux;
		}
		return array;
	}

	static void decir(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
