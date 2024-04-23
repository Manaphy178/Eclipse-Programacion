package Ejer1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int num = 0;
		int opt = 0;
		int cero = 0;
		int diez = 0;
		while (opt != 20) {
			System.out.print("Dime un número: ");
			num = sn.nextInt();
			if (num == 0) {
				cero++;
			} else if (num == 10) {
				diez++;
			}
			opt++;
		}
		System.out.println("Has dicho el numero diez: " + diez + " veces");
		System.out.println("Has dicho el numero cero: " + cero + " veces");
	}

}
