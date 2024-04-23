package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double base, altura,  area ; 
		System.out.println("Introduzca la base del rectangulo: ");
		base = sn.nextDouble();
		System.out.println("Introduzca la altura del rectangulo: ");
		altura = sn.nextDouble();
		area = base * altura;
		System.out.println("El area del rectangulo es: " + area);
	}

}
