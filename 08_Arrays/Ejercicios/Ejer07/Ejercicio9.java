package Ejer07;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[10];
		int par = 0, impar = 0;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros");
			array1[i] = sn.nextInt();
			if (array1[i] % 2 == 0) {
				par++;
			} else if (array1[i] % 2 != 0) {
				impar++;
			}
		}
		int[] pares = new int[par];
		int[] impares = new int[impar];
		par = 0;
		impar = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				pares[par] = array1[i];
				par++;
			}
			if (array1[i] % 2 != 0) {
				impares[impar] = array1[i];
				impar++;
			}
		}
		System.out.print("\r Pares: ");
		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[i] + ", ");
		}
		System.out.println();
		System.out.print("Impares: ");
		for (int i = 0; i < impares.length; i++) {
			System.out.print(impares[i] + ", ");
		}
	}
}