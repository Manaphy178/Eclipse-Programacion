package Ejer03;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] num = new int[10];
		int suma = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("Dime un numero: ");
			num[i] = sn.nextInt();
			suma = suma + num[i];
		}
		System.out.println("La suma total de todos los numeros es: " + suma);

	}

}
