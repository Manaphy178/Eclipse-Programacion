package Ejer4_2;

import java.util.*;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		String busca = "";
		int cont = 0;

		System.out.println("Dame una frase: ");
		frase = sc.nextLine();
		System.out.println("Dame una letra pa buscar: ");
		busca = sc.nextLine();

		String[] palabras = frase.split(" ");
		int[] veces = new int[palabras.length];

		for (int i = 0; i < palabras.length; i++) {

			for (int j = 0; j < palabras[i].length(); j++) {

				String letra = String.valueOf(palabras[i].charAt(j));

				if (busca.contains(letra)) {

					cont++;
					veces[i] = cont;
				}

			}
			cont = 0;
		}

		for (int i = 0; i < veces.length; i++) {
			System.out.println("En la palabra " + (i + 1) + ", <<" + busca + ">> se repite : " + veces[i] + " veces");
		}
	}

}
