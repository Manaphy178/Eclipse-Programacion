package Ejer2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double num = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextDouble();
		if (num < 0) {
			System.out.print("El número porporcionado es negativo");
		} else if (num >= 0) {
			System.out.print("El número porporcionado es positivo");
		}
	}

}
