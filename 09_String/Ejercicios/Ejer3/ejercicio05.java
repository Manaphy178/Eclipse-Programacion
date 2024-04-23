package Ejer3;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] ciudades = new String[3];
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Dime una ciudad");
			ciudades[i] = sc.nextLine();
		}
		for (int i = 0; i < ciudades.length; i++) {
			int cont=0;
			for (int j = 0; j < ciudades[i].length(); j++) {
				if (ciudades[i].charAt(j)=='e') {
					cont++;
				}
				if (cont==3) {
					ciudades[i]=ciudades[i].toUpperCase();
				}
			}
		}
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println(ciudades[i]);
		}
	}
}