package Ejer6;

import java.util.*;

public class ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		String aux = "";
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				aux += "";
			} else {
				aux += frase.charAt(i);
			}
		}
		System.out.println(aux);
	}
}
