package Ejer2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double num2 = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextDouble();
		System.out.print("Dime otro numero: ");
		num2 = sn.nextDouble();
		if (num < num2) {
			System.out.print(num2 + "->" + num);
		} else if (num2 < num) {
			System.out.print(num + "->" + num2);
		} else {
			System.out.print("Los numeros son iguales");
		}
	}

}
