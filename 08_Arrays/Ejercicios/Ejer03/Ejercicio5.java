package Ejer03;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numero = 0;
		int[] num1 = new int[10];
		int cont = 0;
		
		for (int i = 0; i < num1.length; i++) {
			System.out.println("Dime un numero");
			numero = sn.nextInt();
			if (numero > 0 && numero <= 10) {
				num1[i] = numero;
			} else {
				System.out.println("Ese numero no esta entre el 1 al 10");
				i--;
			}
		}
		int []contador=new int [11];
		
		for(int i=0;i<num1.length;i++) {
			int actual=num1[i];
			contador[actual]++;
		}
		
		for (int i =1; i<=num1.length;i++){
			if (contador[i]>0) {
				System.out.print(i +": ");
				for (int x=0;x<contador[i];x++) {
					System.out.print("*");
				}
				System.out.println("");
			}

		}
			
	}

}
