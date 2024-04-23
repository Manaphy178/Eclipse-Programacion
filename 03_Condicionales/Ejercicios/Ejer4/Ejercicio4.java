package Ejer4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		double dinero = 0;
		System.out.println("Este es el menu del kiosko:");
		System.out.println("Papadelatas 20 criptonelsons.");
		System.out.println("Drakis 110 criptonelsons.");
		System.out.println("Palotes 50 criptonelsons.");
		System.out.println("MaxiRoll 100 criptonelsons.");
		System.out.println("Hubba Bubba 15 criptonelsons.");
		System.out.println("Chimos 20 criptonelsons.");
		System.out.println("Fresquito 70 criptonelsons.");
		System.out.println("Peta Zetas 35 criptonelsons.");

		System.out.println("Cuanto dinero tienes: ");
		dinero = sn.nextDouble();
		if (dinero >= 15) {
			if (dinero >= 20) {
				if (dinero >= 35) {
					if (dinero >= 50) {
						if (dinero >= 70) {
							if (dinero >= 100) {
								if (dinero >= 110) {
									System.out.print("Puedes comprar cualquier cosa del menu");
								} else {
									System.out.println(
											"Puedes comprar Hubba Bubba, Chimos, Papaletas, Palotes, Peta Zetas, Fresquito, MaxiRoll");
								}
							} else {
								System.out.println(
										"Puedes comprar Hubba Bubba, Chimos, Papaletas, Palotes, Peta Zetas, Fresquito");
							}
						} else {
							System.out.println("Puedes comprar Hubba Bubba, Chimos, Papaletas, Palotes, Peta Zetas");
						}
					} else {
						System.out.println("Puedes comprar Hubba Bubba, Chimos, Papaletas, Peta Zetas");
					}
				} else {
					System.out.println("Puedes comprar Hubba Bubba, Chimos, Papaletas");
				}
			} else {
				System.out.println("Puedes comprar Hubba Bubba");
			}
		} else {
			System.out.println("No puedes comprar nada");
		}

	}

}
