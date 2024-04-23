package Ejer4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int primos = 0;
		int par = 0;
		int impar = 1;
		boolean esPrimo = true;
		for (int i = 2; i <= 100; i++) {
			for (int x = 2; x < i; x++) {
				esPrimo = true;
				if (i % x == 0) {
					esPrimo = false;
					break;
				}
			}
			if (i % 2 == 0) {
				par = par + i;
			}
			if (i % 2 != 0) {
				impar = impar + i;
			}
			if (esPrimo == true) {
				primos = primos + i;
			}

		}
		System.out.println("La suma de todos los numeros pares es: " + par);
		System.out.println("La suma de todos los numeros impares es: " + impar);
		System.out.println("La suma de todos los numeros primos es: " + primos);

	}

}
