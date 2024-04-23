package Ejer3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int res = 0;
		System.out.print("Dime un numero y te digo si es par o impar: ");
		num = sn.nextInt();
		res = num % 2;
		if (res == 0) {
			System.out.print("Tu numero es par");
		} else {
			System.out.print("Tu numero es impar");
		}
	}

}
