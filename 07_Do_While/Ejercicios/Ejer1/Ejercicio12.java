package Ejer1;

import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int opc = 0;
		String nombre = "";
		String dni = "";
		int edad = 0;
		String domicilio = "";
		do {
			System.out.println("Menu");
			System.out.println("1. Crear usuario");
			System.out.println("2. Eliminar usuario");
			System.out.println("3. Modificar usuario");
			System.out.println("4. Visualizar datos usuario");
			System.out.println("5. Salir");
			System.out.print("Elige opcion: ");
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				System.out.print("Dime tu nombre: ");
				nombre = sc.nextLine();
				System.out.print("Dime tu edad: ");
				edad = sn.nextInt();
				System.out.print("Dime tu DNI: ");
				dni = sc.nextLine();
				System.out.print("Dime tu domicilio: ");
				domicilio = sc.nextLine();
				System.out.println("Hemos creado un usuario \r");
				break;
			case 2:
				System.out.println("Borramos el usuario \r");
				nombre = "";
				edad = 0;
				dni = "";
				domicilio = "";
				break;
			case 3:
				System.out.print("Dime de nuevo tu nombre: ");
				nombre = sc.nextLine();
				System.out.print("Dime de nuevo tu edad: ");
				edad = sn.nextInt();
				System.out.print("Dime de nuevo tu DNI: ");
				dni = sc.nextLine();
				System.out.print("Dime de nuevo tu domicilio: ");
				domicilio = sc.nextLine();
				System.out.println("Hemos modificado el usuario \r");
				break;
			case 4:
				System.out.println("Visualizando los datos del usuario");
				System.out.println(nombre);
				System.out.println(edad);
				System.out.println(dni);
				System.out.println(domicilio + "\r");
				break;
			case 5:
				System.out.println("Adios");
				break;
			}
		} while (opc != 5);

	}

}
