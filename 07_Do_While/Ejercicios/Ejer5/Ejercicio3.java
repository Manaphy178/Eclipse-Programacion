package Ejer5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Dime un numero");
		double num = sn.nextDouble();
		double fac = 1;
		for (int i = 1; i < num; i++) {
			fac = (i * fac);
		}
		System.out.println(fac);
	}
}
