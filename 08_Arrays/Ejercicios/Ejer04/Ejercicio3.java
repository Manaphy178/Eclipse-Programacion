package Ejer04;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		int cont = 1;

		System.out.println("Dime la longitud");
		int[] array1 = new int[sn.nextInt()];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = cont;
			cont++;
		}
		cont = 0;
		if (array1.length % 2 == 0) {
			int[] array2 = new int[array1.length / 2];
			int[] array3 = new int[array1.length / 2];
			System.out.println("Array 2");
			for (int i = 0; i < array2.length; i++) {
				array2[i] = array1[cont];
				System.out.println(array2[i]);
				cont++;
			}
			System.out.println("Array 3");
			for (int i = 0; i < array3.length; i++) {
				array3[i] = array1[cont];
				System.out.println(array3[i]);
				cont++;
			}
		}
		if (array1.length % 2 != 0) {
			int[] array2 = new int[array1.length / 2];
			int[] array3 = new int[array1.length / 2];
			int[] array4 = new int[array1.length % 2];
			System.out.println("Array 2");
			for (int i = 0; i < array2.length; i++) {
				array2[i] = array1[cont];
				System.out.println(array2[i]);
				cont++;
			}
			System.out.println("Array 3");
			for (int i = 0; i < array3.length; i++) {
				array3[i] = array1[cont];
				System.out.println(array3[i]);
				cont++;
			}

			System.out.println("Array 4");
			for (int i = 0; i < array4.length; i++) {
				array4[i] = array1[cont];
				System.out.println(array4[i]);
				cont++;
			}
		}
	}

}