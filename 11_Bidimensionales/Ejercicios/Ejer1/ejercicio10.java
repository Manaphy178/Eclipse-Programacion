package Ejer1;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Cuantas personas se van a guardar");
		int num = sn.nextInt();
		String[] datos = { "Mayor?", "Vegano?", "Poliamoroso?" };
		String[] nombre = new String[num];
		boolean[][] cosas = new boolean[num][3];
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Dime un nombre");
			nombre[i] = sc.nextLine();
		}
		for (int i = 0; i < cosas.length; i++) {
			for (int j = 0; j < cosas[i].length; j++) {
				System.out.println(nombre[i] + " eres: " + datos[j]);
				if (sc.nextLine().equalsIgnoreCase("si")) {
					cosas[i][j] = true;
				} else {
					cosas[i][j] = false;
				}
			}
		}
		for (int i = 0; i < cosas.length; i++) {
			System.out.print(nombre[i]);
			for (int j = 0; j < cosas[i].length; j++) {
				if (cosas[i][0] == true) {
					System.out.print(" es mayor de edad");
				} else {
					System.out.print(" es menor de edad");
				}
				if (cosas[i][1] == true) {
					System.out.print(", vegano");
				} else {
					System.out.print(", no vegano");
				}
				if (cosas[i][2] == true) {
					System.out.print(" y poliamoroso");
				} else {
					System.out.print(" y no poliamoroso");
				}
			}
			System.out.println();
		}
	}

}
