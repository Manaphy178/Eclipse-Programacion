package Ejer04;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Dime un numero");
		int[] array1 = new int[sn.nextInt()];
		System.out.println("Dime otro numero");
		int[] array2 = new int[sn.nextInt()];
		int[] array3 = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros");
			array1[i] = sn.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Dime numeros");
			array2[i] = sn.nextInt();
		}
		int cont = 0;
		for (int i = array1.length - 1; i < array1.length; i--) {
			array3[cont] = array1[i];
			cont++;
		}
		for (int i = array2.length - 1; i < array2.length; i--) {
			array3[cont] = array2[i];
			cont++;
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ", ");
		}

	}

}
