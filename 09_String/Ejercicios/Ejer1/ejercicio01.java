package Ejer1;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Dime tu direccion");
		String direccion = sc.nextLine();
		int suma = nombre.length() + direccion.length();
		System.out.println("La suma de los caracters de ambos es: " + suma);
	}
}