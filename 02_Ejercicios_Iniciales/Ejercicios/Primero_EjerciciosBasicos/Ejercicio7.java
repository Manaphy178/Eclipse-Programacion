package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int pri = 0;
		int seg = 0;
		int ter = 0;
		System.out.println("Vamos a multiplicar los numeros");
		System.out.println("Primer numero: ");
		pri = sn.nextInt();
		System.out.println("Segundo numero: ");
		seg = sn.nextInt();
		System.out.println("Tercer numero: ");
		ter = sn.nextInt();
		System.out.println("Resultado: " +(pri * seg * ter));
	}

}
