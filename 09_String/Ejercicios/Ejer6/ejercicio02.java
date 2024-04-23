package Ejer6;

import java.util.*;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String frase = sc.nextLine().trim();
		boolean pali = true;
		int index = frase.length() - 1;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != frase.charAt(index)) {
				pali = false;
				break;
			}
			index--;
		}
		if (pali) {
			System.out.println("La frase es palindroma");
		} else {
			System.out.println("La frase no es palindroma");
		}
	}
}