package Ejer1;

import java.util.*;

public class ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		System.out.println("Dime una sola letra (si pones una palabra o frase se escogera la primera letra)");
		char letra = sc.next().charAt(0);
		System.out.println("Se repite " + ejercicio01.apariciones(letra, frase) + " veces la letra " + letra);

	}

	static int apariciones(char letra, String frase) {
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (letra == frase.charAt(i)) {
				cont++;
			}
		}
		return cont;
	}

}
