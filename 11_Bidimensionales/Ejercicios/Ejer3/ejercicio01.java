package Ejer3;

import java.text.*;
import java.util.*;

public class ejercicio01 {

	public static void main(String[] args) {
		int opc;
		String[][] notasAlumnos = new String[11][6];
		notasAlumnos = rellenar(notasAlumnos);
		do {
			opc = showMenu();
			menu(opc, notasAlumnos);
		} while (opc > 0 && opc < 11);
		System.out.println("Adios");
	}

	/* Rellenar array de notas con nombres y notas */
	static String[][] rellenar(String[][] array) {
		String[] nombres = { "Náyade", "Íñigo", "Javier", "Elliot", "Miguel", "Raquel", "Leonardo", "Ignacio",
				"Rodrigo", "Raúl", "Kilian", "Gonzalo", "Pablo", "Carlos", "Zigor", "Tamás", "Lucía", "Pablo", "Picón",
				"Luis", "Prados", "Adonis", "Jairo", "Stefy", "Laura", "Jorge", "Brais", "Álvaro", "Barbara", "David",
				"Patricia" };
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		boolean random = false;
		boolean ranNom = false;
		System.out.println("Quieres poner los nombres aleatorios? si/no");
		if (sc.nextLine().equalsIgnoreCase("si")) {
			ranNom = true;
		}
		System.out.println("Quieres poner las notas aleatorias? si/no");
		if (sc.nextLine().equalsIgnoreCase("si")) {
			random = true;
		}
		array[0][0] = "Nombre";
		array[0][1] = "Redes";
		array[0][2] = "Sistemas";
		array[0][3] = "Móviles";
		array[0][4] = "Programación";
		array[0][5] = "FOL";
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == 0) {
					if (ranNom) {
						array[i][j] = nombreRandom(nombres);
					} else {
						System.out.println("Dime el nombre del alumno:");
						array[i][j] = sc.nextLine().trim();
					}

				} else {
					if (random) {
						String nota = notaRandom();
						array[i][j] = nota;
					} else {
						System.out.println("Dime la nota de " + array[0][j] + ":");
						double nota = sn.nextDouble();
						while (nota < 0 || nota > 10) {
							System.out.println("La nota que has introducido es incorrecta. Introduzcala de nuevo");
							nota = sn.nextDouble();
						}
						DecimalFormat decimal = new DecimalFormat("#.##");
						String notas = decimal.format(nota);
						array[i][j] = notas;
					}
				}
			}
		}
		if (ranNom) {
			System.out.println("Los nombres que se han utilizado son: ");
			for (int i = 1; i < array.length; i++) {
				System.out.println(array[i][0]);
			}
		}
		return array;
	}

	/* Coger opcion y hacer cosas */
	static int menu(int opc, String[][] array) {
		switch (opc) {
		case 1:
			unaNota(array);
			break;
		case 2:
			todasNotas(array);
			break;
		case 3:
			modificar(array);
			break;
		case 4:
			Zero(array);
			break;
		case 5:
			Ten(array);
			break;
		case 6:
			medModulo(array);
			break;
		case 7:
			medBaja(array);
			break;
		case 8:
			medAlta(array);
			break;
		case 9:
			suspen(array);
			break;
		case 10:
			opc = 11;
			break;
		}
		return opc;
	}

	/* Opcion1 - Enseñar las notas de un alumno en especifico */
	static void unaNota(String[][] array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del alumno:");
		String alumno = sc.nextLine().trim();
		int pos = 0;
		boolean existe = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i][0].equalsIgnoreCase(alumno)) {
				existe = true;
				pos = i;
			}
		}
		if (existe) {
			System.out.println("Se mostrara las notas del alumno deseado\n");
			for (int i = 0; i < array[pos].length; i++) {
				if (i == 0) {
					System.out.print(array[pos][i] + ": ");
				} else if (i != array[pos].length - 1) {
					System.out.print(array[0][i] + ": " + array[pos][i] + " - ");
				}
				if (i == array[pos].length - 1) {
					System.out.print(array[0][i] + ": " + array[pos][i] + ".\n");
				}
			}
		} else {
			System.out.println("El alumno que ha introducido no es correcto o no existe");
		}
	}

	/* Opcion2 - Enseñar todas las notas en forma de listado */
	static void todasNotas(String[][] array) {
		array[0][2] = "Sistem.";
		array[0][4] = "Progra.";
		System.out.println("\nSe mostraran todas las notas de los alumnos en forma de listado\n");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0) {
					System.out.print(array[i][j] + "\t");
				} else {
					System.out.print(array[i][j] + "\t");
				}
			}
			System.out.println();
		}
		array[0][2] = "Sistemas";
		array[0][4] = "Programación";
	}

	/* Opcion3 - Modificar datos del usuario */
	static String[][] modificar(String[][] array) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduzca el nombre del alumno:");
		String alumno = sc.nextLine().trim();
		int pos = 0;
		boolean existe = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i][0].equalsIgnoreCase(alumno)) {
				existe = true;
				pos = i;
			}
		}
		if (existe) {
			System.out.println("Se ha encontrado al alumno");
			double nota;
			String notas;
			DecimalFormat decimal = new DecimalFormat("#.##");
			int opc = menuMod();
			switch (opc) {
			case 1:
				System.out.println("Cual es el nombre nuevo para este alumno.");
				array[pos][0] = sc.nextLine().trim();
				break;
			case 2:
				System.out.println("Cual es la nueva nota para Redes");
				nota = sn.nextDouble();
				while (nota < 0 || nota > 10) {
					System.out.println("La nota que has introducido es incorrecta. Introduzcala de nuevo");
					nota = sn.nextDouble();
				}
				notas = decimal.format(nota);
				array[pos][1] = notas;
				break;
			case 3:
				System.out.println("Cual es la nueva nota para Sistemas");
				nota = sn.nextDouble();
				while (nota < 0 || nota > 10) {
					System.out.println("La nota que has introducido es incorrecta. Introduzcala de nuevo");
					nota = sn.nextDouble();
				}
				notas = decimal.format(nota);
				array[pos][2] = notas;
				break;
			case 4:
				System.out.println("Cual es la nueva nota para Móviles");
				nota = sn.nextDouble();
				while (nota < 0 || nota > 10) {
					System.out.println("La nota que has introducido es incorrecta. Introduzcala de nuevo");
					nota = sn.nextDouble();
				}
				notas = decimal.format(nota);
				array[pos][3] = notas;
				break;
			case 5:
				System.out.println("Cual es la nueva nota para Programacón");
				nota = sn.nextDouble();
				while (nota < 0 || nota > 10) {
					System.out.println("La nota que has introducido es incorrecta. Introduzcala de nuevo");
					nota = sn.nextDouble();
				}
				notas = decimal.format(nota);
				array[pos][4] = notas;
				break;
			case 6:
				System.out.println("Cual es la nueva nota para FOL");
				nota = sn.nextDouble();
				while (nota < 0 || nota > 10) {
					System.out.println("La nota que has introducido es incorrecta. Introduzcala de nuevo");
					nota = sn.nextDouble();
				}
				notas = decimal.format(nota);
				array[pos][5] = notas;
				break;
			}
		} else {
			System.out.println("El alumno introducido no existe");
		}
		return array;
	}

	/* Opcion4 - Cero en todos los modulos a todos los alumnos */
	static String[][] Zero(String[][] array) {
		System.out.println("Se va a poner un 0 a todos los alumnos y mostraremos el listado");
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j++) {
				array[i][j] = "0";
			}
		}
		todasNotas(array);
		return array;
	}

	/* Opcion5 - Aprobado a todos en todos los modulos */
	static String[][] Ten(String[][] array) {
		System.out.println("Se va a poner un 10 a todos los alumnos y mostraremos el listado");
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j++) {
				array[i][j] = "10";
			}
		}
		todasNotas(array);
		return array;
	}

	/* Opcion6 - Mostrar media de asignatura pedida */
	static void medModulo(String[][] array) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("#.##");
		System.out.println("Dime el modulo que quieras ver la media total");
		String mod = sc.nextLine().trim();
		int pos = 0;
		boolean existe = false;
		for (int i = 1; i < array[0].length; i++) {
			if (array[0][i].equalsIgnoreCase(mod)) {
				pos = i;
				existe = true;
			}
		}
		if (existe) {
			double media = 0;
			for (int i = 1; i < array.length; i++) {
				media += Double.parseDouble(array[i][pos].replaceAll(",", "."));
			}
			media = media / (array.length - 1);
			String medias = decimal.format(media);
			System.out.println("La media de la asignatura de " + array[0][pos] + " es: " + medias);
		} else {
			System.out.println("Has introducido mal la asignatura");
		}
	}

	/* Opcion7 - Mostrar el alumno con media mas baja */
	static void medBaja(String[][] array) {
		double med_min = Double.MAX_VALUE;
		double med = 0;
		String nombre = "";
		System.out.println("Vamos a ver quien tiene la media mas baja");
		for (int i = 1; i < array.length; i++) {
			med = 0;
			for (int j = 1; j < array[i].length; j++) {
				med += Double.parseDouble(array[i][j].replaceAll(",", "."));
			}
			med = med / (array[0].length - 1);
			if (med < med_min) {
				nombre = array[i][0];
				med_min = med;
			}
		}
		System.out.println("El alumno con peor media del curso es: " + nombre);
	}

	/* Opcion8 - Mostrar alumno con mayor media */
	static void medAlta(String[][] array) {
		double med_max = Double.MIN_VALUE;
		double med = 0;
		String nombre = "";
		System.out.println("Vamos a ver quien tiene la media mas alta");
		for (int i = 1; i < array.length; i++) {
			med = 0;
			for (int j = 1; j < array[i].length; j++) {
				med += Double.parseDouble(array[i][j].replaceAll(",", "."));
			}
			med = med / (array[0].length - 1);
			if (med > med_max) {
				nombre = array[i][0];
				med_max = med;
			}
		}
		System.out.println("El alumno con mejor media del curso es: " + nombre);
	}

	/* Opcion9 - Mostrar alumno con mayor numero de suspensos */
	static void suspen(String[][] array) {
		String nombre = "";
		int mas = 0;
		for (int i = 1; i < array.length; i++) {
			int veces = 0;
			for (int j = 1; j < array[i].length; j++) {
				if (5 > Double.parseDouble(array[i][j].replaceAll(",", "."))) {
					veces++;
				}
			}
			if (mas < veces) {
				nombre = array[i][0];
				mas = veces;
			}
		}
		System.out.println("El alumno que mas a suspendido es: " + nombre + " con " + mas + " suspensos");
	}

	/* Para enseñar el menu de la opcion 3 */
	static int menuMod() {
		Scanner sn = new Scanner(System.in);
		int opc;
		System.out.println("1. Modificar nombre.");
		System.out.println("2. Modificar nota Redes.");
		System.out.println("3. Modificar nota Sistemas.");
		System.out.println("4. Modificar nota Móviles.");
		System.out.println("5. Modificar nota Programación.");
		System.out.println("6. Modificar nota FOL.");
		opc = sn.nextInt();
		return opc;
	}

	/* Metodo que me ahorra tiempo al pedir una nota */
	static String notaRandom() {
		double nota = (Math.random() * 10);
		DecimalFormat decimal = new DecimalFormat("#.##");
		String notas = decimal.format(nota);
		return notas;
	}

	/* Metodo para que te de un nombre aleatorio */
	static String nombreRandom(String[] nombres) {
		String nombre = "";
		int ran = 0;
		do {
			ran = (int) (Math.random() * nombres.length);
			nombre = nombres[ran];
		} while (nombres[ran].equalsIgnoreCase(" "));
		if (!nombres[ran].equalsIgnoreCase(" ")) {
			nombres[ran] = nombres[ran].replace(nombres[ran], " ");
		}
		return nombre;
	}

	/* Enseñar menu y elegir opcion */
	static int showMenu() {
		Scanner sn = new Scanner(System.in);
		System.out.println("\nMenu:");
		System.out.println("1. Mostrar notas de un alumno.");
		System.out.println("2. Mostrar notas de todos los alumnos.");
		System.out.println("3. Modificar datos de un alumno.");
		System.out.println("4. Poner un 0 a todos los alumnos en todos los módulos.");
		System.out.println("5. Aprobado general a todos los alumnos en todos los módulos.");
		System.out.println("6. Mostrar en pantalla la media de una asignatura pedida");
		System.out.println("7. Mostrar el nombre del alumno con media más baja.");
		System.out.println("8. Mostrar el nombre del alumno con media más alta.");
		System.out.println("9. Mostrar el nombre del alumno con más nº de suspensos.");
		System.out.println("10. Salir.");
		System.out.println("\nDime una opcion");
		int opc = sn.nextInt();
		return opc;
	}
}