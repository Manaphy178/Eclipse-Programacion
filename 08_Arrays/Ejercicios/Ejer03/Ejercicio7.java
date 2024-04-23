package Ejer03;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		int[] num1 = new int[10];
		int busca = 0;
		int cont = 0;
		int posi = 0;
		for (int i = 0; i < num1.length; i++) {
			System.out.println("Dime un numero");
			num1[i] = sn.nextInt();
		}
		System.out.println("Que numero quieres buscar");
		busca = sn.nextInt();
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == busca) {
				cont++;
				posi = i;
			}
		}
		System.out.println("La ultima posicion del numero es: " + posi + " y se repitio " + cont + " veces");
	}

}
