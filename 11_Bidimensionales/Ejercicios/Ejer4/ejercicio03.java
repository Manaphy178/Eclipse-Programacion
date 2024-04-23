package Ejer4;

import java.util.*;

public class ejercicio03 {

	public static void main(String[] args) {
		boolean[][] cadenas = new boolean[10][10];
		rellenar(cadenas);
		decir(cadenas);
		invertir(cadenas);
		decir(cadenas);

	}

	static boolean[][] rellenar(boolean[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int ran = (int) (Math.random() * 10) + 1;
				if (ran <= 5) {
					array[i][j] = true;
				} else {
					array[i][j] = false;
				}
			}
		}
		return array;
	}

	static void decir(boolean[][] array) {
		System.out.println("Vamos a mostrar los arrays\r");
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + ". ");
			for (int j = 0; j < array[i].length; j++) {
				if (j == array[i].length - 1) {
					System.out.print(array[i][j]);
				} else {
					System.out.print(array[i][j] + " - ");
				}
			}
			System.out.println();
		}
	}

	static boolean[][] invertir(boolean[][] array) {
		System.out.println("\nInvertimos los booleanos\n");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == true) {
					array[i][j] = false;
				} else {
					array[i][j] = true;
				}
			}
		}
		return array;
	}

}
