package Ejer10;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.print("Longitud del array: ");
		int longi = sn.nextInt();
		int[] array1 = new int[longi];
		int[] array2 = new int[longi];
		int[] array3 = new int[longi];
		int par = 0;
		int cont = 0;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para array1");
			array1[i] = sn.nextInt();
			System.out.println("Dime numeros para array2");
			array2[i] = sn.nextInt();
			System.out.println("Dime numeros para array3");
			array3[i] = sn.nextInt();
			if (array1[i] % 2 == 0) {
				par++;
			}
			if (array2[i] % 2 == 0) {
				par++;
			}
			if (array3[i] % 2 == 0) {
				par++;
			}
		}
		int[] pares = new int[par];
		int[] impar = new int[par - 1];
		cont = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0 && array1[i] != 0) {
				pares[cont] = array1[i];
				cont++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0 && array2[i] != 0) {
				pares[cont] = array2[i];
				cont++;
			}
		}
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] % 2 == 0 && array3[i] != 0) {
				pares[cont] = array3[i];
				cont++;
			}
		}

		cont = 0;
		for (int i = 0; i < pares.length; i++) {
			if (i != pares.length / 2) {
				impar[cont] = pares[i];
				cont++;
			}
		}
		if (par % 2 == 0) {
			System.out.println("Pares:");
			for (int i = 0; i < pares.length; i++) {
				System.out.print(pares[i] + ", ");
			}
		} else {
			System.out.println("Impares:");
			for (int i = 0; i < impar.length; i++) {
				System.out.print(impar[i] + ", ");
			}
			System.out.println();
			System.out.println("Nº Final: " + pares[pares.length / 2]);
		}

	}
}
