package Ejer2;

import java.util.Scanner;

public class Ejercicio6_Jorge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int max = 0;
		int min = 0;
		int mid = 0;
		boolean si = false;
		while (si == false) {
			System.out.println("Dime un número: ");
			num1 = sn.nextInt();
			System.out.println("Dime un número: ");
			num2 = sn.nextInt();
			if (num1 > num2) {
				max = num1;
				min = num2;
				si = true;
			} else if (num2 > num1) {
				max = num2;
				min = num1;
				si = true;
			} else {
				System.out.println("Has puesto los dos mismos números, cabron");
			}
		}
		System.out.println("Dime un número que este entre esos dos rangos: ");
		mid = sn.nextInt();
		while (mid > max || mid < min) {
			System.out.println("Ese número no esta entre esos dos rangos, introduzca de nuevo el número: ");
			mid = sn.nextInt();
		}
		System.out.println("Muy bien");
	}
}
