package Ejer4;

import java.util.*;

public class ejercicio05 {

	public static void main(String[] args) {
		int[] num1 = rellenar();
		int[] num2 = rellenar();
		int[] num3 = rellenar();
		int[] num4 = rellenar();
		int[] num5 = rellenar();
		int[][] todos = meter(num1, num2, num3, num4, num5);
		int[] primos = primos(todos);
		decir(primos);
	}

	static int[] rellenar() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		return array;
	}

	static int[][] meter(int[] array1, int[] array2, int[] array3, int[] array4, int[] array5) {
		int[][] todos = new int[5][array1.length];
		for (int i = 0; i < todos.length; i++) {
			for (int j = 0; j < todos[i].length; j++) {
				switch (i) {
				case 0:
					todos[i][j] = array1[j];
					break;
				case 1:
					todos[i][j] = array2[j];
					break;
				case 2:
					todos[i][j] = array3[j];
					break;
				case 3:
					todos[i][j] = array4[j];
					break;
				case 4:
					todos[i][j] = array5[j];
					break;
				}
			}
		}
		return todos;
	}

	static void decir(int[] array) {
		System.out.println("Vamos a mostrar los primos\r");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + " - ");
			}
		}
	}

	static int contar(int[][] array) {
		int pri = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				boolean EsPrimo = true;
				if (array[i][j] < 2) {
					EsPrimo = false;
				}
				for (int x = 2; x < array[i].length; x++) {
					if (array[i][j] % x == 0) {
						EsPrimo = false;
						break;
					}
				}
				if (EsPrimo) {
					pri++;
				}
			}
		}
		return pri;
	}

	static int[] primos(int[][] array) {
		int[] primos = new int[contar(array)];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				boolean EsPrimo = true;
				if (array[i][j] < 2) {
					EsPrimo = false;
				}
				for (int x = 2; x < array[i].length; x++) {
					if (array[i][j] % x == 0) {
						EsPrimo = false;
						break;
					}
				}
				if (EsPrimo) {
					primos[index] = array[i][j];
					index++;
				}
			}
		}
		return primos;
	}
}
