package Ejer4;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase o palabra");
		String frase = sc.nextLine();
		String aux = "";
		for (int i = frase.length()-1; i >=0; i--) {
			aux+=String.valueOf(frase.charAt(i));
		}
		frase=aux;
		System.out.println(frase);

	}
}