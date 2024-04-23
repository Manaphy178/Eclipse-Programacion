package Ejer09;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Esto no lo has pedido pero es para poner la longitud de los arrays de una: ");
		int longi = sn.nextInt();
		int[] array1 = new int[longi];
		int contPri = 0, contMen = 0, contImp = 0;
		boolean primo = true;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para el array1");
			array1[i] = sn.nextInt();
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
			if (array1[i] < 100) {
				contMen++;
			}
			if (array1[i] % 2 != 0) {
				contImp++;
			}
		}
		int[] primos = new int[contPri];
		int[] menores = new int[contMen];
		int[] ultimo = new int[1];
		int[] impares = new int[contImp];
		contPri = 0;
		contImp = 0;
		contMen = 0;
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
			if (array1[i] < 100) {
				menores[contMen] = array1[i];
				contMen++;
			}
			if (array1[i] % 2 != 0) {
				impares[contImp] = array1[i];
				contImp++;
			}
			if (i == array1.length - 1) {
				ultimo[0] = array1[i];
			}
		}
		System.out.print("\rPrimos: ");
		for (int i = 0; i < primos.length; i++) {
			if (i == primos.length - 1) {
				System.out.print(primos[i] + ".");
			} else {
				System.out.print(primos[i] + ", ");
			}
		}
		System.out.print("\rImpares: ");
		for (int i = 0; i < impares.length; i++) {
			if (i == impares.length - 1) {
				System.out.print(impares[i] + ".");
			} else {
				System.out.print(impares[i] + ", ");
			}
		}
		System.out.print("\rMenores que 100: ");
		for (int i = 0; i < menores.length; i++) {
			if (i == menores.length - 1) {
				System.out.print(menores[i] + ".");
			} else {
				System.out.print(menores[i] + ", ");
			}
		}
		System.out.print("\rUltimo numero del array: ");
		for (int i = 0; i < ultimo.length; i++) {
			System.out.print(ultimo[i]);
		}
	}
}