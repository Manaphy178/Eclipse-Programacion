package Ejer5;

import java.util.*;

public class ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una frase");
		String frase = sc.nextLine() + " ";
		String[] palabras = frase.split(" ");
		String palabra = "";
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > mayor) {
				palabra = palabras[i];
				mayor = palabras[i].length();
			}
		}
		System.out.println("La palabra mas larga es " + palabra + " con " + mayor + " letras");
	}

}
