package Ejer4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double res = 0;
		System.out.println("Dime un numero: ");
		num = sn.nextDouble();
		if (num < 1000) {
			res = 1000 - num;
			System.out.println("Te faltan " + res + " para llegar a 1000");
		} else if (num > 1000) {
			res = 15000 - num;
			System.out.println("Te quedan " + res + " para llegar a 15000");
		} else if (num == 1000) {
			res = num * 0.03;
			System.out.print("El 3% de tu numero es: " + res);
		}
	}

}
