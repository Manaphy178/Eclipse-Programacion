package Tercero_Mates;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double resu1 = 0;
		double resu2 = 0;
		double pi = Math.PI;
		System.out.print("Dime el primer número: ");
		num1 = sn.nextDouble();
		System.out.print("Dime el segundo número: ");
		num2 = sn.nextDouble();
		System.out.print("Dime el tercer número: ");
		num3 = sn.nextDouble();
		resu1 = num1 + num2 + num3; 
		System.out.print("La suma de los números es = " + resu1);
		resu2 = resu1 / pi;
		System.out.println("El resultado de la division es " + resu2);
	}

}
