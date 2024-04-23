package Ejer2;

import java.util.*;

public class ejercicio02 {

	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		int[][] array3 = new int[3][array1[0].length+array2[0].length];

		rellenar(array1);
		rellenar(array2);
		System.out.println("Array 1:");
		decir(array1);
		System.out.println("Array 2:");
		decir(array2);
		todos(array1, array2, array3);

		System.out.println("Array 3:");
		decir(array3);

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

	static int[][] todos(int[][] array1, int[][] array2, int[][] array3) {
		boolean vuelta = false;
		int posj = 0;
		int posi = 0;
		for (int i = 0; i < array3.length; i++) {
			posj = 0;
			vuelta = false;
			for (int j = 0; j < array3[i].length; j++) {
				if (j < 3) {
					array3[i][j] = array1[posi][posj];

				} else {
					if (vuelta) {
						array3[i][j] = array2[posi][posj];

					} else {
						posj = 0;
						array3[i][j] = array2[posi][posj];

						vuelta = true;
					}
				}
				posj++;
			}
			posi++;
		}
		return array3;
	}
}
