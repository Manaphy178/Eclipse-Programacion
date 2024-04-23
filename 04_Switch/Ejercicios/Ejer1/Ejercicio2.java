package Ejer1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		String nombre = "";
		String apellido = "";
		double sueldo = 0;
		double anual =0;
		int meses = 0;
		double res = 0;
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Dime tu apellido: ");
		apellido = sc.nextLine();
		System.out.print("Dime tu sueldo: ");
		sueldo = sn.nextDouble();

		System.out.println("Er menu:");
		System.out.println("1. Mostrar saldo anual");
		System.out.println("2. Mostrar cuanto te dan por pringao y perder el curro");
		System.out.println("3. Fuera de mi vista");
		System.out.print("Elige una opcion: ");
		opc = sn.nextInt();
		switch(opc) {
		case 1:
			System.out.println("Vamos a calcular tu sueldo");
			anual = sueldo * 12;
			System.out.println("Tu sueldo anual: " + anual);
			break;
		case 2:
			System.out.println("Joder, que has hecho para perder el curro");
			System.out.println("Dime el numero de meses que llevas trabajando");
			meses = sn.nextInt();
			res = meses * (sueldo * 50/100); 
			System.out.println("El finiquito que te llevas es: " + res + "€");
			break;
		case 3:
			break;
		}
	}

}
