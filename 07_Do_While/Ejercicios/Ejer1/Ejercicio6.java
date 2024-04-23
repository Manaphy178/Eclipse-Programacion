package Ejer1;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int num = 0;
		int veces = 0;
		System.out.println("Dime cuantas veces quieres escuchar el eco:");
		num = sn.nextInt();
		do {
			System.out.println("Eco...");
			veces++;
		} while (veces <= num);

	}

}
