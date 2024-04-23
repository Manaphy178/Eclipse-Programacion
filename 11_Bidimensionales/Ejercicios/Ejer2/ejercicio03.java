package Ejer2;

import java.util.*;

public class ejercicio03 {

	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		rellenar(array1);
		inverso(array1, array2);
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
					System.out.print(array[i][j] + "\t");
				}

			}

		}
	}

	static int[][] inverso(int[][] array1, int[][] array2) {
		for (int i = 0; i < array1.length; i++) {
			int pos = 0;
			for (int j = array1[i].length - 1; j >= 0; j--) {
				array2[i][j] = array1[i][pos];
				pos++;
			}
		}
		return array2;
	}
}
