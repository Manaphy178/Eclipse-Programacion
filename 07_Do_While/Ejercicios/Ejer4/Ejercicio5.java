package Ejer4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		boolean esPrimo = true;
		int num = 0;
		int veces = 0;
		boolean contar = true;
		do {
			System.out.println("Dime un numero");
			num = sn.nextInt();
			contar = true;
			for (int i = 2; i < num; i++) {
				esPrimo = true;
				if (num % i == 0) {
					esPrimo = false;
					if (contar == true) {
						veces++;
						contar = false;
					}
					break;
				}

			}

		} while (esPrimo == false);
		System.out.println("Has dicho " + veces + " numeros que no son primos");
	}

}
