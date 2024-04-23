package Ejer1;

import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int indice = 0;
		int total = 0;
		System.out.println("Dime un numero: ");
		num1 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num2 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num3 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num4 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num5 = sn.nextInt();
		total = num1 + num2 + num3 + num4 + num5;
		do {
			System.out.println("Hello my friend");
			indice++;
		} while (indice < total);
	}

}
