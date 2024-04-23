package Ejer03;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero = sn.nextInt();

		int[] num1 = new int[numero];

		for (int i = 0; i < num1.length; i++) {
			num1[i] = i + 1;
		}
		for (int i = num1.length - 1; i >= 0; i--) {
			for (int x = 0; x < num1[i]; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
