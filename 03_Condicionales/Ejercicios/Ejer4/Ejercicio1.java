package Ejer4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		double sueldo = 0;
		String nombre = "";
		int mes = 0;
		double sueldores = 0;

		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Dime tu edad: ");
		edad = sn.nextInt();
		System.out.print("Dime tu nº de mes de nacimiento: ");
		mes = sc.nextInt();
		System.out.print("Dime tu sueldo: ");
		sueldo = sn.nextDouble();

		if (nombre.equalsIgnoreCase("Enrique") && edad >= 18) {
			sueldores = sueldo * 0.15;
			System.out.println("El 15% de tu sueldo es: " + sueldores + ".");
		} else if (!nombre.equalsIgnoreCase("Enrique")) {
			sueldores = sueldo * 0.90;
			System.out.println("El 90% de tu sueldo es: " + sueldores + ".");
		}
		System.out.println(" La edad del usuario es: " + edad);
	}

}
