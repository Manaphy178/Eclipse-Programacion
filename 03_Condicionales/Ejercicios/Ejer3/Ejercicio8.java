package Ejer3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int res = 0;
		System.out.print("Dime un numero: ");
		num1 = sn.nextInt();
		System.out.print("Dime otro numero: ");
		num2 = sn.nextInt();
		System.out.print("Dime otro numero: ");
		num3 = sn.nextInt();
		res = num1 + num2 + num3;
		if (res >= 0) {
			System.out.print("La suma " + res + " es positiva");
		} else if (res < 0) {
			System.out.println("La suma es negativa: " + res + ". Se mostrara los numeros negativos: ");
			if (num1 < 0) {
				System.out.println(num1);
			}	
			if (num2 < 0) {
				System.out.println(num2);
			}
			if (num3 < 0) {
				System.out.println(num3);
			}
		}
	}

}
