package Ejer03;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		int[] num1 = new int[5000];
		int cont1 = 0;
		int cont6 = 0;
		for (int i = 0; i < num1.length; i++) {
			int ran = (int) (Math.random() * 7);
			num1[i] = ran;
			if (num1[i] == 1) {
				cont1++;
			}
			if (num1[i] == 6) {
				cont6++;
			}
		}
		System.out.println("Ha salido el numero 1: " + cont1 + " veces");
		System.out.println("Ha salido el numero 6: " + cont6 + " veces");

	}

}
