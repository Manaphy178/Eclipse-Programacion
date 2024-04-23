package Ejer4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int cinco = 0;
		int seis = 0;
		int cuatro = 0;
		int todo = 0;
		int num = 0;
		for (int i = 1; i <= 8; i++) {
			System.out.println("Dime un numero:");
			num = sn.nextInt();
			if (num % 5 == 0) {
				cinco++;
			}
			if (num % 4 == 0) {
				cuatro++;
			}
			if (num % 6 == 0) {
				seis++;
			}
			if (num % 4 == 0) {
				if (num % 5 == 0) {
					if (num % 6 == 0) {
						todo++;
					}
				}
			}

		}
		System.out.println("Has dicho un numero multiplo de 4: " + cuatro + " veces");
		System.out.println("Has dicho un numero multiplo de 5: " + cinco + " veces");
		System.out.println("Has dicho un numero multiplo de 6: " + seis + " veces");
		System.out.println("Has dicho un numero multiplo de 4, 5 y 6: " + todo + " veces");

	}

}
