package Ejer1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int opc = 0;
		double sueldo = 0;
		double precio = 0;
		double irpf = 0;
		double res = 0;
		System.out.println("Menu:");
		System.out.println("1. Cualcular IVA");
		System.out.println("2. Calcular IRPF de sueldo");
		System.out.println("3. Calcular paga extra de un empleado");
		System.out.println("4. Salir");
		System.out.print("Elige una opcion: ");
		opc = sn.nextInt();
		switch (opc) {
		case 1:
			System.out.println("Dime el precio del producto");
			precio = sn.nextDouble();
			System.out.println("El precio de la IVA es: " + (precio * 21 / 100));
			break;
		case 2:
			System.out.println("Dime el sueldo");
			sueldo = sn.nextDouble();
			System.out.println("Cuanto te roba el IRPF");
			irpf = sn.nextDouble();
			res = sueldo * irpf / 100;
			System.out.println("El IRPF te ha robado: " + res + "€, menudo tonto");
			break;
		case 3:
			System.out.println("Dime cuanto te pagan:");
			sueldo = sn.nextDouble();
			res = sueldo * 1.25;
			System.out.println("El valor de la paga extra es: " + res);
			break;
		case 4:
			break;
		}
	}

}
