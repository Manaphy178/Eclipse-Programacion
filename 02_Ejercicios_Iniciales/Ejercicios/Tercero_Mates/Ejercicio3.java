package Tercero_Mates;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double num1 = 0;
		double num2= 0;
		double num3 = 0;
		double resu = 0;
		System.out.print("Dime el primer número: ");
		num1 = sn.nextDouble();
		System.out.print("Dime el segundo número: ");
		num2 = sn.nextDouble();
		System.out.print("Dime el tercer número: ");
		num3 = sn.nextDouble();
		resu = num1 + num2 + num3;
		System.out.print("La suma de los tres números es esta "+ resu + ". Ahora calcularemos la raiz cuadrada");
		double raiz = Math.sqrt(resu);
		System.out.println("La raiz cuadrada de " + resu + " es " + raiz);
	}

}
