package Ejer05;

import java.util.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jedi jedi1 = new Jedi();
		Jedi jedi2 = new Jedi();
		Jedi jedi3 = new Jedi();
		Jedi jedi4 = new Jedi();
		Jedi jedi5 = new Jedi();

//		Jedi[] judios = { jedi1, jedi2, jedi3, jedi4, jedi5 };
		Jedi[] judios = { jedi1 };

		Padawan padawan1 = new Padawan();
		Padawan padawan2 = new Padawan();
		Padawan padawan3 = new Padawan();
		Padawan padawan4 = new Padawan();
		Padawan padawan5 = new Padawan();

//		Padawan[] padawans = { padawan1, padawan2, padawan3, padawan4, padawan5 };
		Padawan[] padawans = { padawan1 };

		rellenarJedi(judios);
		rellenarPadawan(padawans);
		opciones(padawans, judios);
	}

	static void rellenarJedi(Jedi[] jedi) {
		for (int i = 0; i < jedi.length; i++) {
			System.out.println("Introduzca los datos del Jedi Nº " + i + 1);
			System.out.println("Dime el nombre:");
			jedi[i].setNombre(sc.nextLine().trim());
			System.out.println("Dime la edad:");
			jedi[i].setEdad(sn.nextInt());
			System.out.println("Dime la fuerza del Jedi, comprendido del 0 al 10:");
			int fuerza = sn.nextInt();
			boolean si = true;
			do {
				if (fuerza >= 0 && fuerza <= 10) {
					jedi[i].setFuerza(fuerza);
					si = false;
				} else {
					System.out.println("El numero no esta comprendido entre el 0 al 10");
					System.out.println("Introduzca de nuevo la fuerza");
					fuerza = sn.nextInt();
				}
			} while (si);
			System.out.println("De que planeta procede:");
			jedi[i].setPlaneta(sc.nextLine().trim());
			boolean color = true;
			String colores = "verde azul amarillo purpura morado naranja rojo";
			do {
				System.out.println("De que color es la espada del jedi:");
				String laser = sc.nextLine().toLowerCase().trim();
				if (colores.contains(laser)) {
					jedi[i].setColor_laser(laser);
					color = false;
				} else {
					System.out.println("Ese color no es correcto");
				}
			} while (color);

		}
	}

	static void rellenarPadawan(Padawan[] padawan) {
		for (int i = 0; i < padawan.length; i++) {
			System.out.println("Introduzca los datos del Padawan Nº " + i + 1);
			System.out.println("Dime el nombre:");
			padawan[i].setNombre(sc.nextLine().trim());
			System.out.println("Dime la edad:");
			padawan[i].setEdad(sn.nextInt());
			System.out.println("Dime la fuerza del Padawan, comprendido del 0 al 10:");
			int fuerza = sn.nextInt();
			boolean si = true;
			do {
				if (fuerza >= 0 && fuerza <= 10) {
					padawan[i].setFuerza(fuerza);
					si = false;
				} else {
					System.out.println("El numero no esta comprendido entre el 0 al 10");
					System.out.println("Introduzca de nuevo la fuerza");
					fuerza = sn.nextInt();
				}
			} while (si);
			System.out.println("Cuanto potencial tiene este padawan:");
			padawan[i].setPotencial(sn.nextInt());
			System.out.println("De que planeta procede:");
			padawan[i].setPlaneta(sc.nextLine().trim());
		}
	}

	static int menu() {
		System.out.println("\nMenu");
		System.out.println("1. Mostrar datos de todos los Jedis.");
		System.out.println("2. Mostrar datos de todos los Padawans.");
		System.out.println("3. Mostrar datos de 1 Jedi");
		System.out.println("4. Mostrar datos de 1 Padawan");
		System.out.println("5. Mostrar nombres de padawans con un potencial superior a numero pedido.");
		System.out.println("6. Mostrar los datos de los 2 Jedis que tengan más nivel de fuerza.");
		System.out.println("7. Mostrar los datos del Padawan con menor potencial.");
		System.out.println("8. Mostrar datos de Padawans que su nombre empiece o termine por una letra introducida.");
		System.out.println("9. Modificar los nombres de los Jedis y ponerlos en mayusculas.");
		System.out.println("10. Modifica los nombres de los padawans y ponerlos en minúsculas.");
		System.out.println("11. Mostrar todas las fuerzas de los Jedi.");
		System.out.println("12. Mostrar el nombre de los padawans entre edades comprendidas.");
		System.out.println("13. Aumentar fuerza con valor introducido de los padawans.");
		System.out.println("14. Devolver los 6 padawans con menor fuerza dependiendo de valor introducido.");
		System.out.println("15. Devolver los nombres de los Jedi y Padawans con mayor fuerza al valor introducido.");
		System.out.println("16. Degradar fuerza de Jedi con valor introducido.");
		System.out.println("17. Devolver array de padawans con una fuerza superior a la introducida.");
		System.out.println("18. Salir.");
		System.out.println("\nElige una opcion:");
		int opc = sn.nextInt();
		return opc;
	}

	static void opciones(Padawan[] padawan, Jedi[] judio) {
		boolean bucle = true;
		int fuerza, edad1, edad2, incremento, decremento;
		do {
			switch (menu()) {
			case 1:
				allJedi(judio);
				break;
			case 2:
				allPadawan(padawan);
				break;
			case 3:
				oneJedi(judio);
				break;
			case 4:
				onePadawan(padawan);
				break;
			case 5:
				potencialPad(padawan);
				break;
			case 6:
				twoJedisOneCup(judio);
				break;
			case 7:
				menorPotPad(padawan);
				break;
			case 8:
				letraPadawan(padawan);
				break;
			case 9:
				jediMay(judio);
				break;
			case 10:
				padawanMin(padawan);
				break;
			case 11:
				int[] arrayfuerzas = fuerzasJedi(judio);
				break;
			case 12:
				System.out.println("Dime la primera edad comprendida");
				edad1 = sn.nextInt();
				System.out.println("Dime la segunda edad comprendida");
				edad2 = sn.nextInt();
				System.out.println("Buscaremos al padawan con fuerza superior a la que introduzca");
				fuerza = sn.nextInt();
				nombresEdadFu(padawan, edad1, edad2, fuerza);
				break;
			case 13:
				System.out.println("Vamos a incrementar el potencal de los padawans por el numero introducido");
				incremento = sn.nextInt();
				aplicarIncremento(padawan, incremento);
				break;
			case 14:
				String[] esmirriados = esmirriados(padawan);
				break;
			case 15:
				System.out.println("Dime una fuerza");
				fuerza = sn.nextInt();
				String nombres = variosNombres(padawan, padawan, judio, fuerza);
				System.out.println(nombres);
				break;
			case 16:
				System.out.println("Dime un numero para quitarle fuerza a los Jedi");
				decremento = sn.nextInt();
				aplicarDecremento(judio, decremento);
				break;
			case 17:
				System.out.println("Dime la fuerza necesaria para pasar");
				fuerza = sn.nextInt();
				Padawan[] fortaco = padawanesFortacos(padawan, padawan, padawan, padawan, fuerza);
				for (int i = 0; i < fortaco.length; i++) {
					System.out.println(fortaco[i].toString());
				}
				break;
			default:
				bucle = false;
				break;
			}
		} while (bucle);
		System.out.println("Byeeeee");
	}

	static void allJedi(Jedi[] judio) {
		for (int i = 0; i < judio.length; i++) {
			System.out.println(judio[i].toString());
		}
	}

	static void allPadawan(Padawan[] padawan) {
		for (int i = 0; i < padawan.length; i++) {
			System.out.println(padawan[i].toString());

		}
	}

	static void oneJedi(Jedi[] judio) {
		System.out.println("Dime el nombre del Jedi que quieres:");
		String nombre = sc.nextLine().trim();
		int pos = -1;
		for (int i = 0; i < judio.length; i++) {
			if (judio[i].getNombre().equalsIgnoreCase(nombre)) {
				pos = i;
			}
		}
		if (pos >= 0) {
			System.out.println(judio[pos].toString());
		} else {
			System.out.println("No se ha encontrado el jedi pedido");
		}
	}

	static void onePadawan(Padawan[] padawan) {
		System.out.println("Dime el nombre del padawan que quieres:");
		String nombre = sc.nextLine().trim();
		int pos = -1;
		for (int i = 0; i < padawan.length; i++) {
			if (padawan[i].getNombre().equalsIgnoreCase(nombre)) {
				pos = i;
			}
		}
		if (pos >= 0) {
			System.out.println(padawan[pos].toString());
		} else {
			System.out.println("No se ha encontrado el padawan pedido");
		}
	}

	static void potencialPad(Padawan[] padawan) {
		System.out.println("Diremos los padawans que tengan mayor potencial con el nº introducido");
		System.out.println("Introduzca el potencial que quiera:");
		int pot = sn.nextInt();
		for (int i = 0; i < padawan.length; i++) {
			if (padawan[i].getPotencial() >= pot) {
				System.out.println("- " + padawan[i].getNombre());
			}
		}
	}

	static void twoJedisOneCup(Jedi[] judio) {
		int mayor = -1;
		int posMay = 0;
		int posSec = 0;
		for (int i = 0; i < judio.length; i++) {
			if (judio[i].getFuerza() > mayor) {
				posSec = posMay;
				posMay = i;
				mayor = judio[i].getFuerza();
			}
		}
		System.out.println(judio[posMay].toString());
		System.out.println(judio[posSec].toString());
	}

	static void menorPotPad(Padawan[] padawan) {
		int menor = Integer.MAX_VALUE;
		int pos = 0;
		for (int i = 0; i < padawan.length; i++) {
			if (padawan[i].getPotencial() < menor) {
				pos = i;
				menor = padawan[i].getPotencial();
			}
		}
		System.out.println(padawan[pos].toString());
	}

	static void letraPadawan(Padawan[] padawan) {
		System.out.println("Dime una letra para buscar al padawan");
		String cadena = sc.nextLine().trim().toLowerCase();
		char letra = cadena.charAt(0);
		for (int i = 0; i < padawan.length; i++) {
			if (padawan[i].getNombre().startsWith(String.valueOf(letra))
					|| padawan[i].getNombre().endsWith(String.valueOf(letra))) {
				System.out.println(padawan[i].toString());
			}
		}
	}

	static void jediMay(Jedi[] judio) {
		for (int i = 0; i < judio.length; i++) {
			judio[i].setNombre(judio[i].getNombre().toUpperCase());
		}
	}

	static void padawanMin(Padawan[] padawan) {
		for (int i = 0; i < padawan.length; i++) {
			padawan[i].setNombre(padawan[i].getNombre().toLowerCase());
		}
	}

	static int[] fuerzasJedi(Jedi[] judio) {
		int[] fuerzasJedi = new int[judio.length];
		for (int i = 0; i < judio.length; i++) {
			fuerzasJedi[i] = judio[i].getFuerza();
		}
		for (int i = 0; i < fuerzasJedi.length; i++) {
			System.out.println(fuerzasJedi[i]);
		}
		return fuerzasJedi;
	}

	static void nombresEdadFu(Padawan[] padawan, int edad1, int edad2, int fuerza) {
		for (int i = 0; i < padawan.length; i++) {
			if (padawan[i].getEdad() >= edad1 && padawan[i].getEdad() <= edad2) {
				if (padawan[i].getFuerza() >= fuerza) {
					System.out.println(padawan[i].getNombre());
				}
			}
		}
	}

	static void aplicarIncremento(Padawan[] padawans, int incr) {
		for (int i = 0; i < padawans.length; i++) {
			padawans[i].incrementoPotencial(incr);
			System.out.println(padawans[i].getNombre() + ": " + padawans[i].getFuerza());
		}
	}

	static String[] esmirriados(Padawan[] padawans) {
		Padawan pad = new Padawan();

		for (int i = 0; i < padawans.length; i++) {
			for (int j = i + 1; j < padawans.length - 1; j++) {
				if (padawans[j].getFuerza() < padawans[i].getFuerza()) {
					pad = padawans[j];
					padawans[j] = padawans[i];
					padawans[i] = pad;
				}
			}
		}
		String[] esmi = new String[padawans.length];
		for (int i = 0; i < esmi.length; i++) {
			esmi[i] = padawans[i].getNombre();
		}
		return esmi;
	}

	static String variosNombres(Padawan[] pad1, Padawan[] pad2, Jedi[] jud1, int fuerza) {
		String nombres = "";
		for (int i = 0; i < pad1.length; i++) {
			if (pad1[i].getFuerza() >= fuerza) {
				nombres += pad1[i].getNombre() + " ";
			}
			if (pad2[i].getFuerza() >= fuerza) {
				nombres += pad2[i].getNombre() + " ";
			}
			if (jud1[i].getFuerza() >= fuerza) {
				nombres += jud1[i].getNombre() + " ";
			}
		}
		return nombres;
	}

	static void aplicarDecremento(Jedi[] jud, int decre) {
		for (int i = 0; i < jud.length; i++) {
			jud[i].setFuerza(jud[i].getFuerza() - decre);
		}
	}

	static Padawan[] padawanesFortacos(Padawan[] arr1, Padawan[] arr2, Padawan[] arr3, Padawan[] arr4, int fuerza) {
		int cont = contFortacos(arr1, fuerza);
		cont += contFortacos(arr2, fuerza);
		cont += contFortacos(arr3, fuerza);
		cont += contFortacos(arr4, fuerza);
		Padawan[] fortacos = new Padawan[cont];
		cont = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].getFuerza() >= fuerza) {
				fortacos[cont] = arr1[i];
				cont++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i].getFuerza() >= fuerza) {
				fortacos[cont] = arr2[i];
				cont++;
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i].getFuerza() >= fuerza) {
				fortacos[cont] = arr3[i];
				cont++;
			}
		}
		for (int i = 0; i < arr4.length; i++) {
			if (arr4[i].getFuerza() >= fuerza) {
				fortacos[cont] = arr4[i];
				cont++;
			}
		}
		return fortacos;
	}

	static int contFortacos(Padawan[] arr, int fuerza) {
		int cont = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getFuerza() >= fuerza) {
				cont++;
			}
		}
		return cont;
	}
}