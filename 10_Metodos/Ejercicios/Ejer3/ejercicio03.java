package Ejer3;

import java.util.*;

public class ejercicio03 {

	public static void main(String[] args) {
		String palabras = pedir();
		System.out.println(consonantes(palabras));
	}

	static String pedir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		return frase;
	}

	static String consonantes(String frase) {
		String vocales = "aeiou";
		String aux = "";
		boolean vocal = false;
		for (int i = 0; i < frase.length(); i++) {
			vocal = false;
			for (int j = 0; j < vocales.length(); j++) {
				if (frase.charAt(i) == vocales.charAt(j)) {
					vocal = true;
				}

			}
			if (vocal) {
				aux += String.valueOf(frase.charAt(i));
			} else {
				aux += String.valueOf(frase.charAt(i)).toUpperCase();
			}
		}
		return aux;
	}

}
