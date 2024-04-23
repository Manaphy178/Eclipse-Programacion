package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		double mensual, anual;
		int hijos, acargo;
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduzca su sueldo mensual:");
		mensual = sn.nextDouble();
		System.out.println("Cuantos hijos tienes:");
		hijos = sn.nextInt();
		System.out.println("Estas acargo de cuidar a algún familiar más:");
		acargo = sn.nextInt();
		
		System.out.println("Vamos a calcular tu sueldo anual");
		
		hijos = (hijos + 50) *12;
		acargo = (acargo + 100) *12;
		
		anual = mensual * 12 + hijos + acargo;
		System.out.println("Tu sueldo anual seria: " + anual);
	}

}
