package Ejer2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase:");
		String frase = sc.nextLine();
		frase = frase.replace("a", "X");
		frase = frase.replace("e", "X");
		frase = frase.replace("i", "X");
		frase = frase.replace("o", "X");
		frase = frase.replace("u", "X");
		System.out.println(frase);
	}
}