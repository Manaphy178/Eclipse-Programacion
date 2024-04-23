package Ejer5;

import java.util.*;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una frase");
		String frase = sc.nextLine() + " ";
		String palabra = "";
		String conjunto = "";
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				if (conjunto.length() > mayor) {
					palabra = conjunto;
					mayor = conjunto.length();
				}
				conjunto = "";
			} else {
				conjunto += frase.charAt(i);
			}
		}
		System.out.println("La palabra mas larga es " + palabra + " con " + mayor + " letras");
	}

}
