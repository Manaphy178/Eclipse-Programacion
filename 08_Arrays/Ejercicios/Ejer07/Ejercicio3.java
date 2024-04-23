package Ejer07;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Master, dime un numero: ");
		int[] numeros = new int[sn.nextInt()];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;

		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			System.out.println(numeros[numeros.length - 1 - i]);
		}

	}
}