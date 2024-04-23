package Ejer2;

import java.util.*;

public class ejercicio01 {

	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		rellenar(array1);
		rellenar(array2);
	
		System.out.println("Array 1:");
		decir(array1);
		System.out.println("Array 2:");
		decir(array2);
		System.out.println("Array 3:");
		decir(suma(array1,array2));

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
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static int[][] suma(int[][]arr1,int[][]arr2){
		int[][] array3 = new int[3][3];
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return array3;
	}
}
