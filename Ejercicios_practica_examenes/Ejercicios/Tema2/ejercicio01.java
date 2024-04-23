package Tema2;

import java.util.*;

public class ejercicio01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Dime una cadena");
		String cadena = sc.nextLine().trim().toLowerCase();
		System.out.println("Dime otra cadena");
		String cadena2 = sc.nextLine().trim().toLowerCase();
		String aux = "";
		int pos = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (aux.equalsIgnoreCase(cadena2)) {
				System.out.println("Se ha encontrado una coincidencia");
				System.out.println("Dime por cual cadena quieres cambiarlo: ");
				String cadena3 = sc.nextLine().trim().toLowerCase();
				cadena = cadena.substring(0, pos) + " " + cadena3 + cadena.substring(i, cadena.length());
				System.out.println(cadena);
				aux = "";
			} else {
				aux += cadena.charAt(i);
			}
			if (cadena.charAt(i) == ' ') {
				aux = "";
				pos = i;
			}
		}
	}
}
