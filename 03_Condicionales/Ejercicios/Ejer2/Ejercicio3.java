package Ejer2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double num2 = 0;
		double resu = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextInt();
		System.out.print("Dime otro numero: ");
		num2 = sn.nextInt();
		resu = num * num2;
		if (resu >= 200) {
			System.out.print("La multiplicacion da igual o mas de 200");
		} else {
			System.out.print("La multiplicacion no ha llegado al 200");
		}
	}

}
