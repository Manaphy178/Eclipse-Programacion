package Ejer4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int año = 0;
		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			System.out.println("Tu año es bisiesto");
		}else {
			System.out.println("Tu año no es bisiesto");
		}
	}

}
