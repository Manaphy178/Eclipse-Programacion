package Segundo_EntradaSalida;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int resu = 0;
		System.out.print("Dime un primer numero: ");
		num1 = sn.nextInt();
		System.out.print("Dime un segundo numero: ");
		num2 = sn.nextInt();
		System.out.print("Dime un tercer numero: ");
		num3 = sn.nextInt();
		resu = num1 + num2 + num3;
		System.out.println("La suma de " + num1 + " + " + num2 + " + " + num3 + " es " + resu);
	}

}
