package Ejer1;

import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cero = 0;
		int diez = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Dime un numero entero: ");
			num = sn.nextInt();
			if (num == 0) {
				cero++;
			} else if (num == 10) {
				diez++;
			}
		}
		System.out.println("Has dicho el numero 0: " + cero + " veces");
		System.out.println("Has dicho un numero 10: " + diez + " veces");
	}

}