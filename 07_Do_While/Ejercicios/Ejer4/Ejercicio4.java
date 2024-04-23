package Ejer4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int veces = 0;
		String nombre = "";
		String nombre_min = "";
		String nombre_max = "";
		double nota = 0;
		double nota_max = 0;
		double nota_min = 10;
		int aprovados = 0;
		int suspensos = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Dime tu nombre: ");
			nombre = sc.nextLine();
			System.out.println("Dime tu nota de programacion:");
			nota = sn.nextDouble();
			if (nota >= 0 && nota <= 10) {
				if (nota >= 5) {
					aprovados++;
				}
				if (nota < 5) {
					suspensos++;
				}
				if (nota > nota_max) {
					nota_max = nota;
					nombre_max = nombre;
				} else if (nota < nota_min) {
					nota_min = nota;
					nombre_min = nombre;
				}

			} else {
				System.out.println("La nota introducida no es valida");
				i--;
			}
		}
		System.out.println("El numero de aprovados es de: " + aprovados);
		System.out.println("El alumno " + nombre_max + " tiene la nota mas alta:  " + nota_max);
		System.out.println("La cantidad de suspensos es de: " + suspensos);
		System.out.println("El alumno " + nombre_min + " tiene la nota mas baja: " + nota_min);

	}

}
