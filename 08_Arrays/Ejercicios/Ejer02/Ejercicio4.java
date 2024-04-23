package Ejer02;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int[] numeros = new int[10];
		int pos = 0;
		int neg = 0;
		int cero = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un numero: ");
			numeros[i] = sn.nextInt();
			if (numeros[i] > 0) {
				pos++;
			}
			if (numeros[i] < 0) {
				neg++;
			}
			if (numeros[i] == 0) {
				cero++;
				pos++; // 0 tambien es positivo
			}
		}
		System.out.println("La cuenta de los numeros positivos es: " + pos);
		System.out.println("La cuenta de los numeros negativos es: " + neg);
		System.out.println("Se ha repetido el numero 0 es: " + cero + " veces");

	}

}
