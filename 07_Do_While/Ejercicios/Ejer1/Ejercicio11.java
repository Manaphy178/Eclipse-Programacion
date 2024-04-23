package Ejer1;

import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int opc = 0;

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
				System.out.println("Hemos creado un usuario");
				break;
			case 2:
				System.out.println("Borramos el usuario");
				break;
			case 3:
				System.out.println("Modificamos el usuario");
				break;
			case 4:
				System.out.println("Visualizamos datos del usuario");
				break;
			case 5:
				System.out.println("Adios");
				break;
			}
		} while (opc != 5);

	}

}
