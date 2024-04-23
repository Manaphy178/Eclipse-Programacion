package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double num1, num2,  area ; 
		System.out.println("Introduzca la base del triangulo: ");
		num1 = sn.nextDouble();
		System.out.println("Introduzca la altura del triangulo: ");
		num2 = sn.nextDouble();
		area = (num1 * num2) / 2;
		System.out.println("El area del triangulo es:" + area);
	}

}
