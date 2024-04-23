package Segundo_EntradaSalida;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double base = 0;
		double altura = 0;
		double resu = 0;
		System.out.print("Dime la base del rectangulo: ");
		base = sn.nextDouble();
		System.out.print("Dime la altura del rectangulo: ");
		altura = sn.nextDouble();
		resu = base * altura;
		System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es = " + resu);
	}

}
