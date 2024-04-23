package Ejer3;

import java.util.*;

public class ejercicio01 {

	public static void main(String[] args) {
		String[] palabras = pedir();
		char letra = letra();
		int[] veces = letras(palabras, letra);
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i] + ": " + veces[i]);
		}
	}

	static String[] pedir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String[] frase = sc.nextLine().trim().split(" ");
		return frase;
	}

	static char letra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la letra que quieres coger, se va a coger la primera letra");
		String palabra = sc.nextLine().trim();
		char letra = palabra.charAt(0);
		return letra;
	}

	static int[] letras(String[] palabra, char letra) {
		int[] veces = new int[palabra.length];
		for (int i = 0; i < palabra.length; i++) {
			int cont = 0;
			for (int j = 0; j < palabra[i].length(); j++) {
				if (palabra[i].charAt(j) == (letra)) {
					cont++;
					veces[i] = cont;
				}

			}
		}
		return veces;
	}
}
