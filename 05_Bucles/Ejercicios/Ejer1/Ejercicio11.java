package Ejer1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int num = 0;
		int opt = 0;
		boolean si = false;
		while (si == false) {
			System.out.print("Dime tu nombre: ");
			nombre = sc.nextLine();
			if (nombre.equalsIgnoreCase("Pablito Escobar")) {
				System.out.println("Has introducido mal el nombre " + num + " veces");
				System.out.println("Plata o plomo");
				si = true;
			} else {
				System.out.println("Has introducido mal el nombre.");
				num++;
			}
		}

	}

}
