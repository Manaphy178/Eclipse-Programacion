package Ejer11;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Longitud del array: ");
		int longi = sn.nextInt();
		int[] array1 = new int[longi];
		int[] array2 = new int[longi];
		int[] array3 = new int[longi];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para array1");
			array1[i] = sn.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Dime numeros para array2");
			array2[i] = sn.nextInt();
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.println("Dime numeros para array3");
			array3[i] = sn.nextInt();
		}
		int contPri = 0;
		boolean primo = true;
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
		int[] array4 = new int[contPri];
		int index = 0;
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				array4[index] = array1[i];
				index++;
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
				array4[index] = array2[i];
				index++;
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
				array4[index] = array3[i];
				index++;
			}
		}
		if (array4.length % 2 == 0) {
			int primos[] = new int[array4.length];
			for (int i = 0; i < primos.length; i++) {
				primos[i] = array4[i];
				System.out.print(primos[i] + ", ");
			}
		} else {
			index = 0;
			int medio = array4.length / 2;
			int primos[] = new int[array4.length - 2];
			for (int i = 0; i < primos.length + 2; i++) {
				if (i == medio - 1) {
					i++;
				} else if (i == medio + 1) {
					i++;
				}
				primos[index] = array4[i];
				System.out.print(primos[index] + ", ");
				index++;
			}
		}
	}
}