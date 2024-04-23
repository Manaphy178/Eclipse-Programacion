package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double altura, radio,  area ; 
		
		System.out.println("Introduzca la altura del cilindro: ");
		altura = sn.nextDouble();
		System.out.println("Introduzca la radio del cilindro: ");
		radio = sn.nextDouble();
		area = 2 * Math.PI * radio * (radio + altura);
		System.out.println("El área del cilindro es: " + area);
	}

}
