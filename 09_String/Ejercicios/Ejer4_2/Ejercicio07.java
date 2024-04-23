package Ejer4_2;

import java.util.*;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		char[] buscar = new char[3];
		int contP = 0;

		System.out.println("Dame una frase");
		frase = sc.nextLine();
		String[] palabras = frase.split(" ");

		System.out.println("Introduce 3 letras a buscar por palabra");
		for (int i = 0; i < 3; i++) {
			System.out.print("Letra " + (i + 1) + ": ");
			buscar[i] = sc.nextLine().charAt(0);
		}

		for (int i = 0; i < palabras.length; i++) {
			boolean las3 = true;
			for (int j = 0; j < buscar.length; j++) {

				if (!palabras[i].contains(String.valueOf(buscar[j]))) {
					las3 = false;
					break;
				}
			}
			if (las3) {
				contP++;
			}
		}
		System.out.println("Palabras con las tres letras: " + contP);
	}

}
