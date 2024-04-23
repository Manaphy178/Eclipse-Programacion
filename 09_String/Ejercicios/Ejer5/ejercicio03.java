package Ejer5;

import java.util.*;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		System.out.println("Dame una frase");
		String frase = sc.nextLine() + " ";

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				cont++;
			}
		}
		System.out.println("Hay " + cont + " palabras");
	}

}
