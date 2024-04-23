package Ejer1;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Dime tu apellido");
		String apellido = sc.nextLine();
		System.out.println("Dime tu DNI");
		String DNI = sc.nextLine();
		String datos = "";
		datos = datos.concat(nombre) + " - " + datos.concat(apellido) + " - " + datos.concat(DNI);
		System.out.println(datos);
	}
}