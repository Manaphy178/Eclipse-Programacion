package Ejer3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int res1 = 0;
		int res2 = 0;
		int res3 = 0;
		int res4 = 0;
		System.out.print("Dime un numero: ");
		num1 = sn.nextInt();
		System.out.print("Dime otro numero: ");
		num2 = sn.nextInt();
		System.out.print("Dime otro numero: ");
		num3 = sn.nextInt();
		System.out.print("Dime otro numero: ");
		num4 = sn.nextInt();
		res1 = num1 % 2;
		res2 = num2 % 2;
		res3 = num3 % 2;
		res4 = num4 % 2;
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0){
			System.out.print("Todos los numeros son pares");
		}else if (res1 == 1 && res2 == 1 && res3 == 1 && res4 == 1){
			System.out.print("Todos los numeros son impares");
		}else{
			System.out.print("Algunos de los numeros son pares e impares");
		}
	}

}
