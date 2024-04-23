package Ejer1;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		double nota = 0;
		int suspenso = 0;
		int indice = 0;
		do {
			System.out.println("Dime la nota que has sacado:");
			nota = sn.nextDouble();
			if (nota < 5) {
				suspenso++;
			}
			indice++;
		} while (indice < 4);
		System.out.println("Ha habido " + suspenso + " suspensos");
	}

}
