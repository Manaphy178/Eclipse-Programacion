package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mates, ciencia, tecno, lengua, historia, reli, ciencias, letras;
		Scanner sn = new Scanner(System.in);
		System.out.println("Dime las notas finales que has sacado en estas asignaturas,");
		System.out.println("Matemáticas: ");
		mates = sn.nextDouble();
		System.out.println("Ciencias: ");
		ciencia = sn.nextDouble();
		System.out.println("Tecnología: ");
		tecno = sn.nextDouble();
		System.out.println("Lengua: ");
		lengua = sn.nextDouble();
		System.out.println("Historia: ");
		historia = sn.nextDouble();
		System.out.println("Religión: ");
		reli = sn.nextDouble();
		ciencias = (mates + ciencia + tecno) / 3;
		letras = (lengua + historia + reli) / 3;
		System.out.println("La nota media que tiene en la rama de ciencias es: " +  ciencias);
		System.out.println("La nota media que tienes en la rama de letras es: " +  letras);
	}

}
