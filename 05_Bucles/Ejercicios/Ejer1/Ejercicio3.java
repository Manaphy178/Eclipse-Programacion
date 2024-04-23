package Ejer1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int num = 0;
		int opt = 100;

		while (opt <= 800) {
			num = opt % 5;
			if (num == 0) {
				System.out.println(opt);
			}
			opt++;
		}

	}

}
