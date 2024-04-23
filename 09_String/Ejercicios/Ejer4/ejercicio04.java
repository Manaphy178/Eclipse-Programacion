package Ejer4;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase o palabra");
		String frase = sc.nextLine();
		String consonantes = "qwrtypsdfghjklñzxcvbnm";
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < consonantes.length(); j++) {
				if (frase.charAt(i) == consonantes.charAt(j)) {
					cont++;
				}
			}
		}
		System.out.println(cont);
	}
}