package Ejer2;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int ruedas = 0;
		int precio = 0;
		double descuento = 0;
		double resul = 0;
		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();
		System.out.println("Cuantas ruedas vas a comprar? ");
		ruedas = sn.nextInt();
		if (ruedas < 12) {
			precio = 250;
			descuento = 0.8;
			resul = (ruedas * precio) * descuento;
			System.out.println("Hola " + nombre + " el precio de la compra sera: " + resul);
		}
		if (ruedas >= 12) {
			precio = 220;
			descuento = 0.75;
			resul = (ruedas * precio) * descuento;
			System.out.println("Hola " + nombre + " el precio de la compra sera: " + resul);
		}

	}

}
