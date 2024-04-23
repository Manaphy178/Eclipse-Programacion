package Ejer09;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Esto no lo has pedido pero es para poner la longitud de los arrays de una: ");
		int longi = sn.nextInt();
		int[] array1 = new int[longi];
		int[] array2 = new int[longi];
		int[] array3 = new int[longi];
		int contPri = 0;
		boolean primo = true;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para el array1");
			array1[i] = sn.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Dime numeros para el array2");
			array2[i] = sn.nextInt();
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.println("Dime numeros para el array3");
			array3[i] = sn.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				contPri++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			primo = true;
			for (int j = 2; j < array2[i]; j++) {
				if (array2[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				contPri++;
			}
		}
		for (int i = 0; i < array3.length; i++) {
			primo = true;
			for (int j = 2; j < array3[i]; j++) {
				if (array3[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				contPri++;
			}
		}
		int[] primos = new int[contPri];
		contPri = 0;
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				primos[contPri] = array1[i];
				contPri++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			primo = true;
			for (int j = 2; j < array2[i]; j++) {
				if (array2[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				primos[contPri] = array2[i];
				contPri++;
			}
		}
		for (int i = 0; i < array3.length; i++) {
			primo = true;
			for (int j = 2; j < array3[i]; j++) {
				if (array3[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				primos[contPri] = array3[i];
				contPri++;
			}
		}
		System.out.print("Primos: ");
		for (int i = 0; i < primos.length; i++) {
			if (i == primos.length - 1) {
				System.out.print(primos[i] + ".");
			} else {
				System.out.print(primos[i] + ", ");
			}
		}
	}
}