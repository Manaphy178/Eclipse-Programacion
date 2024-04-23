package Tercero_Mates;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		double pot = 5;
		double resu1 = 0;
		double resu2 = 0;
		double resu3 = 0;
		double resu4 = 0;
		double todas = 0;
		System.out.print("Dime el primer número: ");
		num1 = sn.nextDouble();
		System.out.print("Dime el segundo número: ");
		num2 = sn.nextDouble();
		System.out.print("Dime el tercer número: ");
		num3 = sn.nextDouble();
		System.out.print("Dime el cuarto número: ");
		num4 = sn.nextDouble();
		resu1 = Math.pow(num1, pot);
		resu2 = Math.pow(num2, pot);
		resu3 = Math.pow(num3, pot);
		resu4 = Math.pow(num4, pot);
		System.out.println("Se ha elevado el número " + num1 + "^" + pot + "=" + resu1);
		System.out.println("Se ha elevado el número " + num2 + "^" + pot + "=" + resu2);
		System.out.println("Se ha elevado el número " + num3 + "^" + pot + "=" + resu3);
		System.out.println("Se ha elevado el número " + num4 + "^" + pot + "=" + resu4);
		todas = resu1 + resu2 + resu3 + resu4;
		System.out.println("La suma de los resultados es: " + todas);
	}

}
