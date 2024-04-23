package Ejer6_Repaso;

import java.util.*;

public class ejercicio02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[][] cadenas = rellenar();
		String[] consonantes = new String[ContConsonantes(cadenas)];
		String[] vocales = new String[ContVocales(cadenas)];
		int rest = (cadenas.length + cadenas[0].length) - (consonantes.length + vocales.length);
		String[] resto = new String[rest];
		int indexV = 0;
		int indexC = 0;
		int indexA = 0;
		for (int i = 0; i < cadenas.length; i++) {
			for (int j = 0; j < cadenas[i].length; j++) {
				boolean masConsonantes = consonantes(cadenas[i][j]);
				if (masConsonantes == true) {
					consonantes[indexC] = cadenas[i][j];
					indexC++;
				}
				boolean masVocales = vocales(cadenas[i][j]);
				if (masVocales == true) {
					vocales[indexV] = cadenas[i][j];
					indexV++;
				}
				if (masVocales == false && masConsonantes == false) {
					resto[indexA] = cadenas[i][j];
					indexA++;
				}

			}
		}
		System.out.println("Palabras con mas de 3 consonantes consecutivas");
		decir(consonantes);
		System.out.println("Palabras con mas de 4 vocales");
		decir(vocales);
		System.out.println("El resto de palabras");
		decir(resto);
	}

//	Le pide al usuario los datos
	static String[][] rellenar() {
		String[][] array = new String[2][2];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(
						"Dime una frase que tenga: 3 consonantes consecutivas o 4 vocales seguidas indistivamente o no");
				array[i][j] = sc.nextLine().trim().toLowerCase();
			}
		}
		return array;
	}

//	Metodo que mete las palabras con mas de 3 consonantes en el array
	static boolean consonantes(String palabra) {
		String consonantes = "qwrtypsdfghjklñzxcvbnm";
		boolean tres = false;
		int cont = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (consonantes.contains(String.valueOf(palabra.charAt(i)))) {
				cont++;
				if (cont >= 3) {
					tres = true;

				}
			} else {
				cont = 0;
			}

		}
		return tres;
	}

	// Contara el numero de palabras con mas de 3 consonantes
	static int ContConsonantes(String[][] arry) {
		String consonantes = "qwrtypsdfghjklñzxcvbnm";
		int cont = 0;
		int contConso = 0;
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				cont = 0;
				for (int x = 0; x < arry[i][j].length(); x++) {
					if (consonantes.contains(String.valueOf(arry[i][j].charAt(x)))) {
						cont++;
						if (cont >= 3) {
							contConso++;
							cont = 0;
							break;
						}
					} else {
						cont = 0;
					}
				}
			}
		}
		return contConso;
	}

	static int ContVocales(String[][] arry) {
		String vocales = "aeiou";
		int cont = 0;
		int contV = 0;
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				cont = 0;
				for (int x = 0; x < arry[i][j].length(); x++) {
					if (vocales.contains(String.valueOf(arry[i][j].charAt(x)))) {
						cont++;
					}
				}if (cont >= 4) {
				contV++;
			}
			}
			
		}
		return contV;
	}

	static boolean vocales(String palabra) {
		String vocales = "aeiou";
		boolean cuatro = false;
		int cont = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (vocales.contains(String.valueOf(palabra.charAt(i)))) {
				cont++;
			}
		}
		if (cont >= 4) {
			cuatro = true;
		}
		return cuatro;
	}

	static void decir(String[] arry) {
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + ", ");
		}
		System.out.println();
	}
}
