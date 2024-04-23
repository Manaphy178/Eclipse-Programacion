package Ejer1;

import java.util.*;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		System.out.println("Hay " + ejercicio02.contadorConsonantes(frase) + " consonantes");

	}

	static int contadorConsonantes(String cadena) {
		int cont = 0;
		cadena = cadena.replaceAll(" ", "");
		String vocal = "aeiouAEIOU";
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < vocal.length(); j++) {
				if (!vocal.contains(String.valueOf(cadena.charAt(i)))) {
					cont++;
					break;

				}
			}
		}
		return cont;
	}
}
