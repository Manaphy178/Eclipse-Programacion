package Ejer4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int posicion = 0;
		int num = 0;
		int num_max = Integer.MIN_VALUE;
		for (int i = 1; i <= 30; i++) {
			System.out.println("Dime un numero");
			num = sn.nextInt();
			if (num > num_max) {
				posicion = i;
				num_max = num;
			}

		}
		System.out.println("La posicion el numero mas alto es: " + posicion + "º. " + num_max);
	}

}
