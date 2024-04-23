package Ejer2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase:");
		String frase = sc.nextLine();
		String[] vocalesMa = { "A", "E", "I", "O", "U" };
		String[] vocalesMi = { "a", "e", "i", "o", "u" };
		for (int i = 0; i < vocalesMa.length; i++) {
			frase = frase.replaceAll(vocalesMi[i], vocalesMa[i]);
		}
		System.out.println(frase);
	}
}