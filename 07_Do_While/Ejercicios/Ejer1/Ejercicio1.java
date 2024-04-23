package Ejer1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int num = 0;
		int cm = 1;
		int arbol = 0;
		double alto = 1;
		do {
			System.out.println("Dime la altura del arbol en cm: ");
			cm = sn.nextInt();
			if (cm > alto) {
				alto = cm;
				alto = alto / 100;
			}
			arbol++;
		} while (cm > -1);
		System.out.println("Árbol más alto: Árbol " + arbol + " - " + alto + " metros");
	}

}
