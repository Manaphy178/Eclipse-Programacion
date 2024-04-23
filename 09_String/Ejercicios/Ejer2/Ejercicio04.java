package Ejer2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase:");
		String frase = sc.nextLine();
		frase = frase.replaceAll(" ", "");
		System.out.println(frase);
	}
}