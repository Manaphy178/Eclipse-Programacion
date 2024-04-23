package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int pri = 0;
		int seg = 0;
		int resultado = 0;
		System.out.println("Vamos a elevar el primer numero por el segundo");
		System.out.println("Primer numero: ");
		pri = sn.nextInt();
		System.out.println("Segundo numero: ");
		seg = sn.nextInt();
		resultado = (int) Math.pow(pri, seg);
		System.out.println("Resultado: " + resultado);
	}

}
