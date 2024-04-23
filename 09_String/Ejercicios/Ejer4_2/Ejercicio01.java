package Ejer4_2;

import java.util.*;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase = "";
		boolean esMinus = true;

		System.out.println("Dame una frase");
		frase = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (Character.isUpperCase(frase.charAt(i))) {
				esMinus = false;
				break;
			}
		}
		if (esMinus) {
			System.out.println("Es todo minuscula");
		} else {
			System.out.println("No. Hay mayusculas");
		}
	}

}
