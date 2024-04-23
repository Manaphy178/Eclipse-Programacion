package Ejer02;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int[] pares = new int[20];
		int cont_pares = 0;
		for (int i = 0; cont_pares < 20; i++) {// Como "i" se va a ir sumando por cada repeticion no quiero que sea uno
												// de las condiciones del for porque solamente llegaria a 18 (10
												// primeros numeros pares) y no 38 (20 primeros numeros pares). Por eso
												// utilizo un contador que vaya contando los pares que han ido
												// registrandose
			if (i % 2 == 0) {
				pares[cont_pares] = i; // Al ser este el contador de pares, viene perfecto para indicar las posiciones
										// del array
				cont_pares++; // Sumo la cantidad de numero par que se ha añadido al array pares
			}
		}
		for (int i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}

	}
}
