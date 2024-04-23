package Ejer1;

import java.util.*;

public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		System.out.println("Hay " + ejercicio04.contadorMinusculas(frase) + " minusculas");

	}

	static int contadorMinusculas(String cadena) {
		int cont = 0;
		cadena = cadena.replaceAll(" ", "");
		String frase = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == frase.charAt(i)) {
				cont++;
			}

		}
		return cont;
	}
}
