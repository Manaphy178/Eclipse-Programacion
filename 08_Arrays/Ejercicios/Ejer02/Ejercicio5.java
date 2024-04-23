package Ejer02;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int[] numeros = new int[10];
		int pos = 0; // Contador de los positivos
		int neg = 0; // Contador de los negativos
		int negativos = 0; // Suma de los negativos
		int positivos = 0; // Suma de los positivos
		double media_pos = 0;
		double media_neg = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un numero: ");
			numeros[i] = sn.nextInt();
			if (numeros[i] >= 0) {
				positivos = positivos + numeros[i];
				pos++;
			}
			if (numeros[i] < 0) {
				negativos = negativos + numeros[i];
				neg++;
			}
		}
		if (pos > 0) { // si han metido un positivo se hara la media. Si no esta en un if puede dar
						// error al intentar dividir algo entre 0 en caso de que no se haya metido un
						// positivo
			media_pos = positivos / pos;
		}
		if (neg > 0) {// si han metido un negativo se hara la media. Si no esta en un if puede dar
						// error al intentar dividir algo entre 0 en caso de que no se haya metido un
						// negativo
			media_neg = negativos / neg;
		}

		System.out.println("La media de los numeros positivos es: " + media_pos);
		System.out.println("La media de los numeros negativos es: " + media_neg);
	}
}
