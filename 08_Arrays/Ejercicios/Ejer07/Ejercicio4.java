package Ejer07;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[array1.length + array2.length];
		int cont = 0;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros");
			array1[i] = sn.nextInt();
			array3[cont] = array1[i];
			cont++;
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Dime otros numeros");
			array2[i] = sn.nextInt();
			array3[cont] = array2[i];
			cont++;
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ", ");

		}

	}
}