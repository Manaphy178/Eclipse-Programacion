package Ejer4_2;

import java.util.*;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		boolean esP = true;
		int index = 0;

		System.out.println("Dime una frase");
		frase = sc.nextLine();
		String[] palabras = frase.split(" ");
		int cont = 0;

		for (int i = 0; i < palabras.length; i++) {
			esP = true;
			if (palabras[i].length() < 2) {
				esP = false;
			} else {
				for (int j = 2; j <= Math.sqrt(palabras[i].length()); j++) {
					if (palabras[i].length() % j == 0) {
						esP = false;
						break;
					}
				}
			}
			if (esP) {
				cont++;
			}
		}
		String[] palabrasP = new String[cont];
		for (int i = 0; i < palabras.length; i++) {
			esP = true;
			if (palabras[i].length() < 2) {
				esP = false;
			} else {
				for (int j = 2; j <= Math.sqrt(palabras[i].length()); j++) {
					if (palabras[i].length() % j == 0) {
						esP = false;
						break;
					}
				}
			}
			if (esP) {
				palabrasP[index] = palabras[i];
				index++;
			}
		}

		for (int i = 0; i < palabrasP.length; i++) {
			System.out.println("Palabra de longitud prima encontrada(" + (i + 1) + " de " + palabrasP.length + "): "
					+ palabrasP[i]);
		}
	}

}
