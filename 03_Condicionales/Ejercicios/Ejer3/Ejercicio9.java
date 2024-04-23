package Ejer3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("Dime un numero: ");
		num = sn.nextInt();
		if (num >=100 && num <=200){
			System.out.print("El numero esta entre el 100 y el 200");
		}else{
			System.out.print("El numero no esta entre el 100 y el 200");
		}
	}

}
