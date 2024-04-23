package Array;

import java.util.Scanner;

public class EjerEjemArrayUni3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

//		Pregunta numeros y devuelvelos al reves
//		int num = 0;
//		int[] numeros = new int[10];
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Dime un numero");
//			num = sn.nextInt();
//			numeros[i] = num;
//		}
//		for (int i = 9; i >= 0; i--) {
//			System.out.print(numeros[i] + ", ");
//		}
//		System.out.println("");
////		Del 5 al 8 posiciones
//		for (int i= 4; i <8; i++ ) {
//			System.out.print(numeros[i] + ", ");
//		}
//		System.out.println("");
////		Al reves, de 8 a 5 posiciones 
//		for (int i= 7; i >=4; i-- ) {
//			System.out.print(numeros[i] + ", ");
//		}

//		Solicita al usuario 10 numeros y introducelos en un array de manera inversa

//		for (int i = 9; i >= 0; i--) {
//			System.out.println("Dime un numero");
//			num = sn.nextInt();
//			numeros[i] = num;
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.println(numeros[i]);
//		}

//		Solicita al usuario 10 numeros en un array, despues genera otro array que tenga los pares

//		int cont = 0;
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Dime un numero");
//			num = sn.nextInt();
//			numeros[i] = num;
//		}
//		for (int i = 0; i < 10; i++) {
//			if (numeros[i] % 2 == 0) {
//				cont++;
////				Contador de posiciones que puede tener el array pares 
//			}
//		}
//		int[] pares = new int[cont];
////		Del contador dependiendo si habia pares o no, se pone el contador
//		cont = 0;
////		Se reinicia el contador o se crea uno nuevo
//		for (int i = 0; i < 10; i++) {
//			if (numeros[i] % 2 == 0) {
//				pares[cont] = numeros[i];
//				System.out.println(pares[cont]);
//				cont++;
//			}
//		}
////		De jorge, poniento length que busca la longitud del array
//		cont = 0;
//		for (int i = 0; i < pares.length; i++) {
//			if (numeros[i] % 2 == 0) {
//				pares[cont] = numeros[i];
//				System.out.println(pares[cont]);
//				cont++;
//			}
//		}

//		Solicita 10 numeros mete a array. Otros 10 numeros y metelos a otro array, final, haz otro array con los numeros de los otros 2 arrays

//		int num = 0;
//		int[] numeros1 = new int[10];
//		int[] numeros2 = new int[10];
//		int[] todos = new int[20];
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Dime un numero");
//			num = sn.nextInt();
//			numeros1[i] = num;
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Dime otros numeros");
//			num = sn.nextInt();
//			numeros2[i] = num;
//		}
//		int cont = 0;
//		for (int i = 0; i < 10; i++) {
//			todos[cont] = numeros1[i];
//			cont++;
//		}
//		for (int i = 0; i < 10; i++) {
//			todos[cont] = numeros2[i];
//			cont++;
//		}

//		Forma de Jorge

//		int cont =0;
//		for (int i =0; i<10;i++) {
//			todos[cont] = numeros1[i];
//			cont++;
//			todos[cont]=numeros2[i];
//			cont++;
//		}

//		for (int i = 0; i < todos.length; i++) {
//			System.out.println(todos[i]);
//		}

//		Solicita Solicita 10 numeros mete a array. Otros 10 numeros y metelos a otro array, final, haz otro array con los numeros primos ed los dos primeros

		int[] numeros1 = new int[10];
		int[] numeros2 = new int[10];
		int cont_primo = 0;
		boolean primo = false;

		for (int i = 0; i <= 10; i++) {
			System.out.println("Dime un numero");
			numeros1[i] = sn.nextInt();
			primo = true;
			for (int x = 2; x < numeros1[i]; x++)
				if (numeros1[i] % x == 0) {
					primo = false;
					System.out.println("no primo 1");
					break;
				}
			if (primo == true) {
				cont_primo++;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Dime un numero");
			numeros2[i] = sn.nextInt();
			for (int x = 2; x < numeros1[i]; x++)
				if (numeros2[i] % x == 0) {
					primo = false;
					System.out.println("no primo 2");
					break;
				}
			if (primo == true) {
				cont_primo++;
			}
		
		}

		int[] primos = new int[cont_primo];
		cont_primo = 0;
//		mirar
		
//		for (int i = 0; i < 10; i++) {
//			primo = true;
//			if (numeros1[i] % i == 0) {
//				primo = false;
//
//			}
//			if (primo == true) {
//				primos[cont_primo] = numeros1[i];
//				cont_primo++;
//			}
//		}
//
//		for (int i = 0; i < 10; i++) {
//			primo = true;
//			if (numeros2[i] % i == 0) {
//				primo = false;
//			}
//			if (primo == true) {
//				primos[cont_primo] = numeros2[i];
//				cont_primo++;
//			}
//		}
		for (int i = 0; i < primos.length; i++) {
			System.out.println(primos[i]);
		}
		
//		Ejercicio de jorge hecho de los primos ^
		
		int[] numeros11 = new int[10];
		int[] numeros21 = new int[10];
		int indice = 0;
		int contPrimos = 0;
		boolean esPrimo = true;
		
		//Relleno los dos primeros arrays con números 
		for (int i=0;i<10;i++) {
			System.out.println("Introduzca un nº: ");
			numeros11[i] = sn.nextInt();
		}
		for (int i=0;i<10;i++) {
			System.out.println("Introduzca un nº: ");
			numeros21[i] = sn.nextInt();
		}
		
		//cuento los primos que hay en los dos arrays
		for (int i=0;i<10;i++) {
			esPrimo = true;
			for (int j=2;j<numeros11[i];j++) {
				if (numeros11[i]%j==0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo==true) {
				contPrimos++;
			}
		}
		for (int i=0;i<10;i++) {
			esPrimo = true;
			for (int j=2;j<numeros21[i];j++) {
				if (numeros21[i]%j==0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo==true) {
				contPrimos++;
			}
		}
		
		System.out.println(contPrimos + " PRIMOS");
		
		
		//declaro el array de primos
		int[] numeros3 = new int[contPrimos];
		
		//recorro los dos primeros arrays y meto los primos en el tercer array
		for (int i=0;i<10;i++) {
			esPrimo = true;
			for (int j=2;j<numeros11[i];j++) {
				if (numeros11[i]%j==0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo==true) {
				numeros3[indice] = numeros11[i];
				indice++;
			}
		}
		for (int i=0;i<10;i++) {
			esPrimo = true;
			for (int j=2;j<numeros21[i];j++) {
				if (numeros21[i]%j==0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo==true) {
				numeros3[indice] = numeros21[i];
				indice++;
			}
		}
		
		
		//muestro el contenido del tercer array 
		for (int i=0;i<numeros3.length;i++) {
			System.out.print(numeros3[i] + ", ");
		}

	}
}
