package Ejer4;

import java.util.Scanner;

public class Ejercicio0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double notas = 0;
		int aprovados = 0;
		int suspensos = 0;
		double mayor = 0;
		double menor = 10;
		double media = 0;
		double suma = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Dime tu nota");
			notas = sn.nextDouble();
			if (notas >= 0 && notas <= 10) {
				if (notas >= 5) {
					aprovados++;
				}
				if (notas < 5) {
					suspensos++;
				}
				if (notas > mayor) {
					mayor = notas;
				} else if (notas < menor) {
					menor = notas;
				}
				suma = suma + notas;
			} else {
				System.out.println("La nota introducida no es valida");
				i--;
			}

		}
		media = suma / 20;
		System.out.println("El numero de aprovados es de: " + aprovados);
		System.out.println("La nota mas alta es: " + mayor);
		System.out.println("La cantidad de suspensos es de: " + suspensos);
		System.out.println("La nota mas baja es: " + menor);
		System.out.println("Y la media de todas las notas es: " + media);

	}

}
