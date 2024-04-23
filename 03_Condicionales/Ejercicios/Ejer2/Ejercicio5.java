package Ejer2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double num2 = 0;
		double resu = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextDouble();
		System.out.print("Dime otro numero: ");
		num2 = sn.nextDouble();
		resu = num + num2;
		if (resu >= 100 || resu <= 200) {
			System.out.print("La suma de los números da entre 100 y 200");
		}
	}

}
