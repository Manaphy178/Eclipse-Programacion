package Ejer4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre1 = "";
		String nombre2 = "";
		String nombre3 = "";
		String nombre4 = "";
		int opc = 0;
		System.out.print("Dime un nombre: ");
		nombre1 = sc.nextLine();
		System.out.print("Dime un nombre: ");
		nombre2 = sc.nextLine();
		System.out.print("Dime un nombre: ");
		nombre3 = sc.nextLine();
		System.out.print("Dime un nombre: ");
		nombre4 = sc.nextLine();
		if (nombre1.equalsIgnoreCase("prados") || nombre2.equalsIgnoreCase("prados")
				|| nombre3.equalsIgnoreCase("prados") || nombre4.equalsIgnoreCase("prados")) {
			opc = 1;

		} else if (nombre1.equalsIgnoreCase("sergio") && nombre2.equalsIgnoreCase("sergio")
				&& nombre3.equalsIgnoreCase("sergio") && nombre4.equalsIgnoreCase("sergio")) {
			opc = 2;

		}
		if ((nombre1.equalsIgnoreCase("prados") || nombre2.equalsIgnoreCase("prados")
				|| nombre3.equalsIgnoreCase("prados") || nombre4.equalsIgnoreCase("prados"))
				&& (nombre1.equalsIgnoreCase("sergio") || nombre2.equalsIgnoreCase("sergio")
						|| nombre3.equalsIgnoreCase("sergio") || nombre4.equalsIgnoreCase("sergio"))) {
			opc = 3;

		}
		switch (opc) {
		case 1:
			System.out.print("Tenemos algun Prados");
			break;
		case 2:
			System.out.println("Team Sergios");
			break;
		case 3:
			System.out.println("Sergio y Prados son JavaBros");
			break;
		}
	}

}
