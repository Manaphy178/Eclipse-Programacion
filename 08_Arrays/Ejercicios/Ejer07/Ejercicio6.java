package Ejer07;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int cont = 0;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros");
			array1[i] = sn.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Dime otros numeros");
			array2[i] = sn.nextInt();
		}
		int[] array3 = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			array3[cont] = array1[i];
			cont++;
			array3[cont] = array2[i];
			cont++;
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
	}
}