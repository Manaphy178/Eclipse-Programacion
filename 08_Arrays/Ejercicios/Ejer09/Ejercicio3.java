package Ejer09;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[16];
		int contPri = 0, contPare = 0, contImpa = 0;
		boolean primo = true;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para el array");
			array1[i] = sn.nextInt();
			if (array1[i] % 2 == 0) {
				contPare++;
			} else {
				contImpa++;
			}
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
		int[] primos = new int[contPri];
		int[] pares = new int[contPare];
		int[] impares = new int[contImpa];
		contPri = 0;
		contImpa = 0;
		contPare = 0;
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
			if (array1[i] % 2 == 0) {
				pares[contPare] = array1[i];
				contPare++;
			} else if (array1[i] % 2 != 0) {
				impares[contImpa] = array1[i];
				contImpa++;
			}
		}
		System.out.print("Primos: ");
		for (int i = 0; i < primos.length; i++) {
			System.out.print(primos[i] + ", ");
		}
		System.out.print("\rPares: ");
		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[i] + ", ");
		}
		System.out.print("\rImpares: ");
		for (int i = 0; i < impares.length; i++) {
			System.out.print(impares[i] + ", ");
		}
	}
}
