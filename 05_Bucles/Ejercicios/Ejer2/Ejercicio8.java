package Ejer2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int num = 1;
		int cont = 0;
		int res = 1;
		while (cont < 10) {
			if (num % 2 != 0) {
				res = res * num;
				System.out.print(num + " ");
				num++;
				cont++;
			} else {
				num++;
			}

		}
		System.out.println("El resultado del producto de los numeros impares es: " + res);
	}

}
