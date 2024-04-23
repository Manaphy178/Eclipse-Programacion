package Ejer1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		String nombre = "";

		String telefono = "";
		String direccion = "";
		String mail = "";
		System.out.println("Dime tu nombre y apellido: ");
		nombre = sc.nextLine();
		System.out.println("Dime tu telefono: ");
		telefono = sc.nextLine();
		System.out.println("Dime tu direccion: ");
		direccion = sc.nextLine();
		System.out.println("Dime tu mail: ");
		mail = sc.nextLine();
		System.out.println("Menu:");
		System.out.println("1. Formato 1");
		System.out.println("2. Formato 2");
		System.out.println("3. Formato 3");
		System.out.println("4. Salir");
		System.out.print("Elige una opcion: ");
		opc = sn.nextInt();
		switch (opc) {
		case 1:
			System.out.println(nombre + "-" + telefono + "-" + direccion + "-" + mail);
			break;
		case 2:
			System.out.println(
					"Nombre: " + nombre + "\r Tel: " + telefono + "\r Direccion: " + direccion + "\r Mail: " + mail);
			break;
		case 3:
			System.out.println(nombre + ":" + telefono + ":" + direccion + ":" + mail);
			break;
		case 4:
			break;
		}
	}

}
