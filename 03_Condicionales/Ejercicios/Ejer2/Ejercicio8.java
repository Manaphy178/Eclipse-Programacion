package Ejer2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double num2 = 2;
		double resu = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextDouble();
		resu = num % num2;
		if (resu == 1) {
			System.out.print("El numero es impar");
		} else {
			System.out.print("El numero es par");
		}
	}

}
