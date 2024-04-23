package Ejer1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int num = 0;
		int opt = 0;
		System.out.println("Dime un numero: ");
		num = sn.nextInt();
		while (num >= 0) {
			System.out.println(num);
			num--;
		}

	}

}
