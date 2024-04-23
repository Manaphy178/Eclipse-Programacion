package Ejemplos_While;

import java.util.Scanner;

public class EjerBucleWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

//		// Ejercicio1: Realiza un programa que solicite al usuario su edad. Si el usuario es mayor deberas mostrar en pantalla los numeros del 3 al 33, si es menor debes mostrar en pantalla su edad 20 veces
//
//			int edad1 = 0;
//			int cont1 = 0;
//			System.out.println("Dime tu edad");
//			edad1 = sn.nextInt();
//			if (edad1 >= 18) {
//				cont1 = 3;
//				while (cont1 < 34) {
//					System.out.println(cont1);
//					cont1++;
//				}
//			} else {
//				cont1 = 1;
//				while (cont1 <= 20) {
//					System.out.println(edad1);
//					cont1++;
//				}
//			}
//		// Final ejercicio1
//		
//		// Ejericicio2: Realiza un programa que muestre en pantalla los numeros pares entre el 20 y el 60 ambos incluidos
//		
//			int num2 = 20;
//			while (num2 <= 60) {
//				if (num2%2==0) {
//					System.out.println(num2);	
//				}
//				num2++;
//			}
//			
//		// Final ejercicio2
//
//		// Ejercicio3: Realiza un programa que solicite al usuario 10 nombres e indica cuantos de los nombres eran francisco
//
//			String nom = "";
//			int cont3 = 0;
//			int franes = 0;
//			while (cont3 !=10) {
//				System.out.print("Dime tu nombre: ");
//				nom = sc.nextLine();
//				if(nom.equalsIgnoreCase("Francisco") || nom.equalsIgnoreCase("fran") || nom.equalsIgnoreCase("paco") || nom.equalsIgnoreCase("Francia")) {
//					franes++;
//				}
//				cont3++;
//			}
//			System.out.println("Has dicho el nombre Francisco o sus motes " + franes + " veces");
//		
//		// FinalEjercicio3
//
//		// Ejericicio4: Realiza un programa que solicite al usuario 100 numeros y finalmente indique cual es la suma de todos esos numeros
//			int cont4= 0;
//			int num4 = 0;
//			int res= 0;
//			while (cont4 !=100) {
//				System.out.print("Dime un numero para añadir a la suma: ");
//				num4 = sn.nextInt();
//				if (cont4 >=1) {
//					res = res + num4;
//				}else {
//					res = num4;
//				}
//				cont4++;
//				
//			}
//			if (res!= 0) {
//				System.out.println("La suma final de todo es: " + res);
//			}else {
//				System.out.println("Enserio has puesto todo ceros?");
//			}
//		// FinalEjercicio4
//
//		// Ejercicio5: Realiza un programa que solicite a un alumno 10 notas y finalmente indique cual es la nota media del alumno y cuantos 10s ha sacado
//		
//			double notas = 0;
//			double media = 0;
//			int diez = 0;
//			int cont5 = 0;
//			while (cont5 !=10) {
//				System.out.println("Dime tus notas: ");
//				notas = sn.nextDouble();
//				if (notas >= 0 || notas <=10) {
//					if (notas == 10) {
//						diez++;
//					}
//					media = media + notas;
//					cont5++;
//				}else {
//					System.out.println("Las notas son del 0 al 10");
//				}
//				
//			}
//			System.out.println("Has sacado de media de notas un: " + (media/10));
//			if (diez != 0) {
//				System.out.println("Y encima has sacado " + diez + " dieces");
//			}
//			
//		// FinalEjercicio5
//		
//		// Ejercicio6: Realiza un programa que solicite a una persona el nº de hijos que tiene. despues deberas solicitar las edades de todos los hijos y mostrar en pantalla la edad media de sus hijos
//		
//			int hijos = 0;
//			int cont6 = 0;
//			int	numero = 1;
//			int edad6 =0;
//			double acu =0;
//			System.out.println("Cuantos hijos tienes: ");
//			hijos = sn.nextInt();
//			while (cont6!=hijos) {
//				System.out.println("Cuantos años tiene el " + numero + "º: ");
//				edad6 = sn.nextInt();
//				acu = acu + edad6;
//				numero++;
//				cont6++;
//			}
//			System.out.println("La media de edad de sus hijos es: " + (acu/hijos));
//			
//		// FinalEjercicio6


	}

}