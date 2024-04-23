package Ejer4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Dime un numero: ");
		num = sn.nextInt();
		if (num % 2 == 0) {
			if (num % 3 == 0) {
				System.out.println("Su numero es multiplo de 2 y de 3");
			}else {
				System.out.println("Su numero es multiplo de 2");
			}
		}else if (num % 3 == 0 && num % 2 != 0) {
			System.out.println("Su numero es multiplo de 3");
		}else {
			System.out.println("Su numero no es multiplo de 2 o 3");
		}
	}

}
