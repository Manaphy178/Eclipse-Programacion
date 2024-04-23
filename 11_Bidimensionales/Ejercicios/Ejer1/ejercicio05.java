package Ejer1;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		String palabra = "";
		System.out.println("Dime cuantas personas vas a meter en el registro");
		boolean[][] datos = new boolean[sn.nextInt()][2];

		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					System.out.println("La persona " + (i + 1) + " es vegetariana o religioso?");
					palabra = sc.nextLine();
				}
				if (palabra.equalsIgnoreCase("Religiosa") || palabra.equalsIgnoreCase("religioso")) {
					datos[i][0] = true;
					datos[i][1] = false;
				} else if (palabra.equalsIgnoreCase("vegetariano") || palabra.equalsIgnoreCase("vegetariana")) {
					datos[i][0] = false;
					datos[i][1] = true;
				}
			}
		}
		System.out.println("Personas  -  Religion  -  Vegetariano");
		for (int i = 0; i < datos.length; i++) {
			System.out.print("Persona " + i + "   -   ");
			for (int j = 0; j < 2; j++) {
				System.out.print(datos[i][j] + "   -   ");
			}
			System.out.println();
		}
	}

}
