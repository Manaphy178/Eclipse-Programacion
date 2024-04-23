package Ejer2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextInt();
		if (num > 100 || num < 67) {
			System.out.print("Su número es mayor que 100 o menor que 67");
		}
	}

}
