package Tema1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bucle = true;
		do {
			int[] array1 = new int[20];
			boolean primo = true;
			int pri = 0;
			for (int i = 0; i < array1.length; i++) {
				int ran = (int) (1 + Math.random() * 20);
				array1[i] = ran;
			}
			for (int i = 0; i < array1.length; i++) {
				primo = true;
				for (int j = 2; j < array1.length; j++) {
					if (array1[i] % j == 0) {
						primo = false;
						break;
					}

				}
				if (primo && array1[i] != 1) {
					pri = array1[i];
				}
			}
		} while (bucle);

	}

}
