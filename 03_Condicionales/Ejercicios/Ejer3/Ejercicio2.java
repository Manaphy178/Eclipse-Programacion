package Ejer3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		System.out.print("Como te llamas: ");
		nombre = sc.nextLine();
		System.out.print("Cuantos años tienes: ");
		edad = sn.nextInt();
		if (nombre.equalsIgnoreCase("Prados") && edad >= 16) {
			System.out.print("Enhorabuena, no todos los dias se encuentra un Prados mayor de 16 años");
		} else {
			System.out.print("Po' vale, estoy buscando a un Prados de 16");
		}
	}

}
