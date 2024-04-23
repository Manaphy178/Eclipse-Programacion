package Tercero_Mates;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double num1 = 0;
		double num2= 0;
		double resu = 0;
		System.out.print("Dime un número: ");
		num1 = sn.nextDouble();
		System.out.print("Sobre que número quieres elevarlo: ");
		num2 = sn.nextDouble();
		resu =  Math.pow(num1, num2);
		System.out.print("El resultado del calculo exponencial de " + num1 + "^" + num2 + " es " + resu);
	}

}
