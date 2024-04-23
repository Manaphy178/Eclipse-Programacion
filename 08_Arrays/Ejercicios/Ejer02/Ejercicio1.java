package Ejer02;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int[] numeros = new int[100];
		int suma = 0;
		double media = 0;
		for (int i = 1; i <= numeros.length; i++) {
			numeros[i - 1] = i;
			System.out.print(numeros[i - 1] + ", ");
			suma = suma + numeros[i - 1];
		}
		System.out.println("");
		media = suma / 100;
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println("La media de la suma de los numeros es: " + media);
	}

}
