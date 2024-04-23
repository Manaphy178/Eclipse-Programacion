package Ejer5;

import java.util.*;

public class ejercicio01_clase {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Pediremos al usuario una frase que tiene que ser como 3p2f. Y esto tendra que
		 * devolver por consola las letras repetidas las veces del numero anterior
		 * Ej:3p4f = pppffff | P al tener un 3 atras tiene que repetirse 3 veces
		 */
		System.out.println("Dime una frase seguida de numeros");

		String frase = sc.nextLine();

		int[] numeros = new int[frase.length() / 2];
		/*
		 * Ya que solo hay numero y letra, solo queremos los numeros que haya en la
		 * frase. Ej: frase= 2p4f | al hacer el array de numeros cogemos longitud de
		 * frase y dividimos, lo que nos dara las veces que hay numeros
		 */

		String[] letras = new String[frase.length() / 2]; /* Lo mismo que los numeros */
		int index = 0;

		for (int i = 0; i < frase.length(); i += 2) {
			/*
			 * "i+=2" Como sabemos que el patron va a ser numero letra pasamos directamente
			 * al siguiente numero, saltandonos la letra por si puede dar error
			 */

			numeros[index] = Character.getNumericValue(frase.charAt(i));
			letras[index] = String.valueOf(frase.charAt(i + 1));
			index++;
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i]; j++) {
				System.out.print(letras[i]);
			}
			System.out.println();
		}
	}
}