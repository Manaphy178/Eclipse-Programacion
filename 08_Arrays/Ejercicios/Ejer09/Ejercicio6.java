package Ejer09;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[16];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para el array1");
			array1[i] = sn.nextInt();
		}
		int cont = 0;

		for (int i = 0; i < 1; i++) {
			do {
				array2[cont] = 0;
				cont++;
			} while (cont != 3);
			for (int j = 0; j < array1.length; j++) {
				array2[cont] = array1[j];
				cont++;
			}
			do {
				array2[cont] = 0;
				cont++;
			} while (cont != array2.length - 1);
		}
		for (int i = 0; i < array2.length; i++) {
			if (i == array2.length - 1) {
				System.out.print(array2[i] + ".");
			} else {
				System.out.print(array2[i] + ", ");
			}
		}
	}
}