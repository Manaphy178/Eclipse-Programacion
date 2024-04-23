package Ejer2;

import java.util.Scanner;

public class Ejer15_jorge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String apellido = "";
		double sueldo = 0;
		int antiguedad = 0;
		int plusAnti = 0;
		int plusHijos = 0;
		int edad = 0;
		int hijos = 0;
		double anual = 0;
		double irpfmen = 0;
		double irpfanu = 0;
		System.out.print("Cual es tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Cual es tu apellido: ");
		apellido = sc.nextLine();
		System.out.print("Cual es tu sueldo mensual: ");
		sueldo = sn.nextDouble();
		System.out.print("Cuantos años de antiguedad tienes: ");
		antiguedad = sn.nextInt();
		System.out.print("Cuantos años tienes: ");
		edad = sn.nextInt();
		System.out.print("Cuantos hijos tienes: ");
		hijos = sn.nextInt();
		plusAnti = (antiguedad / 5) * 45;
		if (hijos >= 2) {
			plusHijos = 400;
		} else if (hijos == 0) {
			plusHijos = plusHijos - 50;
		}
		if (edad >= 50 && edad <= 60) {
			sueldo = (sueldo * 0.1) + sueldo;
		}
		anual = (sueldo * 12) + plusHijos + plusAnti * 12;
		System.out.println("Sueldo anual: " + anual);
		sueldo = sueldo + plusAnti;
		System.out.println("Sueldo mensual: " + sueldo);
		System.out.println("Sueldo anual: " + (anual - (anual * 0.19)));
		System.out.println("Sueldo mensual: " + (sueldo - (sueldo * 0.19)));
	}

}
