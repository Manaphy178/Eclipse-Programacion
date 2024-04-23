package Ejer1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.print("Como te llamas: ");
		nombre = sc.nextLine();
		if (nombre.equals("Isabel") || nombre.equals("isabel")) {
			System.out.println("Las Isabeles son geniales");
			System.out.println("Eres muy isabelina!");
		}
	}

}
