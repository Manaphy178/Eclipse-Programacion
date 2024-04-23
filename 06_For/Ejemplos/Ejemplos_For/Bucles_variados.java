package Ejemplos_For;

import java.util.Scanner;

public class Bucles_variados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

//		Ejer1 Ejercicio que pida 20 notas, diga cuales son suspensos, aprovados, cual es la mejor nota y la peor y la media de todas las notas

//		double notas = 0;
//		int aprovados = 0;
//		int suspensos = 0;
//		double mayor = 0;
//		double menor = 10;
//		double media = 0;
//		double suma = 0;
//		for (int i = 0; i < 20; i++) {
//			System.out.println("Dime tu nota");
//			notas = sn.nextDouble();
//			if (notas >= 0 && notas <= 10) {
//				if (notas >= 5) {
//					aprovados++;
//				}
//				if (notas < 5) {
//					suspensos++;
//				}
//				if (notas > mayor) {
//					mayor = notas;
//				} else if (notas < menor) {
//					menor = notas;
//				}
//				suma = suma + notas;
//			} else {
//				System.out.println("La nota introducida no es valida");
//				i--;
//			}
//
//		}
//		media = suma / 20;
//		System.out.println("El numero de aprovados es de: " + aprovados);
//		System.out.println("La nota mas alta es: " + mayor);
//		System.out.println("La cantidad de suspensos es de: " + suspensos);
//		System.out.println("La nota mas baja es: " + menor);
//		System.out.println("Y la media de todas las notas es: " + media);

//		Ejer2 Programa que muestre del 1 al 10. Cada numero par dira que es par. Cada numero menor de 5 dira que es menor de 5

//		for (int i = 1; i < 11; i++) {
//			System.out.println(i);
//			if (i % 2 == 0) {
//				System.out.println(" Es par");
//			}
//			if (i < 5) {
//				System.out.println("Es menor a 5");
//			}
//		}

//		Ejer3 Solicita al usuario numeros hasta que diga no y pregunta si quiere introducir otro. Deberas mostrar los nº pares/impares/primos introducidos y tambien el numero menor inroducido

		String resp = "";
		int num = 0;
		int pares = 0;
		int impar = 0;
		int primo = 0;
		int menor = Integer.MAX_VALUE; //Esto es para pillar el numero mas alto que puede un Int

		boolean esPrimo = true;

		do {
			System.out.println("Dime un numero");
			num = sn.nextInt();
			for (int i = 2; i < num; i++) {
				esPrimo = true;

				if (num % i == 0) {
					esPrimo = false;
					break;
				}

			}
			if (num % 2 == 0) {
				pares++;
			}
			if (num % 2 != 0) {
				impar++;
			}
			if (esPrimo == true) {
				primo++;
			}
			if (menor > num) {
				menor = num;
			}
			System.out.println("Quieres volver a introducir un numero?");
			resp = sc.nextLine();
		} while (!resp.equalsIgnoreCase("no"));
		System.out.println("Has introducido " + pares + " numeros pares");
		System.out.println("Has introducido " + impar + " numeros impares");
		System.out.println("Has introducido " + primo + " numeros primos");
		System.out.println("El numero menor que has introducido es: " + menor);
	}

}
