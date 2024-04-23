package Ejer6;

import java.util.*;

public class ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] vocal = { "a", "e", "i", "o", "u" };
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		for (int i = 0; i < vocal.length; i++) {
			int cont = 0;
			for (int j = 0; j < frase.length(); j++) {
				if (vocal[i].equalsIgnoreCase(String.valueOf(frase.charAt(j)))) {
					cont++;
				}
			}
			if (i != vocal.length - 1) {
				System.out.print(vocal[i] + ": " + cont + " veces, ");
			} else {
				System.out.print(vocal[i] + ": " + cont + " veces.");
			}

		}
	}
}
