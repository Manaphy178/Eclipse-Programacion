package Ejer02;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int[] numero = new int[10];
		double media = 0;
		int pares = 0;
		int cont_pares = 0;
		for (int i = 0; i < numero.length; i++) {

			System.out.println("Dime un numero: ");
			numero[i] = sn.nextInt();

		}
		for (int i = 0; i < numero.length; i += 2) { // Como solamente quiero que me diga las posiciones pares no sumo
														// "i" de 1 en 1, le sumo 2 directamente. Si quisieras hacerlo
														// de 1 en 1 tendrias que hacer un if que evalue "i" si es un
														// numero par, con if(i%2==0) y poner el proceso que quieres
			pares = pares + numero[i];
			cont_pares++;
		}
		media = pares / cont_pares;
		System.out.println("La media de las posiciones pares es: " + media);

	}
}
