package Ejer2;

import java.util.*;

public class Ejercicio6_Jorge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int menor = 0;
		int medio1 = 0;
		int medio2 = 0;
		int mayor = 0;
		
		System.out.println("Dime un numero: ");
		num1 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num2 = sn.nextInt();
		
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		}else {
			mayor = num2;
			menor = num1;
		}
		
		System.out.println("Dime un numero: ");
		num3 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num4 = sn.nextInt();

		if (num3 > menor) {
			if (num3<mayor ) {
				medio1 = num3;
			}else {
				medio1 = mayor;
				mayor = num3;
			}
		}else {
			medio1 = menor;
			menor = num3;
		}
		if (num4 > menor) {
			if (num4<mayor ) {
				medio2 = num4;
			}else {
				medio2 = mayor;
				mayor = num4;
			}
		}else {
			medio2 = menor;
			menor = num4;
		}
		System.out.println(medio1 + ", " + medio2);
//		Codigo de Iñigo
	}
}
