package Ejer03;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		int[] num3 = new int[5];
		for (int i = 0; i < num1.length; i++) {
			System.out.print("Dime un numero: ");
			num1[i] = sn.nextInt();
			System.out.print("Dime otro numero: ");
			num2[i] = sn.nextInt();

		}
		System.out.println("Resultados:");
		for (int i = 0; i < num1.length; i++) {
			num3[i] = num1[i] * num2[i];
			System.out.println(num1[i] + "*" + num2[i] + "=" + num3[i]);
		}

	}

}
