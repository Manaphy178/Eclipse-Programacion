package Ejer2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextInt();
		if (num == 0 || num >= 200) {
			System.out.print("Su número es el 0 o mayor que 200");
		}
	}
}
