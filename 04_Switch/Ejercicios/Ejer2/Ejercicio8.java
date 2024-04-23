package Ejer2;

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		double peso = 0;
		double altura = 0;
		int edad = 0;
		double tmb = 0;
		System.out.println("Elige para calcular metabolismo:");
		System.out.println("1. Hombre");
		System.out.println("2. Mujer");
		System.out.println("3. Salir");
		System.out.print("Elige una opcion: ");
		opc = sn.nextInt();
		switch (opc) {
		case 1:
			System.out.println("Dime tu peso en kg ");
			peso = sn.nextDouble();
			System.out.println("Dime tu altura en cm");
			altura = sn.nextDouble();
			System.out.println("Dime tu edad");
			edad = sn.nextInt();
			tmb = (10 * peso) + (6.25 * altura) - (edad * 5) + 5;
			System.out.println("Tu TBM es: " + tmb);
			break;
		case 2:
			System.out.println("Dime tu peso en kg ");
			peso = sn.nextDouble();
			System.out.println("Dime tu altura en cm");
			altura = sn.nextDouble();
			System.out.println("Dime tu edad");
			edad = sn.nextInt();
			tmb = (10 * peso) + (6.25 * altura) - (edad * 5) - 161;
			System.out.println("Tu TBM es: " + tmb);
			break;
		case 3:
			break;

		}
	}

}
