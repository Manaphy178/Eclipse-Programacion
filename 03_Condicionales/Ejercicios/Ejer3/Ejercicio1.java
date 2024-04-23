package Ejer3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int jugadores = 0;
		double costo = 0;
		int comunitarios = 0;
		int extranjeros = 0;
		System.out.print("Hola Rubiales, cuantos jugadores necesitas para la plantilla: ");
		jugadores = sn.nextInt();
		System.out.print("Cuantos comunitarios habran: ");
		comunitarios = sn.nextInt();
		System.out.print("Cuantos extranjeros habran: ");
		extranjeros = sn.nextInt();
		costo = jugadores * 2000000;
		if (comunitarios > 5){
			costo = costo + 5000000;
		}
		if (extranjeros >= 2){
			costo = costo + 5000000;
		}
		System.out.println("El costo para la plantilla seria: " + costo);
		System.out.println("El costo en cifra seria: " + (costo / 1000000) + "M");
	}

}
