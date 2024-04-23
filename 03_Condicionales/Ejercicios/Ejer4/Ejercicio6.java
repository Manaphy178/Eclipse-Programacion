package Ejer4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double precio = 0;
		int num = 0;
		double res = 0;
		System.out.print("Dime el precio del producto: ");
		precio = sn.nextDouble();
		System.out.print("Dime el numero del producto: ");
		num = sn.nextInt();
		res = ((precio * 21 / 100) + precio) * num;
		System.out.println("El precio de la compra es: " + res);

	}

}
