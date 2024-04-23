package Ejer3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double sueldo = 0;
		System.out.print("Dime tu sueldo mensual: ");
		sueldo = sn.nextDouble();
		if (sueldo < 700){
			sueldo = sueldo * 0.98;
		}
		if (sueldo >= 700 && sueldo < 1000){
			sueldo = sueldo * 0.96;
		}
		if (sueldo >= 1000 && sueldo <= 2000){
			sueldo = sueldo * 0.80;
		} 
		if (sueldo > 2000){
			sueldo = sueldo * 0.55;
		}
		System.out.print("Su sueldo con el IRPF es: " + sueldo);
	}

}
