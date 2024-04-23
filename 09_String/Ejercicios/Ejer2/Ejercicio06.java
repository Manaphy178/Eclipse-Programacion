package Ejer2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		String ciudades = "";
		for (int i = 0; i < 20; i++) {
			System.out.println("Dime una ciudad:");
			ciudades = sc.nextLine();
			for (int j = 0; j < ciudades.length(); j++) {
				if (ciudades.charAt(j) == 'e') {
					cont++;
				}
			}
		}
		System.out.println("Hay " + cont + " E's en todos los paises");
	}
}