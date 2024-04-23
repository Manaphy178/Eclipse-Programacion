package Metodos;

import java.util.*;

public class Metodos1 {
//	Metodo (static) se pone siempre	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String frase = "";
		// Podemos llamar los metodos llamandolos desde las clases, podemos hacer clases
		// para hacer metodos
		Metodos1.saludo();
		// O llamandolo directamente en el mismo codigo
		saludo();

//		*******************************************************************************************

		// Para hacer un saludo personalizado, podemos poner nosotros la frase o pedir
		// al usuario que la ponga //
		Metodos1.saludoPersonalizado("Hola cara bola");
		System.out.println("Dime una frase");
		frase = sc.nextLine();
		Metodos1.saludoPersonalizado(frase);
		// O de otra forma mas rapida
		System.out.println("Dime una frase");
		Metodos1.saludoPersonalizado(sc.nextLine());
		saludoPersonalizado(sc.nextLine());

//		*******************************************************************************************

		// En este caso necesitamos variables para poder hacer metodos con 2 parametros
		System.out.println("Dime una frase");
		frase = sc.nextLine();
		System.out.println("Dime otra frase");
		String frase2 = sc.nextLine();
		Metodos1.saludoPersonalizado(frase, frase2);
		saludoPersonalizado(frase, frase2);

//		*******************************************************************************************

//		Funcion de multiplicar
		System.out.println("Dime un numero");
		int num1 = sn.nextInt();
		System.out.println("Dime otro numero");
		int num2 = sn.nextInt();
		System.out.println(Metodos1.multiplica(num1, num2));
//		System.out.println(multiplica(num1, num2));

//		*******************************************************************************************

//		Contar vocales
		System.out.println("Dime una frase");
		System.out.println(vocales(sc.nextLine()));
		System.out.println(Metodos1.vocales(sc.nextLine()));
//		O
		System.out.println("Dime una frase");
		frase = sc.nextLine();
		System.out.println(vocales(frase));
		System.out.println(Metodos1.vocales(frase));

//		*******************************************************************************************

//		Mostrar solo consonantes
		System.out.println("Dime una frase");
		Metodos1.mostrarConsonante(sc.nextLine());

//		*******************************************************************************************

//		Mostrar vocales de 3 parametros
		System.out.println("Dime una cadena de frases");
		String cadena1 = sc.nextLine();
		System.out.println("Dime una cadena de frases");
		String cadena2 = sc.nextLine();
		System.out.println("Dime una cadena de frases");
		String cadena3 = sc.nextLine();
		Metodos1.cadenasVocal(cadena1, cadena2, cadena3);

	}

//	Para hacer un metodo tiene que ser fuera del public static void main
//	Metodo (void) que no devuelve nada, hace algo. por eso no pongo nada entre los parentesis 

	static void saludo() {
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("*                        * ");
		System.out.println("*    Hola amiguitos      * ");
		System.out.println("*                        * ");
		System.out.println("**************************");
		System.out.println("**************************");
	}

//  Otro metodo pero que el usuario lo modifique
//	Ahora le pasamos un parametro

	static void saludoPersonalizado(String cadena) {
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("*                        * ");
		System.out.println("*    " + cadena + "      * ");
		System.out.println("*                        * ");
		System.out.println("**************************");
		System.out.println("**************************");
	}

//	Metodo que recibe 2 parametros.
//	Aunque se llamen igual los metodos pueden funcionar por la sobre carga de metodos. 
//	Si le das 2 cadenas ejecutara este, en caso de solo 1 ejecutara el de arriba

	static void saludoPersonalizado(String cadena, String cadena2) {
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("*                        * ");
		System.out.println("*    " + cadena + "      * ");
		System.out.println("*                        * ");
		System.out.println("*    " + cadena2 + "      * ");
		System.out.println("*                        * ");
		System.out.println("**************************");
		System.out.println("**************************");
	}

//	Metodo que recibe por parametros 2 numeros y devuelve multiplicacion
//	Al devolver un parametro se pone el tipo de dato que devuelve en vez de void

	static double multiplica(double num1, double num2) {
		double resul = 0;
		resul = num1 * num2;
		return resul;
	}

//	Metodo que recibe por parametro una cadena y devuelva el nº de vocales que tiene esa cadena

	static int vocales(String cadena) {
		String[] vocal = { "a", "e", "i", "o", "u" };
		int cont = 0;
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < vocal.length; j++) {
				if (String.valueOf(cadena.charAt(i)).equalsIgnoreCase(vocal[j])) {
					cont++;
				}
			}
		}
		return cont;
	}

//	Metodo que muestre en pantalla las consonantes de una cadena
//	Recibe por parametro una cadena. NO DEVUELVE NADA.
//	Ejemplo "mi gato come mucho" - mgtcmmch"

	static void mostrarConsonante(String cadena) {
		String aux = "";
		String vocal = "aeiou";
		for (int i = 0; i < cadena.length(); i++) {

			for (int j = 0; j < vocal.length(); j++) {
				if (!vocal.contains(String.valueOf(cadena.charAt(i)))) {
					aux += cadena.charAt(i);
					break;
				}
			}
		}
		System.out.println(aux);
	}

//	Metodo que reciba 3 cadenas por parametro y devuelva una cadena con todas las 
//	vocales de las 3 cadenas recibidas por parametro. 
//	Ejemplo: c1 "hola pepe" c2 "Adios" c3 "paquete"
//	"oaeeAioauee"
	
	static void cadenasVocal(String c1, String c2, String c3) {
		String[] cadenas = { c1, c2, c3 };
		String resul = "";

		String vocal = "aeiouAEIOU";
		for (int i = 0; i < cadenas.length; i++) {
			for (int j = 0; j < cadenas[i].length(); j++) {
				for (int x = 0; x < vocal.length(); x++) {
					if (vocal.contains(String.valueOf(cadenas[i].charAt(j)))) {
						resul += cadenas[i].charAt(j);
						break;
					}
				}
			}
		}
		System.out.println(resul);
	}
}
