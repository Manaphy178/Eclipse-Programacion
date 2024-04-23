package Ejer1;

import java.util.*;

public class ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		System.out.println("La palabra mas larga es: " + ejercicio05.masLetras(frase));
	}

	static String masLetras(String cadena) {
		String[] palabras = cadena.split(" ");
		String larga = "";
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > max) {
				max = palabras[i].length();
				larga = palabras[i];
			}
		}
		return larga;
	}
}
