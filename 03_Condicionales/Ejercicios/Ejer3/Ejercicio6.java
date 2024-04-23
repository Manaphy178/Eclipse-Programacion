package Ejer3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int res= 0;
		System.out.print("Dime un numero: ");
		num = sn.nextInt();
		res = num%2;
		if (res == 0 || num >= 500){
			System.out.print("El numero es par o mayor que 500");
		}else{
			System.out.print("El numero es impar o menor que 500");
		}
	}

}
