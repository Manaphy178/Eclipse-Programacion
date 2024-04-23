package Ejer4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String resp = "";
		int num = 0;
		int pares = 0;
		int impar = 0;
		int primo = 0;
		int menor = Integer.MAX_VALUE; // Esto es para pillar el numero mas alto que puede un Int

		boolean esPrimo = true;

		do {
			System.out.println("Dime un numero");
			num = sn.nextInt();
			for (int i = 2; i < num; i++) {
				esPrimo = true;

				if (num % i == 0) {
					esPrimo = false;
					break;
				}

			}
			if (num % 2 == 0) {
				pares++;
			}
			if (num % 2 != 0) {
				impar++;
			}
			if (esPrimo == true) {
				primo++;
			}
			if (menor > num) {
				menor = num;
			}
			System.out.println("Quieres volver a introducir un numero?");
			resp = sc.nextLine();
		} while (!resp.equalsIgnoreCase("no"));
		System.out.println("Has introducido " + pares + " numeros pares");
		System.out.println("Has introducido " + impar + " numeros impares");
		System.out.println("Has introducido " + primo + " numeros primos");
		System.out.println("El numero menor que has introducido es: " + menor);
	}

}
