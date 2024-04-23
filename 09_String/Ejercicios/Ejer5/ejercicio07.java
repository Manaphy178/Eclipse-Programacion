package Ejer5;

import java.util.*;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame una frase");
		String frase = sc.nextLine();

		String[] palabras = frase.split(" ");
		String vocales = "aeiou";

		int index = 0;

		for (int i = 0; i < palabras.length; i++) {
			index = 0;
			for (int j = 0; j < vocales.length(); j++) {
				if (palabras[i].contains(String.valueOf(vocales.charAt(j))))
					index++;
			}
			if (index >= 4) {
				System.out.println(palabras[i]);
			}
		}
	}
}
