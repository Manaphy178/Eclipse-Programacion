package Ejer4_2;

import java.util.*;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		String busca = "";
		int cont = 0, index = 0;
		String first = "";
		String last = "";

		System.out.print("Dame una frase: ");
		frase = sc.nextLine();
		System.out.print("Dame una letra pa buscar: ");
		busca = sc.nextLine();

		String[] palabras = frase.split(" ");

		for (int i = 0; i < palabras.length; i++) {

			first = String.valueOf(palabras[i].charAt(0));
			last = String.valueOf(palabras[i].charAt(palabras[i].length() - 1));

			if ((first.contains(busca)) || (last.contains(busca))) {
				cont++;
			}
		}

		String[] mostrar = new String[cont];

		for (int i = 0; i < palabras.length; i++) {

			first = String.valueOf(palabras[i].charAt(0));
			last = String.valueOf(palabras[i].charAt(palabras[i].length() - 1));

			if ((first.contains(busca)) || (last.contains(busca))) {
				mostrar[index] = palabras[i];
				index++;
			}
		}

		for (int i = 0; i < mostrar.length; i++) {
			System.out.println("Palabra encontrada. (" + (i + 1) + " de " + mostrar.length + "): " + mostrar[i]);
		}

	}

}
