package Ejer2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int mid = 0;
		System.out.println("Dime el numero maximo del rango: ");
		max = sn.nextInt();
		System.out.println("Dime el numero minimo del rango: ");
		min = sn.nextInt();
		System.out.println("Dime un numero que este entre esos dos rangos: ");
		mid = sn.nextInt();
		while (mid > max || mid < min) {
			System.out.println("Ese numero no esta entre esos dos rangos, introduzca de nuevo el numero: ");
			mid = sn.nextInt();
		}
	}

}
