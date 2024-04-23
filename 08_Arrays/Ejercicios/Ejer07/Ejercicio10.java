package Ejer07;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros");
			array1[i] = sn.nextInt();
		}
		int min = 0;
		int cont = 0;
		for (int i = 0; i < array1.length - 1; i++) {
			min = i;
			for (int x = i + 1; x < array1.length; x++) {
				if (array1[x] < array1[min]) {
					min = x;
				}
			}
			int temporal = array1[i];
			array1[i] = array1[min];
			array1[min] = temporal;
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " < ");
		}
	}
}