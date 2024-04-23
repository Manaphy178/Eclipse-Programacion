package Ejer07;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[10];
		boolean cre = true, decre = true;
		int num = Integer.MIN_VALUE;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros");
			array1[i] = sn.nextInt();
		}
		for (int i = 1; i < array1.length; i++) {
			if (array1[i] <= array1[i - 1]) {
				num = array1[i];
				cre = false;
			}
			if (array1[i] >= array1[i - 1]) {
				num = array1[i];
				decre = false;
			}
		}
		if (cre == true) {
			System.out.println("Orden creciente");
		} else if (decre == true) {
			System.out.println("Orden decreciente");
		} else {
			System.out.println("Desordenados");
		}
	}
}