package Ejer2;

import java.util.*;

public class ejercicio04 {

	public static void main(String[] args) {
		int[][] array1 = new int[5][4];
		int[][] array2 = new int[5][1];
		rellenar(array1);
		suma(array1, array2);
		System.out.println("Array 1:");
		decir(array1);
		System.out.println("Array 2:");
		decir(array2);

	}

	static int[][] rellenar(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) ((Math.random() * 10) + 1);
			}
		}
		return array;
	}

	static void decir(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == (array[i].length - 1)) {
					System.out.print(array[i][j] + "\r");
				} else {
					System.out.print(array[i][j] + " ");
				}

			}

		}
	}

	static int[][] suma(int[][] array1, int[][] array2) {
		for (int i = 0; i < array1.length; i++) {
			int suma = 0;
			for (int j = 0; j < array1[i].length; j++) {
				suma += array1[i][j];
			}
			array2[i][0] = suma;
		}
		return array2;
	}

}
