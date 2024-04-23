package Ejer4;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la Cadena1");
		String cadena1 = sc.nextLine() + " ";
		System.out.println("Dime que quieres buscar en la Cadena1");
		String cadena2 = sc.nextLine();
		cadena2= cadena2.trim();
		int veces = 0;
		String aux = "";
		for (int i = 0; i < cadena1.length(); i++) {
			if (aux.contains(cadena2)) {
				veces++;
				aux = "";
			} else {
				aux += String.valueOf(cadena1.charAt(i));
			}
		}
		System.out.println(veces);
	}
}
