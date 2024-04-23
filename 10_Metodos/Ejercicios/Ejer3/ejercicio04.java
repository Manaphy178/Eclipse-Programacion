package Ejer3;

import java.util.*;

public class ejercicio04 {

	public static void main(String[] args) {
		String[] ciudades = new String[10];
		pedir(ciudades);
		ES(ciudades);
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

	static String[] ES(String array[]) {
		for (int i = 0; i < array.length; i++) {
			int cont = 0;
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) == 'e') {
					cont++;
				}
			}
			if (cont >= 3) {
				array[i] = array[i].toUpperCase();
			}
		}
		return array;
	}

	static void decir(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
