package Ejer1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int num = 0;
		int opt = 0;
		int nueve = 0;
		while (opt != 20) {
			System.out.print("Dime un número: ");
			num = sn.nextInt();
			if (num == 9) {
				nueve++;
			}
			opt++;
		}
		System.out.println("Has dicho el numero nueve:" + nueve + " veces");

	}

}
