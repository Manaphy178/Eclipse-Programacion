package Ejer4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double res = 0;
		System.out.println("Dime un numero: ");
		num1 = sn.nextDouble();
		System.out.println("Dime otro numero: ");
		num2 = sn.nextDouble();
		if (num1 > num2) {
			res = num2 / num1;
			System.out.println("El resultado de la division es: " + res);
		} else if (num2 > num1) {
			res = num1 / num2;
			System.out.println("El resultado de la division es: " + res);
		}else if (num1 == num2 ) {
			System.out.println("Los dos numeros son iguales");
			res = num2 / num1;
			System.out.println("El resultado de la division es: " + res);
		}
	}

}
