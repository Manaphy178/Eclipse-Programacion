package Ejer02;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

//		Las variables siempre fuera de los bucles, para que asi no dependa una variable de si se ha iniciado o no una opcion

//		Por ejemplo, en switch creo una variable en el caso 1 y en el caso 2 utilizo esta misma varible. 
//		La variable del caso 2 depende de si se creo o no el caso 1, por eso las variables siempre mejor fuera del bucle

		int[] numeros = new int[30];
		int opc = 0;
		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;
		double media = 0;
		int suma = 0;
		int lista = 0;

		while (opc != 8) { // Mientras no sea 8 todo dpm y se seguira ejecutando
			System.out.println("");
			System.out.println("Menu:");
			System.out.println("1. Lectura de array de 30 elementos");
			System.out.println("2. Sumatorio de los elementos del array");
			System.out.println("3. Listado de los elementos array");
			System.out.println("4. Encontrar el elemento maximo del array");
			System.out.println("5. Encontrar el elemento minimo del array");
			System.out.println("6. Encontrar el rango max-min");
			System.out.println("7. Obtener la media de los elementos array");
			System.out.println("8. Salir");
			System.out.print("Elige una opcion: ");
			opc = sn.nextInt();
			switch (opc) {
			case 1: // Recojo los numeros para el array, da igual si se ejecuta este caso o no
					// porque los campos del array principalmente estan en 0 y no daria problema en
					// ningun calculo
				for (int i = 0; i < numeros.length; i++) {
					System.out.println("Dime un numero");
					numeros[i] = sn.nextInt();
				}
				System.out.println("Ya se tiene todos los numeros");
				break;
			case 2: // Sumo los valores del array
				suma = 0; // Variable que reinicio a 0, en caso de que se haya cambiado los valores del
							// array y tambien para no sumar con las operaciones de suma anteriores
				for (int i = 0; i < numeros.length; i++) {
					suma = suma + numeros[i];
				}
				System.out.println("La suma de los numeros es " + suma);
				break;
			case 3:
				lista = 1; // Varible lista que reinicio si se vuelve a elegir esta opcion
				for (int i = 0; i < numeros.length; i++) {
					System.out.println(lista + "º. " + numeros[i]);
					lista++;
				}
				break;
			case 4:
				max = Integer.MIN_VALUE; // Funcion que coge el numero minimo posible de un int (Ej; -10000... o mas),
											// lo aplicamos a la variable de max para asi poder decirle que hasta el -1
											// puede ser el maximo. Queremos que max tenga un numero mayor al que tenia
											// anteriormente
				System.out.println(max); // Este syso es para que tengas una idea del numero
				for (int i = 0; i < numeros.length; i++) {
					if (numeros[i] > max) {
						max = numeros[i];
					}
				}
				System.out.println("El numero maximo es " + max);
				break;
			case 5:
				min = Integer.MAX_VALUE; // Funcion que coge el numero maximo posible de un int (Ej; 10000...) lo
											// aplicamos a min para que pueda cambiar de valor a uno mas pequeño a la
											// fuerza
				System.out.println(min); // Este syso es para que tengas una idea del numero

				for (int i = 0; i < numeros.length; i++) {
					if (numeros[i] < min) {
						min = numeros[i];
					}
				}
				System.out.println("El numero minimo es " + min);
				break;
			case 6:
				min = Integer.MAX_VALUE; // Reinicio las variables con la misma funcion del caso 4 y 5
				max = Integer.MIN_VALUE;
				for (int i = 0; i < numeros.length; i++) {
					if (numeros[i] < min) {
						min = numeros[i];
					}
					if (numeros[i] > max) {
						max = numeros[i];
					}
				}
				System.out.println("El rango de los valores es " + max + " - " + min);
				break;
			case 7:
				suma = 0;
				media = 0;
				for (int i = 0; i < numeros.length; i++) {
					suma = suma + numeros[i];
				}
				media = suma / numeros.length; // Lo divido entre numeros.length por si el array numeros tiene mas o
												// menos posiciones. Y asi no da una media erronea. Puedes hacer una
												// comprobacion si cambias el numero de posiciones del array, tambien
												// puede servir por si le pides el numero de posiciones de array al
												// usuario y no poner un numero como tal (Ej; 30)
				System.out.println("El valor de numeros length es: " + numeros.length); // Para que veas el valor que da
																						// y que se puede utilizar como
																						// una variable int (int porque
																						// son posiciones, no puede
																						// hacerse como si fuera un
																						// double ya que no puede
																						// existir la posicion 1,5)
				System.out.println("La media de los elementos es " + media);
				break;
			case 8:
				System.out.println("Adios");
				break;
			}
		}

	}
}
