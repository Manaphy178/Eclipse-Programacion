package Ejer2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 7;
		while (num < 100 ) {
			if (num%7 == 0) {
				System.out.println( num);
			}
			num++;
		}
	}

}
