package Ejer2;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num = 0;
		double res = 1;
		System.out.println("Dime un numero: ");
		num = sn.nextInt();
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}
		System.out.println("El factorial del numero " + num + " es: " + res);
	}
}
