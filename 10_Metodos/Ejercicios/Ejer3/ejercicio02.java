package Ejer3;

import java.util.*;

public class ejercicio02 {

	public static void main(String[] args) {
		String[] palabras = pedir();
		char[] letras = letra();
		for (int i = 0; i < palabras.length; i++) {
			if (letras(palabras, letras)) {
				System.out.println(palabras[i]+" tiene las letras indicadasf");
			}
			
		}
	}

	static String[] pedir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String[] frase = sc.nextLine().trim().split(" ");
		return frase;
	}

	static char[] letra() {
		Scanner sc = new Scanner(System.in);
		char[] letra = new char[3];
		for (int i = 0; i < letra.length; i++) {
			System.out.println("Dime la letra que quieres buscar");
			String palabra = sc.nextLine().trim();
			letra[i] = palabra.charAt(0);
		}
		return letra;
	}

	static boolean letras(String[] palabra, char[] letra) {
		int[] veces = new int[palabra.length];
		boolean tiene=false;
		for (int i = 0; i < palabra.length; i++) {
			int cont = 0;
			tiene=false;
			for (int j = 0; j < letra.length; j++) {
				if (palabra[i].contains(String.valueOf(letra[j]))) {
					cont++;
					veces[i] = cont;
				}

			}
			if (cont>=3) {
				tiene=true;
			}
		}
		return tiene;
	}
}
