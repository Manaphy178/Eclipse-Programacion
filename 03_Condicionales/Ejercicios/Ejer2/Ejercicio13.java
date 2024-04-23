package Ejer2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double num = 0;
		System.out.print("Dime tu nota: ");
		num = sn.nextDouble();
		if (num >= 9 && num <= 10) {
			System.out.print("Has sacado un sobresaliente");
		} else if (num >= 7 && num <= 8) {
			System.out.print("Has sacado un notable");
		} else if (num >= 6 && num < 7) {
			System.out.print("Has sacado un bien");
		} else if (num >= 5 && num < 6) {
			System.out.print("Has sacado un suficiente");
		} else if (num < 5 && num >= 0) {
			System.out.print("Has suspendido");
		}
	}
}
