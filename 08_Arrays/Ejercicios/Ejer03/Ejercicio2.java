package Ejer03;

import java.util.Scanner;

public class Ejercicio2 {

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
			System.out.print("Dime otro numero mas: ");
			num3[i] = sn.nextInt();

		}
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == num2[i]) {
				if (num1[i] == num3[i]) {
					if (num2[i] == num3[i]) {
						System.out.println("Los 3 numeros son iguales. " + num1[i] + "-" + num2[i] + "-" + num3[i]);
					} else {
						System.out.println("El segundo numero y el tercero no son los mismos. " + num1[i] + "-"
								+ num2[i] + "-" + num3[i]);
					}
				} else {
					System.out.println(
							"El primer numero y el tercero no son iguales. " + num1[i] + "-" + num2[i] + "-" + num3[i]);
				}
			} else {
				System.out.println(
						"El primer numero y el segundo no son iguales. " + num1[i] + "-" + num2[i] + "-" + num3[i]);
			}
		}

	}

}
