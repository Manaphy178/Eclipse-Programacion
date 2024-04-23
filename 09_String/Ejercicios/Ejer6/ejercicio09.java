package Ejer6;

import java.util.*;

public class ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String vocales = "aeiou";
		String[] frase = sc.nextLine().split(" ");
		for (int i = 0; i < frase.length; i++) {
			int contVocal = 0;
			String aux = frase[i];
			for (int j = 0; j < frase[i].length(); j++) {
				for (int x = 0; x < vocales.length(); x++) {
					if (frase[i].charAt(j) == vocales.charAt(x)) {
						contVocal++;
						frase[i] = frase[i].replaceAll(String.valueOf(frase[i].charAt(j)), " ");
						break;
					}
				}
			}
			if (contVocal >= 4) {
				System.out.println(aux + " - Tiene al menos 4 vocales");
			}
		}
	}
}
