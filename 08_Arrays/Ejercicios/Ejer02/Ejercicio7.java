package Ejer02;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double[] sueldo = new double[20];
		String[] nombres = new String[20];

		double suel_max = 0; // Variable que guardara el sueldo max del array
		String nom_max = ""; // variable que guarda el nombre del sueldo maximo del array
		for (int i = 0; i < sueldo.length; i++) {
			System.out.println("Dime tu nombre: ");
			nombres[i] = sc.nextLine();
			System.out.println("Dime tu sueldo: ");
			sueldo[i] = sn.nextDouble();
			if (sueldo[i] > suel_max) {
				suel_max = sueldo[i];
				nom_max = nombres[i];
			}
		}
		System.out.println("La persona que tiene mas sueldo es " + nom_max + " con un sueldo de " + suel_max + "€");
	}
}
