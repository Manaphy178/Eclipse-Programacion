package Ejer02;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		double[] notas = new double[10];
		double nota = 0;
		String[] nombres = new String[10];
		String[] resultados = new String[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Dime tu nota master: ");
			nota = sn.nextDouble();
			if (nota <= 10 && nota >= 0) { // Veo si la nota que me ha dado esta entre 0 y 10
				notas[i] = nota;
				System.out.print("Che, que antes se me olvido tu nombre: ");
				nombres[i] = sc.nextLine();

			} else { // Si la nota esta fuera del rango de las notas, le digo que la nota estaba mal
						// y le resto 1 a "i". Para que asi no se cuente el ciclo del bucle y se salte
						// alguna posicion/dato
				System.out.println("Ehhhhhhh, que esa nota no es valida");
				i--;
			}
		}
		int cont = 1; // Para hacer una lista de 1º 2º 3º
		for (int i = 0; i < notas.length; i++) { // Recorro todas las posiciones notas con la i y evaluo la nota,
													// dependiendo de que, le voy a aplicar el resultado de la nota
			if (notas[i] >= 0 && notas[i] < 5) {
				resultados[i] = "Suspenso";
			}
			if (notas[i] >= 5 && notas[i] < 7) {
				resultados[i] = "Bien";
			}
			if (notas[i] >= 7 && notas[i] < 9) {
				resultados[i] = "Notable";
			}
			if (notas[i] >= 9 && notas[i] <= 10) {
				resultados[i] = "Sobresaliente";
			}
			System.out.println("Alumno nº" + cont + ": " + nombres[i] + " - " + notas[i] + " - " + resultados[i]);
			cont++;
		}

	}

}
