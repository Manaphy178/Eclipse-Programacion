package Ejer2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] nombre = new String[50];
		char[] letras = new char[nombre.length];
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Dime tu nombre:");
			nombre[i] = sc.nextLine();
			letras[i] = nombre[i].charAt(2);
		}
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
	}
}