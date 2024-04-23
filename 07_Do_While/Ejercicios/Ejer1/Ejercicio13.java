package Ejer1;

import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int index = 0;
		int num = 0;
		int mult = 0;
		int veces = 0;
		do {
			for (num = 1; num < 6; num++) {
				if (mult != 10) {
					System.out.print("  " + num + "x");
					System.out.print(mult);
				}else {
					System.out.print(" " + num + "x");
					System.out.print(mult);
				}
	
				if (veces == 4) {
					mult++;
					veces = -1;
					System.out.println("");
				}
				veces++;
			}

			index++;
		} while (index < 11);

	}

}
