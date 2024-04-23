package Ejer1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nom = "";
		int num = 0;
		System.out.print("Dime tu nombre: ");
		nom = sc.nextLine();
		System.out.print("Dime el numero de veces que quieres que se repita: ");
		num = sn.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(nom);
		}
	}

}
