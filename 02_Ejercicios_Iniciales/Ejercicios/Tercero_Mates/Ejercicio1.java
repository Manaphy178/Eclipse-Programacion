package Tercero_Mates;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double ang1 = 0;
		double ang2 = 0;
		double ang3 = 0;
		double ang4 = 0;
		double resu1 = 0;
		double resu2 = 0;
		double resu3 = 0;
		double resu4 = 0;
		System.out.print("Dime el angulo del primer triangulo: ");
		ang1 = sn.nextDouble();
		System.out.print("Dime el angulo del segundo triangulo: ");
		ang2 = sn.nextDouble();
		System.out.print("Dime el angulo del tercer triangulo: ");
		ang3 = sn.nextDouble();
		System.out.print("Dime el angulo del cuarto triangulo: ");
		ang4 = sn.nextDouble();
		resu1 = Math.sin(ang1);
		resu2 = Math.sin(ang2);
		resu3 = Math.sin(ang3);
		resu4 = Math.sin(ang4);
		System.out.println("El seno de " + ang1 + " es: " + resu1);
		System.out.println("El seno de " + ang2 + " es: " + resu2);
		System.out.println("El seno de " + ang3 + " es: " + resu3);
		System.out.println("El seno de " + ang4 + " es: " + resu4);
	}

}
