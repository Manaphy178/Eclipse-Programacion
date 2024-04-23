package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double pri, seg, ter, resultado; 
		System.out.println("Dame el primer numero: ");
		pri = sn.nextDouble();
		System.out.println("Dame el segundo numero: ");
		seg = sn.nextDouble();
		System.out.println("Dame el tercer numero: ");
		ter = sn.nextDouble();
		resultado =  Math.pow(pri, seg);
		resultado =  Math.pow(resultado, ter);
		System.out.println("El resultado es: "+ resultado);
	}

}
