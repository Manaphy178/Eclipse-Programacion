package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int pri = 0;
		int seg = 0;
		int ter = 0;
		int resultado = 0;
		System.out.println("Dame tu primer numero:");
		pri = sn.nextInt();
		System.out.println("Dame tu segundo numero:");
		seg = sn.nextInt();
		System.out.println("Dame tu tercer numero:");
		ter = sn.nextInt();
		resultado = pri * (seg + ter);
		System.out.println("El resultado de la operacion es: " + resultado);
	}

}
