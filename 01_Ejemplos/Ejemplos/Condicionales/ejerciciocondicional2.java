package Condicionales;

import java.util.Scanner;

public class ejerciciocondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("Cual es tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Cual es tu edad: ");
		double edad = sn.nextDouble();
		System.out.print("Cual es tu altura: ");
		double altura = sn.nextDouble();
		if (nombre.equalsIgnoreCase("Patricia")) {
			if (edad >= 40) {
				if (edad <= 50) {
					if (altura < 170) {
						System.out.println("Enhorabuena tienes premio");
					}
				}
			}
		}
	}

}
