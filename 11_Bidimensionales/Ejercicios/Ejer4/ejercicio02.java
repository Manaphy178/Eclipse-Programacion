package Ejer4;

import java.util.*;

public class ejercicio02 {

	public static void main(String[] args) {
		boolean[][] cadenas = new boolean[10][10];
		rellenar(cadenas);
		contar(cadenas);
	}

	static boolean[][] rellenar(boolean[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int ran = (int) (Math.random() * 10) + 1;
				if (ran <= 5) {
					array[i][j] = true;
				} else {
					array[i][j] = false;
				}
			}
		}
		return array;
	}

	static void contar(boolean[][] array) {
		int falso = 0;
		int verdad = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == true) {
					verdad++;
				} else {
					falso++;
				}
			}
		}
		System.out.println("Hay " + verdad + " valores verdaderos");
		System.out.println("Hay " + falso + " valores falsos");
	}
}
