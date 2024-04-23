package Ejer3;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		String entero = ""; // Frase sin espacios
		for (int i = 0; i < frase.length(); i++) {
//			char espacio = ' ';
			if (frase.charAt(i) != ' ' /* espacio */) {// Se puede hacer tanto con variable char como ponerlo
														// directamente
				entero = entero + frase.charAt(i);
			}
		}
		System.out.println(entero);
	}
}