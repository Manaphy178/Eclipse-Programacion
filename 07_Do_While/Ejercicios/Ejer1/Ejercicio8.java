package Ejer1;

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		String resp = "";
		int edad = 0;
		int edades = 0;
		int index = 0;
		int index2 = 0;
		do {
			System.out.println("Dime tu edad:");
			edad = sn.nextInt();
			edades = edades + edad;
			System.out.println("Quieres seguir introduciendo edades?");
			resp = sc.nextLine();
			if (resp.equalsIgnoreCase("no")) {
				index++;
			}
		} while (index == index2);
		System.out.println("La suma de todas las edades es: " + edades);

	}

}
