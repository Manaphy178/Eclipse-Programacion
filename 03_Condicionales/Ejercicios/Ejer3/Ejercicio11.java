package Ejer3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextInt();
		if (num >=100 && Math.signum(num)==1 || num >=1000){
			System.out.print("ES mi numero");
		}else{
			System.out.print("Donde has metido mi numero?");
		}
	}

}
