package Ejer1;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int empleados = 0;
		int index = 0;
		double sueldo = 0;
		double sueldos = 0;
		double total = 0;
		System.out.println("Cuantos empleados hay:");
		empleados = sn.nextInt();
		do {
			System.out.println("Cual es tu sueldo:");
			sueldo = sn.nextDouble();
			sueldos = sueldos + sueldo;
			index++;
		} while (index < empleados);
		total = sueldos / empleados;
		System.out.println("La media final de todos los sueldos es: " + total);
	}

}
