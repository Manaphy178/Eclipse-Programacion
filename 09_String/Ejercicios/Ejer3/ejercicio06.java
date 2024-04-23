package Ejer3;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String consonantes = "qwrtypsdfghjklñzxcvbnm";

		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		String aux = "";
		for (int i = 0; i < frase.length(); i++) {
			if (consonantes.contains(String.valueOf(frase.charAt(i)))) {
				aux += String.valueOf(frase.charAt(i)).toUpperCase();
			} else {
				aux += frase.charAt(i);
			}
		}
		frase = aux;
		System.out.println(frase);
	}
}
