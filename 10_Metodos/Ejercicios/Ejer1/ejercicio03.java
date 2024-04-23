package Ejer1;

import java.util.*;

public class ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		System.out.println("Hay " + ejercicio03.contadorMayusculas(frase) + " mayusculas");

	}

	static int contadorMayusculas(String cadena) {
		int cont = 0;
		cadena = cadena.replaceAll(" ", "");
		String frase = cadena.toUpperCase();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == frase.charAt(i)) {
				cont++;
			}

		}
		return cont;
	}
}
