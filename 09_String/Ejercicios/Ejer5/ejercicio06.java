package Ejer5;

import java.util.*;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame una frase");
		String frase = sc.nextLine();
		String[] palabras = frase.split(" ");

		for (int i = 0; i < palabras.length; i++) {
			if (i % 2 != 0) {
				System.out.print(palabras[i] + " ");
			}
		}
	}
}
