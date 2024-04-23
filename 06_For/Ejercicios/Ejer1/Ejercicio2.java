package Ejer1;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int min = 0;
		int max = 0;		
		System.out.print("Dime un numero: ");
		num1 = sn.nextInt();
		System.out.print("Dime otro numero: ");
		num2 = sn.nextInt();
		if (num1>num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}

}
