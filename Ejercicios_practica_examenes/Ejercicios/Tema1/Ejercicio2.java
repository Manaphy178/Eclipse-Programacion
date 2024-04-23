package Tema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Dime longitud de array");
		int[] array1 = new int[sn.nextInt()];
		int contPar = 0;
		int contImpar = 0;
		for (int i = 0; i < array1.length; i++) {
			int ran = (int) (Math.random() * 100);
			array1[i] = ran;
			if (array1[i]%2==0) {
				contPar++;
			}else {
				contImpar++;
			}
		}
		boolean primo = true;


		int prim = 0;
		for (int i = 0; i < array1.length; i++) {
			primo = true;

			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}

			if (primo && array1[i] != 1) {
				prim++;
			}
		}

		int[] primos = new int[prim];
		int index = 0;
		double pares =1;
		double impares=1;
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo && array1[i] != 1) {
				primos[index] = array1[i];
				index++;
			}
			if (array1[i]%2==0) {
				pares = pares * array1[i];
			}else if (array1[i]%2!=0){
				impares = impares * array1[i];
			}
		}
		double paresR= Math.round(pares);
		double imparesR= Math.round(impares);
		System.out.println("Nº Pares: "+ contPar);
		System.out.println("Resultado mult Pares: "+ paresR);
		System.out.println("Nº Impares: "+ contImpar);
		System.out.println("Resultado mult Impares: "+ imparesR);
		System.out.print("Primos: ");
		for (int i = 0; i < primos.length; i++) {
			System.out.println(primos[i] + ", ");
		}
		

	}

}
