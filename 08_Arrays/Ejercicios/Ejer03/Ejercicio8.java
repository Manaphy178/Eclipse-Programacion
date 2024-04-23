package Ejer03;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		int[] num1 = new int[5];
		int[] posi = new int[5];
		int cont = 0;

		for (int i = 0; i < num1.length; i++) {
			System.out.println("Dime un numero");
			num1[i] = sn.nextInt();
		}
		System.out.println("Que numero quieres buscar");
		int busca = sn.nextInt();

		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == busca) {
				posi[cont] = i;
				System.out.print(posi[cont] + " ");
				cont++;

			}
		}

	}

}
