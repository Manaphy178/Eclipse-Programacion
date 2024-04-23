package Ejer4;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase o palabra");
		String frase = sc.nextLine();
		String consonantes = "qwrtypsdfghjklñzxcvbnm";
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (consonantes.contains(String.valueOf(frase.charAt(i)))) {
				cont++;
			}
		}
		System.out.println(cont);

	}
}