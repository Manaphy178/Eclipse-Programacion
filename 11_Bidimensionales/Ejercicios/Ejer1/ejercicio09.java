package Ejer1;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		System.out.println("Cuantas personas se van a guardar");
		int num = sn.nextInt();
		String[] datos = { "Mayor?", "Vegano?", "Poliamoroso?" };
		String[] nombre = new String[num];
		boolean[][] cosas = new boolean[num][3];
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Dime tu nombre");
			nombre[i] = sc.nextLine();
		}
		for (int i = 0; i < cosas.length; i++) {
			for (int j = 0; j < cosas[i].length; j++) {
				System.out.println("Eres: " + datos[j]);
				if (sc.nextLine().equalsIgnoreCase("si")) {
					cosas[i][j] = true;
				} else {
					cosas[i][j] = false;
				}
			}
		}

	}

}
