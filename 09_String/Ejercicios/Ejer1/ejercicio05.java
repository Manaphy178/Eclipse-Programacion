package Ejer1;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		System.out.println(frase.replace(" ", ""));
	}
}