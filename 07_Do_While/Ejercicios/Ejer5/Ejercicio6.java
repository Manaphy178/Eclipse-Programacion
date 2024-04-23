package Ejer5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num = 1;
		for (int i = 0; i < num; i = 0) {
			System.out.print("Dime un número: ");
			num = sn.nextInt();
			if (num % 1 == 0) {
				if (num % 13 == 0) {
					if (num % 30 == 0) {
						System.out.println("El número es Nelsoniano");
						System.out.println("");
						break;
					} else {
						System.out.println("El número no es Nelsoniano");
						System.out.println("");
					}
				} else {
					System.out.println("El número no es Nelsoniano");
					System.out.println("");
				}
			}
			System.out.println("Para salir del programa introduzca un valor menor que 0 o un Nelsoniano");
			System.out.println("");
		}
	}
}
