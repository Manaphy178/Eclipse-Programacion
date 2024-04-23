package Ejer2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		int edadT = 0;
		int mayor = 0;
		while (edad >= 0) {
			System.out.println("Dime la edad del alumno:");
			edad = sn.nextInt();
			if (edad >= 18) {
				mayor++;
			}
			edadT = edadT + edad;
		}
		System.out.println("La suma de todas las edades es: " + edadT);
		System.out.println("Hay " + mayor + " alumnos mayores de edad");

	}

}
