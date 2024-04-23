package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pri = "";
		String seg = "";
		String ter = "";
		String cua = "";
		String qui = "";
		System.out.println("Introduce tu primera tarjeta:");
		pri = sc.nextLine();
		System.out.println("Introduce tu segunda tarjeta:");
		seg = sc.nextLine();
		System.out.println("Introduce tu tercera tarjeta:");
		ter = sc.nextLine();
		System.out.println("Introduce tu cuarta tarjeta:");
		cua = sc.nextLine();
		System.out.println("Introduce tu quinta tarjeta:");
		qui = sc.nextLine();
		System.out.println("1º tarjeta: " + pri);
		System.out.println("2º tarjeta: " + seg);
		System.out.println("3º tarjeta: " + ter);
		System.out.println("4º tarjeta: " + cua);
		System.out.println("5º tarjeta: " + qui);
	}

}