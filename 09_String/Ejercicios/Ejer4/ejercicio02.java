package Ejer4;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase o palabra");
		String frase = sc.nextLine();
		String vocales = "aeiou";
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < vocales.length(); j++) {
				if (frase.charAt(i) == vocales.charAt(j)) {
					cont++;
				}
			}
		}
		System.out.println(cont);

	}
}