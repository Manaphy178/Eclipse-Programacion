package Ejer01;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] gifts = new String[8];
		boolean coche = false;
		boolean presu = false;
		System.out.println("Que regalo le vas a pedir a los reyes magos estas navidades: \r");
		for (int i = 1; i < 9; i++) {
			System.out.print(i + ". ");
			gifts[i - 1] = sc.nextLine();
		}
		System.out.println("");
		System.out.println("Has pedido a los reyes magos: \r");
		for (int i = 1; i < 9; i++) {
			System.out.println(i + ". " + gifts[i - 1]);
		}
		System.out.println("");
		System.out.println("Aviso, los coches me caen mal, si quieres un coche te dare un carbón \r");
		for (int i = 1; i < 9; i++) {
			if (gifts[i - 1].equalsIgnoreCase("coche")) {
				gifts[i - 1] = "Cárbon";
				coche = true;
			}
			System.out.println(i + ". " + gifts[i - 1]);
		}
		if (coche == true) {
			System.out.println("Tenias un regalo que era un coche, dios como odio los coches >:( \r");
		}
		System.out.println("Me apetece darle la vuelta a tus regalos :) \r");
		int pos = 8;
		for (int i = 7; i >= 0; i--) {
			System.out.println(pos + ". " + gifts[i]);
			pos--;
		}
		System.out.println("");
		System.out.println("Vamos a revisar un momento de nuevo la lista \r");
		for (int i = 1; i < 9; i++) {
			if (gifts[i - 1].equalsIgnoreCase("avión") || gifts[i - 1].equalsIgnoreCase("avion")
					|| gifts[i - 1].equalsIgnoreCase("dinero")) {
				gifts[i - 1] = "No tenemos tanto presupuesto, los camellos se comieron el dinero";
				presu = true;
			}
			System.out.println(i + ". " + gifts[i - 1]);
		}
		System.out.println("");
		if (presu == true) {
			System.out.println("No tenemos tanto dinero :l ");
		}
		System.out.println("");
	}
}
