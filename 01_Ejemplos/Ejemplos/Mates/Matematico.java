package Mates;
import java.util.Scanner;

public class Matematico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double angulo = 0;
		double resul = 0;
		System.out.print("Introduzca el valor del angulo: ");
		angulo = sn.nextDouble();
//		Este Math.sin es para calcular el seno de un angulo
		resul = Math.sin(angulo);
		System.out.println("El seno de " + angulo + " es: " + resul);
		
	}

}
