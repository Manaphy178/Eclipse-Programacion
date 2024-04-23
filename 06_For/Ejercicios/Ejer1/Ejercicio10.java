package Ejer1;

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nom = "";
		int num = 0;
		int nueve = 0;
		for (int i = 0; i < 20; i++) {
			System.out.print("Dime un numero entero: ");
			num = sn.nextInt();
			if (num == 9) {
				nueve++;
			}
		}
		System.out.println("Has dicho el numero 9: " + nueve + " veces");

	}

}
