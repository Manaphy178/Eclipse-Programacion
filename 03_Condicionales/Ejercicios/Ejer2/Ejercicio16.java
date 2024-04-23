package Ejer2;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double puntos = 0;
		System.out.print("Cuantos puntos tienes: ");
		puntos = sn.nextDouble();
		if (puntos >= 45) {
			if (puntos >= 79) {
				if (puntos >= 90) {
					if (puntos >= 100) {
						if (puntos >= 119) {
							System.out
									.println("Puedes cursar biología, empresariales, derecho, sistemas y informática");
						} else {
							System.out.println("Puedes cursar biología, empresariales, derecho y sistemas");
						}
					} else {
						System.out.println("Puedes cursar biología, empresariales y derecho");
					}
				} else {
					System.out.println("Puedes cursar biología y empresariales");
				}
			} else {
				System.out.println("Puedes cursar biología");
			}
		} else {
			System.out.println("No puedes cursar ninguna asignatura, tu puntuacion no es valida para asignarte a una carrera");
		}
	}
}