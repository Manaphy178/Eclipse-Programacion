package Ejer6;

import java.util.*;

public class ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase de caracteres");
		String frase = sc.nextLine();
		String cadena = "";
		String cadena2 = "";
		int num = 0;
		int opc = 0;
		int cont = 0;
		int pos = 0;
		do {
			System.out.println("\rMenu:");
			System.out.println("1. Mostrar los primeros caracteres de la frase");
			System.out.println("2. Mostrar los ultimos caracteres de la frase");
			System.out.println("3. Eliminar los espacios en blanco del final de la frase");
			System.out.println("4. Eliminar los espacios blancos al principio de la frase");
			System.out.println("5. Eliminar el nº de caracteres a partir de posiciones");
			System.out.println("6. Eliminar primera aparicion de una frase dentro de otra");
			System.out.println("7. Insertar frase dentro de otra a partir de posicion");
			System.out.println("8. Sustituir frase por otra");
			System.out.println("9. Contar el nº de veces que aparece una frase dentro de otra");
			System.out.println("10. Borrar todas las apariciones de una frase dentro de otra");
			System.out.println("Dime una opcion");
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Dime hasta cuantos caracteres quieres ver");
				num = sn.nextInt();
				System.out.println("Caracteres desde el 0 hasta el " + num + ":\r" + frase.substring(0, num));
				break;
			case 2:
				System.out.println("Dime los ultimos caracteres que quieres ver");
				num = sn.nextInt();
				System.out.println("Caracteres desde el " + num + " hasta el final:\r" + frase.substring(num));
				break;
			case 3:
				while (Character.isWhitespace(frase.charAt(frase.length() - 1))) {
					frase = frase.substring(0, frase.length() - 1);
				}
				System.out.println(frase);
				break;
			case 4:
				for (int i = 0; i < frase.length(); i++) {
					if (Character.isLetterOrDigit(frase.charAt(i))) {
						break;
					} else {
						cont++;
					}
				}
				if (Character.isWhitespace(frase.charAt(0))) {
					frase = frase.substring(cont, frase.length());
				}
				System.out.println(frase);
				break;
			case 5:
				System.out.println("Dime un numero de caracteres que quieras eliminar");
				num = sn.nextInt();
				System.out.println("Dime la posicion ");
				pos = sn.nextInt();
				frase = frase.replace(frase.substring(pos, pos + num), "");
				System.out.println(frase);
				break;
			case 6:
				System.out.println("Que cadena quieres eliminar");
				cadena = sc.nextLine();
				if (frase.contains(cadena)) {
					frase = frase.replace(cadena, "");
				}
				System.out.println(frase);
				break;
			case 7:
				System.out.println("Dime una cadena");
				cadena = sc.nextLine();
				System.out.println("Dime una posicion");
				pos = sn.nextInt();
				frase = frase.substring(0, pos) + cadena + frase.substring(pos, frase.length());
				System.out.println(frase);
				break;
			case 8:
				System.out.println("Dime la nueva frase");
				frase = sc.nextLine();
				break;
			case 9:
				System.out.println("Dime la cadena");
				cadena = sc.nextLine();
				cont = 0;
				for (int i = 0; i < frase.length(); i++) {
					if (cadena2.contains(cadena)) {
						cont++;
						cadena2 = "";
					} else {
						cadena2 += frase.charAt(i);
					}
				}
				System.out.println("Se ha encontrado " + cont + " veces la cadena indicada");
				break;
			case 10:
				System.out.println("Dime la cadena");
				cadena = sc.nextLine();
				frase = frase.replaceAll(cadena, "");
				System.out.println(frase);
			}

		} while (opc <= 10 && opc > 0);
		System.out.println("Adios");
	}

}
