package Ejer2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String apellido = "";
		double sueldo = 0;
		int antiguedad = 0;
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

		antiguedad = antiguedad / 5;

		if (edad >= 50 && edad <= 60) {
			sueldo = sueldo * 1.1;
			// System.out.println(sueldo);
		}
		if (antiguedad >= 1) {
			sueldo = sueldo + (antiguedad * 45);
			// System.out.println(sueldo);
		}
		anual = sueldo * 12;
		// System.out.println(anual);
		if (hijos >= 2) {
			anual = anual + 400;
			// System.out.println(anual);
		} else if (hijos < 1) {
			anual = anual - 50;
			// System.out.println(anual);
		}
		System.out.println("El sueldo mensual es: " + sueldo);
		System.out.println("El sueldo anual es: " + anual);
		irpfmen = sueldo * 0.81; // Esto estaba mal, habia un 0.81 y es un 0.19
		irpfanu = anual * 0.81; // Esto estaba mal, habia un 0.81 y es un 0.19
		System.out.println("El sueldo mensual con irpf es: " + irpfmen);
		System.out.println("El sueldo anual con irpf es: " + irpfanu);
	}
}
// Cual es tu nombre: dsa
// Cual es tu apellido: da
// Cual es tu sueldo mensual: 1000
// Cuantos años de antiguedad tienes: 10
// Cuantos años tienes: 55
// Cuantos hijos tienes: 3
// Sueldo anual: 14680.0
// Sueldo mensual: 1190.0
// Sueldo anual: 11890.8
// Sueldo mensual: 963.9