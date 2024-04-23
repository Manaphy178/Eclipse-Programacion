package Ejer4;

import java.util.*;

public class ejercicio04 {

	public static void main(String[] args) {
		int[][] cadenas = new int[10][10];
		rellenar(cadenas);
		boolean[][] numeros = num(cadenas);
		decir(numeros);

	}

	static int[][] rellenar(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int ran = (int) (Math.random() * 10) + 1;
				if (ran <= 5) {
					array[i][j] = 0;
				} else {
					array[i][j] = 1;
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

	static boolean[][] num(int[][] array) {
		boolean[][] numeros = new boolean[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0) {
					numeros[i][j] = false;
				} else if (array[i][j] == 1) {
					numeros[i][j] = true;
				}
			}
		}
		return numeros;
	}

}
