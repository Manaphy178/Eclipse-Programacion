package Ejer10;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("Longitud del array: ");
		int longi = sn.nextInt();
		int[] edad = new int[longi];
		String[] nombre = new String[longi];
		int contPri = 0;
		boolean primo = true;
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Dime tu nombre");
			nombre[i] = sc.nextLine();
			System.out.println("Dime tu edad");
			edad[i] = sn.nextInt();
		}
		for (int i = 0; i < edad.length; i++) {
			primo = true;
			for (int j = 2; j < edad[i]; j++) {
				if (edad[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				contPri++;
			}
		}
		int[] edadPri = new int[contPri];
		String[] nomPri = new String[contPri];
		contPri = 0;
		for (int i = 0; i < edad.length; i++) {
			primo = true;
			for (int j = 2; j < edad[i]; j++) {
				if (edad[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				edadPri[contPri] = edad[i];
				nomPri[contPri] = nombre[i];
				contPri++;
			}
		}
		System.out.println("Personas con edad nº Primo:");
		for (int i = 0; i < nomPri.length; i++) {
			System.out.println(nomPri[i] + " - " + edadPri[i]);
		}
	}

}
