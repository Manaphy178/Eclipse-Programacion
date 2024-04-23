package Ejer1;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		int edad = 0;
		int mayores = 0;
		int menores = 0;
		int jubilados = 0;


		for (int i = 0; i < 20; i++) {
			System.out.print("Dime la edad del usuario: ");
			edad = sn.nextInt();
			if (edad < 18) {
				menores++;
			}else if (edad >=18) {
				mayores++;
			}
			if (edad >= 65) {
				jubilados++;
			}
		}
		System.out.println("El numero de usuarios menores de edad es: "+ menores);
		System.out.println("El numero de usuarios mayores de edad es: " + mayores);
		System.out.println("El numero de usuarios jubilados es: " + jubilados);
	}

}
