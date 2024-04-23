package Ejer2;

import java.util.Scanner;

public class Prueba {
	// Codigo de leonardo
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);
		Scanner letra = new Scanner(System.in);
		 String nombre = " ";
		 
		 double sueldobase = 0;
		 int antiguedad = 0;
		 int edad = 0;
		 int hijos = 0;
		 
		 System.out.println("Introduce tu nonmbre y tus apellidos");
		 nombre = letra.nextLine();
		 
		 System.out.println("Introduce el sueldo base que cobras al mes");
		 sueldobase = numero.nextDouble();
		 
		//  double sueldoanual = sueldobase*12;
		// Esto deberia hacerse despues de hacer los aditivos del sueldo mensual
		 
		 System.out.println("Escribe los años de antiguedad de tu empresa");
		 antiguedad = numero.nextInt();
		 
		 int plusantiguedad = antiguedad/5;
		 
		 System.out.println("Escribe tu edad");
		 edad = numero.nextInt();
		 
		 System.out.println("Cuantos hijos tienes?");
		 hijos = numero.nextInt();
		 
		 double plus45 = 45*plusantiguedad;
		 double primercaso = 0; // mensual total con plus 45
		 double segundocaso = 0; // los 100 € trimestrales(400)
		 double tercercaso = 0; // Si no tiene hijos
		 double cuartocaso = 0; // Sueldo mensual con 10% mas
		 
		 if(edad>=50 && edad<=60) {
		  cuartocaso = (sueldobase*1.1); //mensual
		 }
		 if (plusantiguedad>=1) {
		  primercaso = (cuartocaso + plus45); //mensual
		 }
		 if(hijos>2) {
		  segundocaso = +400; // anual
		 }
		 else if(hijos<1) {
		  tercercaso = -50; // anual
		 }
		
		 
		 double sueldoanualtotal = (primercaso*12) + segundocaso + tercercaso;
		 double sueldomensualtotal =  primercaso;
		 
		 System.out.println("Hola " + nombre + " tu sueldo mensual es de " + sueldomensualtotal + ", mientras que tu sueldo anual es de " + sueldoanualtotal);
		 
		 double sueldoanualtotalirpf = (sueldoanualtotal*0.81);
		 double sueldomensualtotalirpf = ((sueldomensualtotal*0.81));
		 
		 System.out.println("Despues tu sueldo mensual con irpf es de " + sueldomensualtotalirpf + ", mientras que tu sueldo anual es de " + sueldoanualtotalirpf);
		 }

}
