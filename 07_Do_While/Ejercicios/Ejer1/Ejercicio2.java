package Ejer1;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int num = 0;
		int mult = 0;
		int res = 0;
		System.out.println("Introduce un numero entre el 1 y el 10:");
		num = sn.nextInt();
		if (num >= 0 && num <= 10) {
			do {
				res = num * mult;
				System.out.println(num + "*" + mult + " = " + res);
				mult++;
			} while (mult <= 10);
		} else {
			System.out.println("Ese número no es del 1 al 10");
		}
	}

}
