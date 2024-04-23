package Ejer10;

import java.util.Scanner;

public class Ejercicio3_Jorge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.print("Longitud del array: ");
		int longi = sn.nextInt();
		int[] array1 = new int[longi];
		int[] array2 = new int[longi];
		int[] array3 = new int[longi];
		int contPar = 0;
		int numFinal = 0;
		int index=0;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para array1");
			array1[i] = sn.nextInt();
			System.out.println("Dime numeros para array2");
			array2[i] = sn.nextInt();
			System.out.println("Dime numeros para array3");
			array3[i] = sn.nextInt();
			if (array1[i] % 2 == 0) {
				contPar++;
			}
			if (array2[i] % 2 == 0) {
				contPar++;
			}
			if (array3[i] % 2 == 0) {
				contPar++;
			}
		}
		int[] pares = new int[contPar];
		int[] impar = new int[contPar - 1];
		index = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0 && array1[i] != 0) {
				pares[index] = array1[i];
				index++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0 && array2[i] != 0) {
				pares[index] = array2[i];
				index++;
			}
		}
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] % 2 == 0 && array3[i] != 0) {
				pares[index] = array3[i];
				index++;
			}
		}
		index = 0;
		for (int i = 0; i < pares.length; i++) {
			if (i != pares.length / 2) {
				impar[index] = pares[i];
				index++;
			}
		}
		if (contPar % 2 == 0) {
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
