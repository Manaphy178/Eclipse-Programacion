package Plantillas;

import java.util.*;

public class plantillas {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	/*
	 * Atajo: Scan | Para importar scanner rapido en todo, siempre por encima de
	 * main
	 */
//	import java.util.*;
//	static Scanner sn= new Scanner (System.in);
//	static Scanner sc= new Scanner (System.in);

	public static void main(String[] args) {

		/* Atajo: ff | Para hacer for anidados */
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {

			}
		}
	}

	/* Cosa de elliot */
//	static String[][] rellenar() {
//
//		String[][] nombres = new String[5][5];
//
//		for (int i = 0; i < nombres.length; i++) {
//			System.out.println("Fila " + (i + 1));
//			for (int j = 0; j < nombres[i].length; j++) {
//				System.out.println("Dime una cadena: (Usuario " + (i * nombres[i].length + j + 1) + " de "
//						+ (nombres.length * nombres[0].length) + ")");
//				nombres[i][j] = sc.nextLine().trim();
//
//			}
//		}
//		return nombres;
//	}

	/* Atajo: fill, para rellenar un String bidimensional */
	static String[][] rellenar() {
		String[][] array = new String[10][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Dime una cadena:");
				array[i][j] = sc.nextLine().trim();
			}
		}
		return array;
	}

	/* Atajo: esprim | para verificar si un numero entero es primo */
	static boolean prime(int input) {
		boolean prime = true;

		if (input < 2) {
			prime = false;
		} else {
			for (int j = 2; j <= Math.sqrt(input); j++) {
				if (input % j == 0) {
					prime = false;
					break;
				}
			}
		}

		return prime;
	}

	/* Atajo sortDecrease | Ordenar array de mayor a menor */
	static void MayMen(int[] numeros) {
		int num = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int x = i + 1; x < numeros.length; x++) {
				if (numeros[x] > numeros[i]) {
					num = numeros[i];
					numeros[i] = numeros[x];
					numeros[x] = num;
				}
			}
		}
	}

	/* Atajo sortIncrease | Ordenar array de menor a mayor */
	static void MenMay(int[] numeros) {
		int num = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int x = i + 1; x < numeros.length - 1; x++) {
				if (numeros[x] < numeros[i]) {
					num = numeros[i];
					numeros[i] = numeros[x];
					numeros[x] = num;
				}
			}
		}
	}

	/* Atajo palin | Te dice que palabra es palindroma */
	static boolean isPalin(String input) {
		int izq = 0;
		int der = input.length() - 1;

		while (izq < der) {
			if (input.charAt(izq) != input.charAt(der)) {
				return false;
			} else {
				izq++;
				der--;
			}
		}
		return true;
	}
}
