package Ejer2;

import java.util.*;

public class ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[10];
		ejercicio01.rellenar(nombres);
		for (int i = 0; i < nombres.length; i++) {
			if ((ejercicio01.nVocal(nombres[i]) > 3 && ejercicio01.nConsonante(nombres[i]) < 5)
					|| (ejercicio01.nNumero(nombres[i]) > 0 && ejercicio01.esPrimo(nombres[i].length()) == true)) {
				System.out.println(nombres[i] + " es apto");
			}
		}
	}

	static String[] rellenar(String[] nombres) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Dime un nombre");
			nombres[i] = sc.nextLine().trim();
		}
		return nombres;
	}

	static int nVocal(String cadena) {
		String vocales = "aeiou";
		int numv = 0;
		cadena = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			if (vocales.contains(String.valueOf(cadena.charAt(i)))) {
				numv++;
			}
		}
		return numv;
	}

	static int nConsonante(String cadena) {
		String vocales = "aeiou";
		int numc = 0;
		cadena = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			if (!vocales.contains(String.valueOf(cadena.charAt(i)))) {
				numc++;
			}
		}
		return numc;
	}

	static int nNumero(String cadena) {
		String numeros = "1234567890";
		int num = 0;
		cadena = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < numeros.length(); j++) {
				if (numeros.contains(String.valueOf(cadena.charAt(i)))) {
					num++;
				}
			}
		}
		return num;
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
}
