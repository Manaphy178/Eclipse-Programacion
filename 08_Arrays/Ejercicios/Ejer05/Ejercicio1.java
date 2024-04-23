package Ejer05;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int opc = 0;
		String[] nombres = new String[5];
		double[] notaPro = new double[5];
		double[] notaBd = new double[5];
		double[] notaMov = new double[5];
		String nombre = "";
		String modulo = "";
		boolean mal = false;
		double maxMedia = Double.MIN_VALUE;
		double minMedia = Double.MAX_VALUE;
		double media = 0, mediaMov = 0, mediaPro = 0, mediaBd = 0;
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Dime el nombre del alumno");
			nombres[i] = sc.nextLine();
			double ran = Math.round(Math.random() * 10 * 10) / 10.0;
			notaPro[i] = ran;
			ran = Math.round(Math.random() * 10 * 10) / 10.0;
			notaBd[i] = ran;
			ran = Math.round(Math.random() * 10 * 10) / 10.0;
			notaMov[i] = ran;
		}
		do {
			System.out.println("\rMenu:");
			System.out.println("1. Mostrar notas de alumnos.");
			System.out.println("2. Modificar notas de alumnos.");
			System.out.println("3. Mostrar nombre del mejor alumno.");
			System.out.println("4. Mostrar nota media de un alumno.");
			System.out.println("5. Mostrar nota media de todos los alumnos.");
			System.out.println("6. Mostrar la nota media por asignaturas.");
			System.out.println("7. Mostrar peor alumno.");
			System.out.println("8. Salir.");
			System.out.println();
			System.out.println("Elige una opcion: ");
			opc = sn.nextInt();
			System.out.println();
			if (opc > 0 && opc < 9) {
				switch (opc) {
				case 1:
					System.out.println("Mostrando el listado de los alumnos:");
					for (int i = 0; i < nombres.length; i++) {
						System.out.println(nombres[i] + ": Programación; " + notaPro[i] + " - BD: " + notaBd[i]
								+ " - Móviles: " + notaMov[i]);
					}
					break;
				case 2:
					System.out.println("Dime el nombre del alumno");
					nombre = sc.nextLine();
					System.out.println("Dime el modulo que quieres modificar:");
					modulo = sc.nextLine();
					for (int i = 0; i < nombres.length; i++) {
						mal = false;
						if (nombre.equalsIgnoreCase(nombres[i]) && modulo.equalsIgnoreCase("BD")) {
							System.out.println("Dime la nueva nota para Base de datos");
							notaBd[i] = sn.nextDouble();
						} else if (nombre.equalsIgnoreCase(nombres[i]) && modulo.equalsIgnoreCase("programacion")
								|| nombre.equalsIgnoreCase(nombres[i]) && modulo.equalsIgnoreCase("programación")) {
							System.out.println("Dime la nueva nota para Programación");
							notaPro[i] = sn.nextDouble();
						} else if (nombre.equalsIgnoreCase(nombres[i]) && modulo.equalsIgnoreCase("moviles")
								|| nombre.equalsIgnoreCase(nombres[i]) && modulo.equalsIgnoreCase("móviles")) {
							System.out.println("Dime la nueva nota para Móviles");
							notaMov[i] = sn.nextDouble();
						} else {
							mal = true;
						}
					}
					if (mal == true) {
						System.out.println("Uno de los datos introducidos no es correcto");
					}
					break;
				case 3:
					System.out.println("Se va a calcular la nota media más alta");
					for (int i = 0; i < nombres.length; i++) {
						media = 0;
						media = (notaPro[i] + notaMov[i] + notaBd[i]) / 3;
						if (media > maxMedia) {
							nombre = nombres[i];
							maxMedia = Math.round(media * 10.0) / 10.0;
						}
					}
					System.out.println("El alumno con mejor nota es: " + nombre + " - " + maxMedia);
					break;
				case 4:
					System.out.println("Dime el nombre de un alumno: ");
					nombre = sc.nextLine();
					for (int i = 0; i < nombres.length; i++) {
						mal = false;
						if (nombre.equalsIgnoreCase(nombres[i])) {
							media = (notaPro[i] + notaMov[i] + notaBd[i]) / 3;
							media = Math.round(media * 10.0) / 10.0;
							System.out.println("La media del alumno " + nombres[i] + " es: " + media);
							break;
						} else {
							mal = true;
						}
					}
					if (mal == true) {
						System.out.println("El alumno que has introducido no existe");
					}
					break;
				case 5:
					System.out.println("Se mostrara la media de los alumnos:");
					for (int i = 0; i < nombres.length; i++) {
						media = (notaPro[i] + notaMov[i] + notaBd[i]) / 3;
						media = Math.round(media * 10.0) / 10.0;
						System.out.println(nombres[i] + ": " + media);
					}
					break;
				case 6:
					System.out.println("Se mostrara el listado de medias de cada clase:");
					for (int i = 0; i < nombres.length; i++) {
						mediaMov = mediaMov + notaMov[i];
						mediaBd = mediaBd + notaBd[i];
						mediaPro = mediaPro + notaPro[i];
					}

					System.out.println("Nota media de BD: " + (mediaBd / 5));
					System.out.println("Nota media de Programación: " + (mediaPro / 5));
					System.out.println("Nota media de Móviles: " + (mediaMov / 5));
					break;
				case 7:
					System.out.println("Se mostrara el alumno con la peor media:");
					for (int i = 0; i < nombres.length; i++) {
						media = (notaPro[i] + notaMov[i] + notaBd[i]) / 3;
						if (media < minMedia) {
							minMedia = Math.round(media * 10.0) / 10.0;
							nombre = nombres[i];
						}
					}
					System.out.println("La nota media del peor alumno es: " + nombre + " - " + minMedia);
					break;
				case 8:
					System.out.println("Hasta la proxima");
					break;
				}
			} else {
				System.out.println("Esa opcion no esta en el menu");
			}
		} while (opc != 8);
	}
}