package Ejer2;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		double num1 = 0;
		double num2 = 0;
		double resul = 0;
		System.out.println("Menu:");
		System.out.println("1. Calcular el área de un cuadrado");
		System.out.println("2. Calcular el área de un triangulo");
		System.out.println("3. Calcular el área de un circulo");
		System.out.println("4. Salir");
		System.out.print("Elige una opcion: ");
		opc = sn.nextInt();
		if (opc == 1) {
			
			System.out.println("Dime el lado del cuadrado: ");
			num1 = sn.nextDouble();
			resul = num1 * num1;
			System.out.print("El área del cuadrado es: " + resul);
			
		} else if (opc == 2) {
			
			System.out.println("Dime la base del triangulo: ");
			num1 = sn.nextDouble();
			System.out.println("Dime la altura del triangulo: ");
			num2 = sn.nextDouble();
			resul = num1 * num2 / 2;
			System.out.println("El area del triangulo es: " + resul);
			
		} else if (opc == 3) {
			
			System.out.println("Dime el radio del circulo: ");
			num1 = sn.nextDouble();
			resul = Math.PI * Math.pow(num1, 2);
			System.out.println("El area del circulo es: " + resul);
			
		} else if (opc == 4 ) {
			System.out.println("Adios");
		}
	}

}
