package Ejer1;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Dime tu nombre y apellido");
			String nomape = sc.nextLine();
			if (nomape.contains("Antonio")) {
				cont++;
			}
		}
		System.out.println("Has introducido " + cont + " Antonios");
	}
}