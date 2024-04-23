package Ejer1;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] nombres = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Dime tu nombre");
			nombres[i] = sc.nextLine();
			nombres[i] = nombres[i].replace("o", "0");
			nombres[i] = nombres[i].replace("a", "X");
		}
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}
}