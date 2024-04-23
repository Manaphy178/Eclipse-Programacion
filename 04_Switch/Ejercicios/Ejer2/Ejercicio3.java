package Ejer2;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		String nombre = "";
		System.out.print("Dime tu nombre: ");
		nombre = sn.nextLine();
		if (nombre.equalsIgnoreCase("brais")) {
			opc = 1;
		} else if (nombre.equalsIgnoreCase("barbara")) {
			opc = 2;
		} else if (nombre.equalsIgnoreCase("patricia")) {
			opc = 3;
		} else if (nombre.equalsIgnoreCase("david")) {
			opc = 4;
		} else if (nombre.equalsIgnoreCase("alvaro")) {
			opc = 5;
		} else if (nombre.equalsIgnoreCase("jorge")) {
			opc = 6;
		} else {
			System.out.println("El nombre que has puesto no es de ningun profesor del Centro Nelson");
		}
		switch (opc) {
		case 1:
			System.out.println("La verdad es que es normalito");
			break;
		case 2:
			System.out.println("Un poco resultona");
			break;
		case 3:
			System.out.println("Del monton");
			break;
		case 4:
			System.out.print("Pufffff.....");
			break;
		case 5:
			System.out.print("Es algo guapete");
			break;
		case 6:
			System.out.print("Es tan tremendamente atractivo que me he enamorado");
			break;
		}
	}

}
