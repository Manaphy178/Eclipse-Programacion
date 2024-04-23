package Ejer08;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] numeros = { 10, 4, 456, 5, 12, 34, 22, 9, 0, 56, 2, 122, 3 };
		Arrays.sort(numeros);
		System.out.println("Ordenado de mayor a menor: " + Arrays.toString(numeros));
	}
}
