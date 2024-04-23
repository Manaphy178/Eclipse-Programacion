package Ejer5;

import java.util.*;

public class ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase seguida de numeros");
		String frase = sc.nextLine();
		int index = 0;
		String letra = "";

		int numeros = 0;
		boolean numero = false;
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isLetter(frase.charAt(0))) {
				if (Character.isDigit(frase.charAt(i))) {
					numeros = Integer.parseInt(String.valueOf(frase.charAt(i)));
					numero = true;
				} else if (Character.isLetter(frase.charAt(i))) {
					letra += String.valueOf(frase.charAt(i));
				}
			} else if (Character.isDigit(frase.charAt(0))) {
				if (Character.isDigit(frase.charAt(i))) {
					numeros = Integer.parseInt(String.valueOf(frase.charAt(i)));
				} else if (Character.isLetter(frase.charAt(i))) {
					letra += String.valueOf(frase.charAt(i));
					if (numeros != 0) {
						numero = true;
					}
				}
			}
			if (numero) {
				while (numeros > index) {
					index++;
					System.out.print(letra);
				}
				letra = "";
				numero = false;
				index = 0;
			}
		}
	}
}