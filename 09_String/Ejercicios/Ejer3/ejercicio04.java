package Ejer3;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] ciudades = new String[7];
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Dime una ciudad");
			ciudades[i] = sc.nextLine();
		}
		for (int i = 0; i < ciudades.length; i++) {
			char caracter = 'a';
			String letra="";
			String ciudad="";
			for (int j = 0; j < ciudades[i].length(); j++) {
				if (ciudades[i].charAt(j)==ciudades[i].charAt(0)) {
					caracter = ciudades[i].charAt(j);
					letra = String.valueOf(caracter).toUpperCase();
				} else if (ciudades[i].charAt(j)==ciudades[i].charAt(ciudades[i].length()-2)) {
					caracter = ciudades[i].charAt(j);
					letra = String.valueOf(caracter).toUpperCase();
				} else {
					caracter = ciudades[i].charAt(j);
					letra = String.valueOf(caracter);
				}
				ciudad = ciudad + letra;
			}
			ciudades[i] = ciudad;
		}
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println(ciudades[i]);
		}
	}
}