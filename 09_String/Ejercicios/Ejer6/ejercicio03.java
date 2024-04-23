package Ejer6;

import java.util.*;

public class ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine().trim();
		String[] palabras = frase.split(" ");
		System.out.println("Hay " + palabras.length + " palabras");
	}
}
