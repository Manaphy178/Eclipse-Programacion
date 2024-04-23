package Ejer3;

import java.util.*;

public class ejercicio_Elliot {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String[][] notasAlumnos = new String[1][6];
		notasAlumnos = tablaDeNotas(notasAlumnos);
		int opt = 0;
		do {
			showMenu();
			System.out.print("\nChosen option: ");
			if (sn.hasNextInt()) {
				opt = sn.nextInt();
				menu(opt, notasAlumnos);
			} else {
				sn.next();
				System.out.println("\nInvalid input, try again\n");
			}
		} while (opt != 10);
	}

//fill array
	public static String[][] tablaDeNotas(String[][] input) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gimme the names\n ");
		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + " Student's name: ");
			input[i][0] = sc.nextLine();
			System.out.println();
		}
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i][0] + " Red's score: ");
			input[i][1] = sc.nextLine();
			System.out.print(input[i][0] + " Sistemas' score: ");
			input[i][2] = sc.nextLine();
			System.out.print(input[i][0] + " Moviles' score: ");
			input[i][3] = sc.nextLine();
			System.out.print(input[i][0] + " Progamacion's score: ");
			input[i][4] = sc.nextLine();
			System.out.print(input[i][0] + " FOL's score: ");
			input[i][5] = sc.nextLine();
			System.out.println();
		}
		return input;
	}

//show menu
	public static void showMenu() {
		System.out.println("\tMenu:");
		System.out.println("1:  Mostrar notas de un alumno");
		System.out.println("2:  Mostrar notas de  todos");
		System.out.println("3:  Modificar notas de un alumno");
		System.out.println("4:  Poner cero a todos");
		System.out.println("5:  Aprobado general de todos");
		System.out.println("6:  Mostrar en pantalla la media de una asignatura");
		System.out.println("7:  Mostrar el nombre del alumno con media más baja");
		System.out.println("8:  Mostrar el nombre del alumno con media más alta");
		System.out.println("9:  Mostrar el nombre del alumno con más nº de suspensos");
		System.out.println("10: Salir");
	}

//menu
	public static void menu(int opt, String[][] target) {
		switch (opt) {
		case 1:
			scoreToShow(target);
			break;
		case 2:
			printArray(target);
			break;
		case 3:
			modify(target);
			break;
		case 4:
			zeroAll(target);
			break;
		case 5:
			allPassed(target);
			break;
		case 6:
			meanSubject(target);
			break;
		case 7:
			lowestMean(target);
			break;
		case 8:
			highestMean(target);
			break;
		case 9:
			mostFails(target);
			break;
		case 10:
			System.out.println("\nC-ya");
			break;
		default:
			System.out.println("\nInvalid option\n");
		}
	}

//show specific alumn's scores
	public static void scoreToShow(String[][] input) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nWhose score u wanna check: ");
		String name = sc.nextLine();

		boolean found = false;
		for (int i = 0; i < input.length; i++) {
			if (input[i][0].equalsIgnoreCase(name)) {
				System.out.println("\n" + name + "'s scores are: " + input[i][1] + " for Red, " + input[i][2]
						+ " for Sistemas, " + input[i][3] + " for Moviles, " + input[i][4] + " for Programación, "
						+ input[i][5] + " for FOL.\n");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("\nNot found");
		}
	}

//print scores
	public static String[][] printArray(String[][] input) {
		System.out.println("\nNombres \tRedes \t\tSistemas \tMoviles \tProgramacion \tFOL");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i][0] + " \t\t" + input[i][1] + " \t\t" + input[i][2] + " \t\t" + input[i][3]
				+ " \t\t" + input[i][4] + " \t\t" + input[i][5]);
		}
		System.out.println();
		return input;
	}

