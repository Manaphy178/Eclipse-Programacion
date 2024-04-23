package Ejer3;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] nombres = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Dime tu nombre");
			nombres[i] = sc.nextLine();
		}
		for (int i = 0; i < nombres.length; i++) {
			String nombre = "";
			for (int j = 0; j < nombres[i].length(); j++) {
				if (nombres[i].charAt(j) == 'a') {
					nombre = nombre + 'x';
				} else if (nombres[i].charAt(j) == 'o') {
					nombre = nombre + '0';
				} else {
					nombre = nombre + nombres[i].charAt(j);
				}
			}
			nombres[i] = nombre;
		}
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}
}