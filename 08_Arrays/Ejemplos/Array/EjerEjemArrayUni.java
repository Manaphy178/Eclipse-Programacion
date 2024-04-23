package Array;

import java.util.Scanner;

public class EjerEjemArrayUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

//		Array de 10 numeros enteros

		int[] notas = new int[10]; // Forma de definir cuantos valores van a haber en el array

		notas[0] = 23; // Define 23 a la primera posicion del array
		System.out.println(notas[0]);

		notas[0]++; // Sumas el valor de la posicion del array
		System.out.println(notas[0]);

		notas[0] = notas[0] * notas[1]; // Multiplicamos la primera posicion del array, pero no hemos introducido el
										// valor de la segunda posicion
		System.out.println(notas[0]);

//		System.out.println(notas[10]); // El array va de 0-9, 10 posiciones, si ponemos que nos diga el 10 (posicion 11) nos dara error

		if (notas[0] == 10) { // Ejemplo de condicion con array
			System.out.println("Sobresaliente");
		}

		String[] nombres = new String[5];
		nombres[0] = "Paris";

		System.out.println(nombres[0]); // Si no introducimos ningun valor al string nos dira "null", porque el array se
										// inicializa con caracter vacio

		if (nombres[0].equalsIgnoreCase("Paris")) { // Los array se pueden aplicar las mismas opciones que las variables
													// normales con un "."
			System.out.println("Estas en la peor ciudad");
		}

//		Dias de la semana
		String[] diasSemana = { "Lunes", "Martes", "Miercoles" }; // Los valores que queramos meter directamente sin
																	// decir la posicion se necesita utilizar corchetes
																	// {}
		System.out.println(diasSemana[2]);

//		Array de booleanos de 24 posiciones y pillara 24 verdaderos o falsos
		boolean[] tieneHijos = new boolean[24];// Por defecto los inicializa todos a falso
		System.out.println(tieneHijos[2]);

//		Solicita al usuario 5 notas de alumno y metelas en un array de enteros

	}

}
