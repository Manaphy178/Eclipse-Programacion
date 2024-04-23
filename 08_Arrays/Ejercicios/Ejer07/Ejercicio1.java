package Ejer07;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] numeros = new int[25];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un numero");
			numeros[i] = sn.nextInt();
		}
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}
}