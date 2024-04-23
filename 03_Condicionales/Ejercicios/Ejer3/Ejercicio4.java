package Ejer3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.print("Como te llamas: ");
		nombre = sc.nextLine();
		if (nombre.equalsIgnoreCase("Prados") || nombre.equalsIgnoreCase("Jorge") || nombre.equalsIgnoreCase("Iñigo") || nombre.equalsIgnoreCase("Sergio")){
			System.out.print("Usted esta expulsado del centro");
		}else{
			System.out.print("Bienvenido al centro nelson :)");
		}

	}

}
