package Ejer02;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int[] numeros1 = new int[10];
		int[] numeros2 = new int[10];
		for(int i =0;i<10;i++) {
			System.out.println("Dime un numero");
			numeros1[i]=sn.nextInt();
			System.out.println("Dime el mismo numero");
			numeros2[i]=sn.nextInt();
		}
		int cont_pos=1; //Cuenta la posicion, para hacer una lista
		
		for (int i =0; i<10;i ++) {
			if (numeros1[i]==numeros2[i]) { // Evaluo si son iguales los valores
				System.out.println(cont_pos+"º. " + numeros1[i] +" y " + numeros2[i] + " son iguales");
				cont_pos++;
			}
			if (numeros1[i]!=numeros2[i]) { // Evaluo si no son iguales
				System.out.println(cont_pos+"º. " + numeros1[i] +" y " + numeros2[i] + " no son iguales");
				cont_pos++;
			}
		}

	}
}
