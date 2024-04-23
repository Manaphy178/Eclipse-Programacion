package Tema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[30];
		for (int i = 0; i < array1.length; i++) {
			int ran = (int) (Math.random() * 100);
			array1[i] = ran;
		}
		boolean primo = true;
		boolean impar = false;
		int numfinal = 0;
		int prim = 0;
		for (int i = 0; i < array1.length; i++) {
			primo = true;

			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}

			if (primo && array1[i] != 1) {
				prim++;
			}
		}
		if (prim % 2 != 0) {
			numfinal = 0;
			impar = true;
		}
		int mitad1 = prim / 2;
		int mitad2 = prim / 2;
		int[] array2 = new int[mitad1];
		int[] array3 = new int[mitad2];
		int[] primos = new int[prim];
		int index = 0;
//		Hay un error si los arrays son impares
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (array1[i] < 1) {
				primo = false;
			}
			if (primo && array1[i] != 1) {
				primos[index] = array1[i];
				index++;

			}
		}
		index = 0;
		for (int i = 0; i < mitad1; i++) {
			array2[index] = primos[i];
			index++;
		}
		index = 0;
		for (int i = mitad2; i < primos.length - 1; i++) {
			array3[index] = primos[i];
			index++;
		}
		System.out.println("Array2");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("Array3");
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		if (impar) {
			for (int i = primos.length - 1; i < primos.length; i++) {
				numfinal = primos[i];
			}
			System.out.println("Numero impar");
			System.out.println(numfinal);
		}
	}

}
