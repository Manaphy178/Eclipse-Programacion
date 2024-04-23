package Ejer4_2;

import java.util.*;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";

		System.out.println("Frase");
		frase = sc.nextLine();
		String[] palabras = frase.split(" ");
		System.out.println("Hay " + palabras.length + " palabras");
	}

}