//modify data
	public static void modify(String[][] input) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.print("\nWhose scores u want to mod: ");
		String name = sc.nextLine();
		int nameToChange = 0;
		int toChange = 0;
		boolean found = false;
		for (int i = 0; i < input.length; i++) {
			if (input[i][0].equalsIgnoreCase(name)) {
				found = true;
				nameToChange = i;
			}
		}
		if (found) {
			int opt = 0;
			do {
				System.out.println("\nOk, what do u wanna change?\n");
				System.out.println("1: Mod name");
				System.out.println("2: Mod Redes");
				System.out.println("3: Mod Sistemas");
				System.out.println("4: Mod Moviles");
				System.out.println("5: Mod Programacion");
				System.out.println("6: Mod FOL");
				System.out.println("7: Exit");
				System.out.println();
				System.out.print("Chosen option: ");
				if (sn.hasNextInt()) {
					opt = sn.nextInt();
					if (opt == 1) {
						toChange = 0;
					} else if (opt == 2) {
						toChange = 1;
					} else if (opt == 3) {
						toChange = 2;
					} else if (opt == 4) {
						toChange = 3;
					} else if (opt == 5) {
						toChange = 4;
					} else if (opt == 6) {
						toChange = 5;
					}
					System.out.println();
					switch (opt) {
					case 1:
						System.out.print("Type new name: ");
						input[nameToChange][toChange] = sc.nextLine();
						System.out.println("\nDone");
						break;
					case 2:
						System.out.print("Type new Redes' score: ");
						input[nameToChange][toChange] = sc.nextLine();
						System.out.println("\nDone");
						break;
					case 3:
						System.out.print("Type new Sistemas' score: ");
						input[nameToChange][toChange] = sc.nextLine();
						System.out.println("\nDone");
						break;
					case 4:
						System.out.print("Type new Moviles' score: ");
						input[nameToChange][toChange] = sc.nextLine();
						System.out.println("\nDone");
						break;
					case 5:
						System.out.print("Type new Programacion' score: ");
						input[nameToChange][toChange] = sc.nextLine();
						System.out.println("\nDone");
						break;
					case 6:
						System.out.print("Type new FOL' score: ");
						input[nameToChange][toChange] = sc.nextLine();
						System.out.println("\nDone");
						break;
					case 7:
						System.out.println("Done modifying\n");
						break;
					default:
						System.out.print("Invalid, try againg.");
					}
				}
			} while (opt != 7);
		}
		if (!found) {
			System.out.println("\nNot found.");
		}
	}

//0 everyone
	public static void zeroAll(String[][] input) {
		for (int i = 0; i < input.length; i++) {
			int scores = 1;
			while (scores < 6) {
				input[i][scores] = "0";
				scores++;
			}
		}
		System.out.println("\nDone. All scores to 0\n");
	}

//everyone passed
	public static void allPassed(String[][] input) {
		for (int i = 0; i < input.length; i++) {
			int scores = 1;
			while (scores < 6) {
				if (Integer.valueOf(input[i][scores]) < 5) {
					input[i][scores] = "5";
				}
				scores++;
			}
		}
		System.out.println("\nDone. Every score below 5 is now 5\n");
	}

//show mean score for a subject
	public static void meanSubject(String[][] input) {
		Scanner sc = new Scanner(System.in);
		double mean = 0;
		int subjectsPosi = 0;
		boolean found = false;
		System.out.println("\nWhich subject's mean u wanna see?");
		String ans = sc.nextLine();
		if (ans.equalsIgnoreCase("red")) {
			subjectsPosi = 1;
			found = true;
		} else if (ans.equalsIgnoreCase("sistemas")) {
			subjectsPosi = 2;
			found = true;
		} else if (ans.equalsIgnoreCase("moviles")) {
			subjectsPosi = 3;
			found = true;
		} else if (ans.equalsIgnoreCase("programacion")) {
			subjectsPosi = 4;
			found = true;
		} else if (ans.equalsIgnoreCase("fol")) {
			subjectsPosi = 5;
			found = true;
		} else {
			System.out.println("\nSubject not found");
			found = false;
		}
		System.out.println();
		if (found) {
			for (int i = 0; i < input.length; i++) {
				mean += Double.valueOf(input[i][subjectsPosi]);
			}
			System.out.println("The mean for the subject: " + ans + " is: " + (mean / input.length) + "\n");
		}
	}

//show student with lowest mean
	public static void lowestMean(String[][] input) {
		double min = Double.MAX_VALUE;
		int lowestAllumn = 0;
		for (int i = 0; i < input.length; i++) {
			double mean = 0;
			for (int j = 1; j < input[i].length; j++) {
				mean += Double.valueOf(input[i][j]);
			}
			mean /= (input[i].length - 1);
			if (mean < min) {
				min = mean;
				lowestAllumn = i;
			}
		}
		System.out.println(
				"The student with the lowest mean is " + input[lowestAllumn][0] + " with a mean of: " + min + "\n");
	}

//show student with highest mean
	public static void highestMean(String[][] input) {
		double max = Double.MIN_VALUE;
		int highestAllumn = 0;
		for (int i = 0; i < input.length; i++) {
			double mean = 0;
			for (int j = 1; j < input[i].length; j++) {
				mean += Double.valueOf(input[i][j]);
			}
			mean /= (input[i].length - 1);
			if (mean > max) {
				max = mean;
				highestAllumn = i;
			}
		}
		System.out.println(
				"The student with the highest mean is " + input[highestAllumn][0] + " with a mean of: " + max + "\n");
	}

//show student with the most fails
	public static void mostFails(String[][] input) {
		int max = Integer.MIN_VALUE;
		int mostFailsAllumn = 0;
		for (int i = 0; i < input.length; i++) {
			int fail = 0;
			for (int j = 1; j < input[i].length; j++) {
				if (Double.valueOf(input[i][j]) < 5) {
					fail++;
				}
			}
			if (fail > max) {
				max = fail;
				mostFailsAllumn = i;
			}
		}
		System.out.println(
				"The student with the most fails is " + input[mostFailsAllumn][0] + " with " + max + " fails.\n");
	}
}
