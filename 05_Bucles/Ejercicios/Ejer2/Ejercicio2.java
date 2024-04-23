package Ejer2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 1;
		double raiz = 0;
		while (num != 0) {
			System.out.print("Dime un numero: ");
			num = sn.nextInt();
			if (num != 0) {
				if (num % 2 == 0) {
					System.out.println("El numero es par");
				} else {
					System.out.println("El numero es impar");
				}
				if (num > 0) {
					System.out.println("El numero es positivo");
					raiz = Math.sqrt(num);
					System.out.println("La raiz cuadrada de este numero es: " + raiz);
				} else {
					System.out.println("El numero es negativo");
				}

			}

		}
		System.out.println("Chaoooo.");

	}

}
