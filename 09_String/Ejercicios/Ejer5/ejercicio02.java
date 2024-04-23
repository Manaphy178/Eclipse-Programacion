package Ejer5;

import java.util.*;

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";

		System.out.println("Dame una frase");
		frase = sc.nextLine();

		String[] palabras = frase.split(" ");

		System.out.println("Hay " + palabras.length + " palabras");
	}

}
