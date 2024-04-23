package Ejer07;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros");
			array1[i] = sn.nextInt();
		}
		System.out.println("Dime un numero para un array: ");
		int num = sn.nextInt();
		int[] array2 = new int[array1.length + 1];
		int cont = 0;
		for (int i = 0; i < array2.length; i++) {
			if (i == 0) {
				array2[i] = num;
			} else {
				array2[i] = array1[cont];
				cont++;
			}
			System.out.println(array2[i]);
		}
	}
}