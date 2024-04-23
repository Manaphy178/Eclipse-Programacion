package Ejer2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase:");
		String frase = sc.nextLine();
		char pri = frase.charAt(0);
		pri = Character.toUpperCase(pri);
		char ult = frase.charAt(frase.length() - 1);
		ult = Character.toUpperCase(ult);
		frase = pri + frase.substring(1, frase.length() - 1) + ult;
		System.out.println(frase);
	}
}