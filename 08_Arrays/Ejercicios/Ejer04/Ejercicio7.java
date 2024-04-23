package Ejer04;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String[] nombres = new String[5];
		double[] pro = new double[5];
		double[] mov = new double[5];
		double[] mar = new double[5];
		double[] bd = new double[5];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Dime tu nombre");
			nombres[i] = sc.nextLine();
			System.out.println("Dime tu nota de programacion");
			pro[i] = sn.nextDouble();
			System.out.println("Dime tu nota de marcas");
			mar[i] = sn.nextDouble();
			System.out.println("Dime tu nota de moviles");
			mov[i] = sn.nextDouble();
			System.out.println("Dime tu nota de base de datos");
			bd[i] = sn.nextDouble();
		}
		double medPro = 0;
		for (int i = 0; i < pro.length; i++) {
			medPro = medPro + pro[i];
		}
		medPro = medPro / pro.length;
		System.out.println("La nota media de todas las notas de programacion es: " + medPro);
		double medBd = 0;
		for (int i = 0; i < bd.length; i++) {
			medBd = medBd + bd[i];
		}
		medBd = medBd / bd.length;
		System.out.println("La nota media de todas las notas de base de datos es: " + medBd);
		String nombreMar = "";
		double notaMar = Double.MIN_VALUE;
		for (int i = 0; i < mar.length; i++) {
			if (notaMar < mar[i]) {
				notaMar = mar[i];
				nombreMar = nombres[i];
			}
		}
		System.out.println("El alumno con mejor nota de Marcas es: " + nombreMar + " - " + notaMar);
		String nombreMov = "";
		double notaMov = Double.MIN_VALUE;
		for (int i = 0; i < mov.length; i++) {
			if (notaMov < mov[i]) {
				notaMov = mov[i];
				nombreMov = nombres[i];
			}
		}
		System.out.println("El alumno con mejor nota de Moviles es: " + nombreMov + " - " + notaMov);
		String nombreMed = "";
		double maxMed = 0;
		double[] medias = new double[5];
		for (int i = 0; i < medias.length; i++) {
			medias[i] = (pro[i] + mar[i] + bd[i] + mov[i]) / 4;
			if (maxMed < medias[i]) {
				maxMed = medias[i];
				nombreMed = nombres[i];

			}
		}
		System.out.println("El alumno " + nombreMed + " es el alumno con mejor media: " + maxMed);
	}
}
