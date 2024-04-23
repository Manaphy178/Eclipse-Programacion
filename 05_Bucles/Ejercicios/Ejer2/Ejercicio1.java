package Ejer2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int num = 0;
		int cont = 5;

		while (cont != 501) {
			if (cont == 13 || cont == 15 || cont == 18) {
				cont++;
			} else {
				System.out.println(cont);
				cont++;
			}

		}
	}

}
