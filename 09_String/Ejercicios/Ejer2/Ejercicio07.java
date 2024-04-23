package Ejer2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		String[] nombre = new String[5];
		String[] letras = { "a", "e", "o" };
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Dime tu nombre:");
			nombre[i] = sc.nextLine();
			if (i == nombre.length - 1) {
				for (int x = 0; x < letras.length; x++) {
					cont = 0;
					for (int j = 0; j < nombre.length; j++) {
						if (nombre[j].endsWith(letras[x])) {
							cont++;
						}
					}
					System.out.println("Hay " + cont + " nombres que acaban con la letra: " + letras[x]);
				}
			}
		}
	}
}