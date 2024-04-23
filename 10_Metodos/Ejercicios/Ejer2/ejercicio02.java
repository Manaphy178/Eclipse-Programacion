package Ejer2;

import java.util.*;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[3];
		ejercicio02.rellenar(nombres);
		System.out.println("Dime mas nombres");
		String[] nombres2 = new String[3];
		ejercicio02.rellenar(nombres2);
		ejercicio02.ejercicio(nombres, nombres2);// Todo el ejercicio en un metodo 💀💀💀


	}

	static String[] rellenar(String[] nombres) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Dime un nombre");
			nombres[i] = sc.nextLine().trim();
		}
		return nombres;
	}

	static boolean empiezan(String nom1, String nom2) {
		boolean empieza = false;
		nom1 = nom1.toLowerCase();
		nom2 = nom2.toLowerCase();
		if (nom1.charAt(0) == nom2.charAt(0)) {
			empieza = true;
		}
		return empieza;
	}

	static boolean acaban(String cadena) {
		boolean termina = false;
		String vocales = "aeiou";
		int posi = cadena.length() - 1;
		cadena = cadena.toLowerCase();
		if (vocales.contains(String.valueOf(cadena.charAt(posi)))) {
			termina = true;
		}
		return termina;
	}

	static boolean esPrimo(int num) {
		boolean primo = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
				break;
			}
		}
		if (primo && num > 1) {
			primo = true;
		} else {
			primo = false;
		}
		return primo;
	}

	static void ejercicio(String[] nombre1, String[] nombre2) {
		for (int i = 0; i < nombre1.length; i++) {
			boolean si = false;
			String nombre = "";
			for (int j = 0; j < nombre2.length; j++) {
				if (empiezan(nombre1[i], nombre2[j]) && esPrimo(nombre2[j].length()) && acaban(nombre2[j])) {
					nombre = nombre2[j];
					nombre = nombre + "\r";
					si = true;
					break;
				}
			}
			if (si) {
				System.out.print(nombre);
			}
		}
	}
}
//Pedro Luis Alberto
//Lauraaa Ana Juliana