package Ejemplos;

import java.util.Scanner;

public class ejercicioswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		// Ejercicio inicial
		// Realiza un programa que solicite al usuario un nº entre el 1 y el 5
		// y muestre ese nº en letras por consola, utiliza un if anidado

		int num = 0;
		System.out.print("Dime un número entre el 1 al 5: ");
		num = sn.nextInt();

		if (num >= 1 && num <= 5) {
			if (num == 1) {
				System.out.print("Has puesto el número uno");
			} else if (num == 2) {
				System.out.print("Has puesto el número dos");
			} else if (num == 3) {
				System.out.print("Has puesto el número tres");
			} else if (num == 4) {
				System.out.print("Has puesto el número cuatro");
			} else if (num == 5) {
				System.out.print("Has puesto el número cinco");
			}
		} else {
			System.out.println("Este número no esta entre el 1 y 5 ");
			System.out.println("Tnto");
		}

		// Nuevo ejercicio presentando Switch

		// Opc de opcion
		int opc = 0;

		System.out.print("Introduzca una opcion del 1 al 5: ");
		opc = sn.nextInt();

		// Switch elige el numero de la opcion
		switch (opc) {
		// Case son casos dependiendo del valor que tenga la etiqueta
		case 1:
			System.out.println("Has puesto el número uno");
			// break sirve para romper el caso y parar el caso
			break;
		case 2:
			System.out.println("Has puesto el número dos");
			break;
		case 3:
			System.out.println("Has puesto el número tres");
			break;
		case 4:
			System.out.println("Has puesto el número cuatro");
			break;
		case 5:
			System.out.println("Has puesto el número cinco");
			break;
		}
		// Switch es una etiqueta para poder elegir una opcion sin necesidad de hacer tantos if anidados

		// Otro ejemplo pero con string

		String nombre = "";
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		switch (nombre) {
		case "Antonio":
			System.out.print("Antonio, te ha tocado regalo");
			break;
		case "Juan":
			System.out.print("Juan, eres un cabron");
			break;
		}
		// Con String hay un problema, la palabra o el string de por sí tiene que ser
		// completamente igual (Mayusculas y minusculas)
		// Switch es preferible que se utilice con opciones numericas
		// Forma para hacerlo con string, si hay opciones diferentes de nombres, un if
		// en la que le de igual como este escrito el nombre y poder darle un numero al
		// nombre. Asi se podria escribir en minus y mayus
	}
}
