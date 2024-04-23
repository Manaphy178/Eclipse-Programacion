package Ejer07;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] numeros = new int[25];
		int cont = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un numero");
			numeros[i] = sn.nextInt();
			if (numeros[i] == 10) {
				cont++;
			}
		}
		if (cont > 0) {
			System.out.println("Se ha dicho el numero 10:" + cont + " veces");
		} else {
			System.out.println("No se ha introducido ningun 10");
		}
	}
}