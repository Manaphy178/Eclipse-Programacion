package Ejer4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				System.out.println(" Es par");
			}
			if (i < 5) {
				System.out.println("Es menor a 5");
			}
		}
	}

}
