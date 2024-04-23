package Ejer2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase:");
		String frase = sc.nextLine();
		frase = frase.toLowerCase();
		frase = frase.replaceAll("a", "A");
		frase = frase.replaceAll("b", "B");
		System.out.println(frase);
	}
}