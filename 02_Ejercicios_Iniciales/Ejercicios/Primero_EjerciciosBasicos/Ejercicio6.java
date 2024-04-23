package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int pri = 0;
		int seg = 0;
		int ter = 0;
		int cua = 0;
		System.out.println("Vamos a restar el primer numero con los ultimos");
		System.out.println("Primer numero: ");
		pri = sn.nextInt();
		System.out.println("Segundo numero: ");
		seg = sn.nextInt();
		System.out.println("Tercer numero: ");
		ter = sn.nextInt();
		System.out.println("Cuarto numero: ");
		cua = sn.nextInt();
		System.out.println("Primer resultado: " + (seg - pri));
		System.out.println("Segundo resultado: " + (ter - pri));
		System.out.println("Tercer resultado: " + (cua - pri));
	}

}
