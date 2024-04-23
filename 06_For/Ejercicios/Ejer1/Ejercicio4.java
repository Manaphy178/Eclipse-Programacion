package Ejer1;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int res = 0;
		System.out.print("Dime el numero de veces que quieres que se repita la palabra: ");
		num = sn.nextInt();
		res = num * 4;
		for (int i = 0; i < res; i++) {
			System.out.println("We Love Centro Nelson");
		}
	}

}
