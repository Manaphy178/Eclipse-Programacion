package Ejer2;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double salario = 0;
		int horas = 0;
		double resul = 0;
		System.out.println("Cuanto cobras por hora");
		salario = sn.nextDouble();
		System.out.println("Cuantas horas trabajas:");
		horas = sn.nextInt();
		if (horas > 40) {
			resul = salario * 40 + (salario * (horas - 40) * 1.5);
			System.out.println("Tu salario es de: " + resul);
		}else {
			resul = salario * horas;
			System.out.println("Tu salario es de: " + resul);
		}
	}
}
