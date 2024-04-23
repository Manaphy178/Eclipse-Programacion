package Ejer06;

import java.util.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Cuantos Jedis vas a querer meter");
		int veces = sn.nextInt();
		Jedi[] judios = new Jedi[veces];
		for (int i = 0; i < veces; i++) {
			Jedi jud = new Jedi();
			judios[i] = jud;
		}

		System.out.println("Cuantos Padawans vas a querer meter");
		veces = sn.nextInt();

		Padawan[] padawans = new Padawan[veces];
		for (int i = 0; i < veces; i++) {
			Padawan pad = new Padawan();
			padawans[i] = pad;
		}

		System.out.println("Quieres rellenar los Jedi automaticamente?");
		if (sc.nextLine().equalsIgnoreCase("si")) {
			metodos_basura.JediAuto(judios);
		} else {
			rellenarJedi(judios);
		}
		System.out.println("Quieres rellenar los Padawan automaticamente?");
		if (sc.nextLine().equalsIgnoreCase("si")) {
			metodos_basura.PadawanAuto(padawans);
		} else {
			rellenarPadawan(padawans);
		}
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
		System.out.println("18. Cuantos Jedi tienen mas fuerza a numero introducido.");
		System.out.println("19. Cual es el padawan con mas potencial.");
		System.out.println("20. Nombre de los 3 padawans con mas potencial.");
		System.out.println("21. Decir los Jedi con mas de 7 caracteres en su nombre.");
		System.out.println("22. Pedimos 3 nombres y vemos si existe en los padawans.");
		System.out.println("23. Introduce fuerzas y diremos si existe un padawan con esa fuerza.");
		System.out.println("24. Vamos a decir los Jedis que tienen una posicion prima.");
		System.out.println("25. Decir cuantos Jedis tienen una fuerza prima.");
		System.out.println("26. Salir.");
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
				for (int i = 0; i < arrayfuerzas.length; i++) {
					System.out.println(arrayfuerzas[i]);
				}
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
				for (int i = 0; i < esmirriados.length; i++) {
					System.out.println(esmirriados[i]);
				}
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
			case 18:
				System.out.println("Dime un numero para buscar cuantos jedi tienen mas fuerza");
				fuerza = sn.nextInt();
				int jedisPot = nJedisPot(judio, judio, judio, judio, fuerza);
				System.out.println(jedisPot);

			case 19:
				Padawan padPotente = padawanPotente(padawan, padawan, padawan);
				System.out.println(padPotente.toString());
				break;
			case 20:
				String[] tresPadsPot = trespadasPot(padawan, padawan, padawan);
				for (int i = 0; i < tresPadsPot.length; i++) {
					System.out.println(tresPadsPot[i]);
				}
				break;
			case 21:
				Jedi[] losSiete = los7Jedi(judio, judio, judio, judio);
				for (int i = 0; i < losSiete.length; i++) {
					System.out.println(losSiete[i].toString());
				}
				break;
			case 22:
				System.out.println("Dime un nombre");
				String nombre1 = sc.nextLine();
				System.out.println("Dime otro nombre");
				String nombre2 = sc.nextLine();
				System.out.println("Dime otro nombre");
				String nombre3 = sc.nextLine();
				if (existePadaArray(nombre1, nombre2, nombre3, padawan)) {
					System.out.println("Los nombres existen en el array");
				} else {
					System.out.println("No existen todos los nombres en el array");
				}

				break;
			case 23:
				System.out.println("Dime la fuerza1:");
				int fuerza1 = sn.nextInt();
				System.out.println("Dime la fuerza2:");
				int fuerza2 = sn.nextInt();
				System.out.println("Dime la fuerza3:");
				int fuerza3 = sn.nextInt();
				if (fuerzaIgualPada(fuerza1, fuerza2, fuerza3, padawan)) {
					System.out.println("Si hay un padawan con una de las fuerzas indicadas");
				} else {
					System.out.println("No hay ningun padawan con esa fuerza indicada");
				}
				break;
			case 24:
				System.out.println("Vamos a decir los jedis primos");
				jedisPrimoPos(judio, judio, judio);
				break;
			case 25:
				System.out.println("Vamos a decir cuantos Jedis tienen una fuerza prima");
				System.out.println(jedisFuerzaPrima(judio, judio, judio, judio) + " tienen una fuerza prima");
				break;
			case 26:
				bucle=false;
				break;
			default:
				System.out.println("Ha introducido un valor del menu que no es correcto, se finalizara el programa");
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
		int cont = metodos_basura.contFortacos(arr1, fuerza);
		cont += metodos_basura.contFortacos(arr2, fuerza);
		cont += metodos_basura.contFortacos(arr3, fuerza);
		cont += metodos_basura.contFortacos(arr4, fuerza);
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

	static int nJedisPot(Jedi[] arr1, Jedi[] arr2, Jedi[] arr3, Jedi[] arr4, int potencia) {
		int cont = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].getFuerza() >= potencia) {
				cont++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i].getFuerza() >= potencia) {
				cont++;
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i].getFuerza() >= potencia) {
				cont++;
			}
		}
		for (int i = 0; i < arr4.length; i++) {
			if (arr4[i].getFuerza() >= potencia) {
				cont++;
			}
		}
		return cont;
	}

	static Padawan padawanPotente(Padawan[] arr1, Padawan[] arr2, Padawan[] arr3) {
		Padawan[] todos = todosPadawanPotentes(arr1, arr2, arr3);
		Padawan potente = new Padawan();
		for (int i = 0; i < todos.length; i++) {
			for (int x = i + 1; x < todos.length - 1; x++) {
				if (todos[x].getFuerza() < todos[i].getFuerza()) {
					potente = todos[i];
					todos[i] = todos[x];
					todos[x] = potente;
				}
			}
		}
		potente = todos[0];
		return potente;
	}

	static Padawan[] todosPadawanPotentes(Padawan[] arr1, Padawan[] arr2, Padawan[] arr3) {
		Padawan[] todos = new Padawan[arr1.length + arr2.length + arr3.length];
		int cont = 0;
		for (int i = 0; i < arr1.length; i++) {
			todos[cont] = arr1[i];
			cont++;
		}
		for (int i = 0; i < arr2.length; i++) {
			todos[cont] = arr2[i];
			cont++;
		}
		for (int i = 0; i < arr3.length; i++) {
			todos[cont] = arr3[i];
			cont++;
		}
		return todos;
	}

	static String[] trespadasPot(Padawan[] arr1, Padawan[] arr2, Padawan[] arr3) {
		String[] tres = new String[3];
		metodos_basura.MayMenPad(arr1);
		metodos_basura.MayMenPad(arr2);
		metodos_basura.MayMenPad(arr3);
		tres[0] = arr1[0].getNombre();
		tres[1] = arr1[0].getNombre();
		tres[2] = arr1[0].getNombre();
		return tres;
	}

	static Jedi[] los7Jedi(Jedi[] arr1, Jedi[] arr2, Jedi[] arr3, Jedi[] arr4) {
		int cont = 0;
		cont += metodos_basura.ContJediName(arr1);
		cont += metodos_basura.ContJediName(arr2);
		cont += metodos_basura.ContJediName(arr3);
		cont += metodos_basura.ContJediName(arr4);
		Jedi[] siete = new Jedi[cont];
		cont = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].getNombre().length() >= 7) {
				siete[cont] = arr1[i];
				cont++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i].getNombre().length() >= 7) {
				siete[cont] = arr2[i];
				cont++;
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i].getNombre().length() >= 7) {
				siete[cont] = arr3[i];
				cont++;
			}
		}
		for (int i = 0; i < arr4.length; i++) {
			if (arr4[i].getNombre().length() >= 7) {
				siete[cont] = arr4[i];
				cont++;
			}
		}
		return siete;

	}

	static boolean existePadaArray(String nom1, String nom2, String nom3, Padawan[] pad) {
		boolean nombre1 = false;
		boolean nombre2 = false;
		boolean nombre3 = false;

		for (int i = 0; i < pad.length; i++) {
			if (pad[i].getNombre().equalsIgnoreCase(nom1)) {
				nombre1 = true;

			} else if (pad[i].getNombre().equalsIgnoreCase(nom2)) {
				nombre2 = true;

			} else if (pad[i].getNombre().equalsIgnoreCase(nom3)) {
				nombre3 = true;
			}
		}
		if (nombre1 && nombre2 && nombre3) {
			return true;
		} else {
			return false;
		}

	}

	static boolean fuerzaIgualPada(int fuerza1, int fuerza2, int fuerza3, Padawan[] pad) {
		for (int i = 0; i < pad.length; i++) {
			if (fuerza1 == pad[i].getFuerza()) {
				return true;
			}
			if (fuerza2 == pad[i].getFuerza()) {
				return true;
			}
			if (fuerza3 == pad[i].getFuerza()) {
				return true;
			}
		}
		return false;
	}

	static void jedisPrimoPos(Jedi[] jud1, Jedi[] jud2, Jedi[] jud3) {
		for (int i = 0; i < jud1.length; i++) {
			if (metodos_basura.prime(i)) {
				System.out.println(jud1[i].toString());
			}
		}
		for (int i = 0; i < jud2.length; i++) {
			if (metodos_basura.prime(i)) {
				System.out.println(jud2[i].toString());
			}
		}
		for (int i = 0; i < jud3.length; i++) {
			if (metodos_basura.prime(i)) {
				System.out.println(jud3[i].toString());
			}
		}
	}

	static int jedisFuerzaPrima(Jedi[] jud1, Jedi[] jud2, Jedi[] jud3, Jedi[] jud4) {
		int cont = 0;
		int index = 0;
		Jedi[][] todos = new Jedi[4][jud1.length];
		for (int i = 0; i < jud1.length; i++) {
			todos[index][i] = jud1[i];
		}
		index++;
		for (int i = 0; i < jud2.length; i++) {
			todos[index][i] = jud2[i];
		}
		index++;
		for (int i = 0; i < jud3.length; i++) {
			todos[index][i] = jud3[i];
		}
		index++;
		for (int i = 0; i < jud4.length; i++) {
			todos[index][i] = jud4[i];
		}
		for (int i = 0; i < todos.length; i++) {
			for (int j = 0; j < todos[i].length; j++) {
				if (metodos_basura.prime(todos[i][j].getFuerza())) {
					cont++;
				}
			}
		}
		return cont;
	}

}