package Ejer07;

import java.util.Scanner;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaro un array de 10 objetos de tipo cancion.
		Cancion[] cancion1 = new Cancion[12];
		Cancion[] cancion2 = new Cancion[12];
		Cancion[] cancion3 = new Cancion[12];

		// Llamo al m�todo que rellena el array de canciones con canciones reales
		metodos_basura.rellenarCanciones(cancion1);
		metodos_basura.rellenarCanciones2(cancion2);
		metodos_basura.rellenarCanciones3(cancion3);
		Cancion[][] canciones = metodos_basura.bidimensional(cancion1, cancion2, cancion3);
		Disco[] discos = metodos_basura.rellenarDiscos(canciones);
		opciones(canciones, discos);
	}

	static void opciones(Cancion[][] canciones, Disco[] discos) {
		boolean bucle = true;
		do {
			// Llamo al m�todo que muestra el men� de nuestra aplicaci�n.

			switch (Main.mostrarMenu()) {
			case 1:
				mostrarTitulos(canciones);
				break;
			case 2:
				noMasDeCuatro(canciones);
				break;
			case 3:
				mayorLongitud(canciones);
				break;
			case 4:
				separadosCanciones(canciones);
				break;
			case 5:
				duracionCanciones(canciones);
				break;
			case 6:
				double[] duraciones = duracionesCanciones(canciones);
				for (int i = 0; i < duraciones.length; i++) {
					System.out.println(i + 1 + ": " + duraciones[i] + " minutos");
				}
				break;
			case 7:
				System.out.println("Dime un titulo de un disco");
				mostrarDatosCancion(discos, sc.nextLine().toLowerCase());
				break;
			case 8:
				System.out.println("Dime el titulo de una cancion para mostrar el disco");
				encontrarCancionDisco(discos, sc.nextLine());
				break;
			case 9:
				System.out.println("Dime una letra para buscar uan canciones que empiece por esta");
				String[] titulos = mostrarCancionesLetra(discos, sc.nextLine());
				for (int i = 0; i < titulos.length; i++) {
					System.out.println(titulos[i]);
				}
				break;
			case 10:
				Disco disk = mostrarDiscoDuracion(discos);
				System.out.println("El disco con mas duracion es:");
				System.out.println(disk.toString());
				break;
			case 11:
				System.out.println("Dime un titulo de una cancion");
				int veces = vecesCancionDisc(discos, sc.nextLine());
				if (veces > 1) {
					System.out.println("La cancion introducida se repite " + veces + " veces en discos diferentes");
				} else if (veces == 1) {
					System.out.println("La cancion solo se repite en un disco");
				}
				break;
			case 12:
				duracionCancionesDiscLetra(discos);
				break;
			case 13:

				break;
			case 14:

				break;
			case 15:

				break;
			case 16:

				break;
			case 17:

				break;
			case 18:

				break;
			case 19:

				break;
			case 20:

				break;
			case 21:

				break;
			case 22:
				bucle = false;
				break;
			default:
				System.out.println("Ha introducido un valor no valido");
				break;
			}
		} while (bucle);
		System.out.println("Adioooos");
	}

	/**
	 * M�todo que muestra en pantalla el men� de opciones del ejercicio en el que
	 * est�s.
	 */
	public static int mostrarMenu() {
		System.out.println("\nMenu:");
		System.out.println("1. Mostrar los titulos de las canciones enumerados");
		System.out.println(
				"2. Mostrar todos los títulos de las canciones que hay en un array de canciones pero solo de las\r\n"
						+ "canciones que su duración no exceda de 4 minutos.");
		System.out.println(
				"3. Mostrar la duración de la canción con mayor longitud en el título que hay en un array de\r\n"
						+ "canciones, y puede que necesite mosrtar algún atributo más de esa canción.");
		System.out.println("4. Mostrar todos títulos de las canciones de un array de canciones separados por comas.");
		System.out.println("5. Mostrar la duración de la suma de todas las canciones de un array de canciones.");
		System.out.println(
				"6. Mostrar todas las duraciones de todas las canciones de un array de canciones. (El método\r\n"
						+ "devolverá un array de duraciones).");
		System.out.println(
				"7. Mostrar los datos de las canciones de un disco que quiera el usuario de un array de discos, el\r\n"
						+ "usuario dará el título del disco. Los datos de las canciones se mostrarán de la siguiente manera:\r\n"
						+ "Titulo Cancion 1: Los Perros - Duración: 1,4\r\n"
						+ "Titulo Cancion 2: Que vida tan dura - Duración: 2,4");
		System.out.println(
				"8. Momento mostrar el título del disco donde se encuentre un título de una canción pedida al\r\n"
						+ "usuario, de un array de discos.");
		System.out.println(
				"9. Mostrar todos los títulos de los discos que empiezan por una letra pedida al usuario, de un array\r\n"
						+ "de discos.(El método devolverá un array con los títulos de los discos).");
		System.out.println(
				"10. Mostrar los datos del disco con mayor duración de un array de discos.(El método devolverá el\r\n"
						+ "disco con mayor duración).");
		System.out.println(
				"11. Mostrar en pantalla el nº de veces que aparece una misma canción en varios discos. El título de\r\n"
						+ "la canción debes pedírsela al usuario.");
		System.out.println(
				"12. Mostrar la duración de todas las canciones de los discos de un array de discos, pero solo de los\r\n"
						+ "discos que su título empiece por la letra a o por la e.");
		System.out.println("13. Pedir al usuario un titulo de disco y vaciar todo su array de canciones.");
		System.out.println(
				"14. Deberás crear una clase DiscoRecopilatorio, esta clase tendrá los siguientes atributos: (Titulo,\r\n"
						+ "código y un array de discos.");
		System.out.println(
				"15. Mostrar el título de la primera y última canción de un disco recopilatorio de la siguiente manera: Tilulo1: jdshfjdshfjhdsf – Título2: dsjhgfjhsdgfjhds");
		System.out.println(
				"16. Mostrar los datos del disco recopilatorio que tenga mayor duración de un array de discos\r\n"
						+ "recopilatorios.");
		System.out.println(
				"17. Mostrar los datos del disco recopilatorio que tenga menor duración, de un array de discos\r\n"
						+ "recopilatorios.");
		System.out.println(
				"18. Mostrar el Título de los 2 discos recopilatorios con mayor duración de un array de discos\r\n"
						+ "recopilatorios.");
		System.out.println(
				"19. Mostrar el Título de los 2 discos recopilatorios con menor duración de un array de discos\r\n"
						+ "recopilatorios.");
		System.out.println(
				"20. Mostrar los datos de los discos recopilatorios que tengan discos producidos por un productor\r\n"
						+ "pedido al usuario.");
		System.out.println(
				"21. Mostrar los datos de los discos recopilatorios que tengan discos publicados antes de un año\r\n"
						+ "pedido al usuario.");
		System.out.println("22. Salir");
		System.out.println("\nElija una opcion:");
		return sn.nextInt();
	}

//	Mostrar todos los titulos enumerados
	static void mostrarTitulos(Cancion[][] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			for (int j = 0; j < canciones[0].length; j++) {
				System.out.println((i + 1) + ": " + canciones[i][j].getTitulo());
			}

		}
	}

//	Mostrar el titulo de las canciones que no dure mas de 4 min
	static void noMasDeCuatro(Cancion[][] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			for (int j = 0; j < canciones.length; j++) {
				if (canciones[i][j].getDuracion() <= 4) {
					System.out.println(canciones[i][j].getTitulo());
				}
			}

		}
	}

//	Mostrar furacion de la cancion con mayor longitud
	static void mayorLongitud(Cancion[][] canciones) {
		int pos = 0;
		double duracion = 0;
		for (int i = 0; i < canciones.length; i++) {
			for (int j = 0; j < canciones[i].length; j++) {
				if (canciones[i][j].getDuracion() >= duracion) {
					pos = i;
					duracion = canciones[i][j].getDuracion();
				}
			}
		}
		System.out.println(canciones[pos].toString());
	}

//	Mostrar el titulo de canciones separados por comas
	static void separadosCanciones(Cancion[][] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			for (int j = 0; j < canciones[i].length; j++) {
				if (j == canciones.length - 1) {
					System.out.print(canciones[i][j].getTitulo());
				} else {
					System.out.print(canciones[i][j].getTitulo() + ", ");
				}
			}

		}
	}

//	Mostrar la suma de la duracion de todas las canciones
	static void duracionCanciones(Cancion[][] canciones) {
		double dur = 0;
		for (int i = 0; i < canciones.length; i++) {
			for (int j = 0; j < canciones[i].length; j++) {
				dur += canciones[i][j].getDuracion();
			}

		}
		System.out.println(dur + " minutos son todas es la duracion de todas las canciones");
	}

//	Devolver un array de las duraciones de las canciones
	static double[] duracionesCanciones(Cancion[][] canciones) {
		double[] duraciones = new double[canciones.length * canciones[0].length];
		int index = 0;
		for (int i = 0; i < canciones.length; i++) {
			for (int j = 0; j < canciones[0].length; j++) {
				duraciones[index] = canciones[i][j].getDuracion();
				index++;
			}

		}
		return duraciones;
	}

//	Mostrar los datos de las canciones en un formato especifico
	static void mostrarDatosCancion(Disco[] disco, String input) {
		boolean existe = false;
		int pos = 0;
		for (int i = 0; i < disco.length; i++) {
			if (disco[i].getTitulo().toLowerCase().contains(input.toLowerCase())) {
				existe = true;
				pos = i;
			}
		}
		if (existe) {
			for (int i = 0; i < disco[pos].getCanciones().length; i++) {
				System.out.println(
						disco[pos].getTitulo() + " Cancion " + (i + 1) + ": " + disco[pos].getCanciones()[i] + "\n");
			}
		} else {
			System.out.println("El disco introducido no existe");
		}
	}

//	Mostrar titulo de disco donde se encuentre una cancion
	static void encontrarCancionDisco(Disco[] disco, String input) {
		for (int i = 0; i < disco.length; i++) {
			for (int j = 0; j < disco[i].getCanciones().length; j++) {
				if (disco[i].getCanciones()[j].getTitulo().toLowerCase().contains(input)) {
					System.out.println(disco[i].getTitulo());
				}
			}
		}
	}

//	Mostrar todos los titulos de un disco que empiece por una letra pedida
	static String[] mostrarCancionesLetra(Disco[] disco, String input) {
		String[] titulos = new String[metodos_basura.contadorCancionesLetra(disco, input)];
		char letra = input.trim().toLowerCase().charAt(0);
		int cont = 0;
		for (int i = 0; i < disco.length; i++) {
			for (int j = 0; j < disco[i].getCanciones().length; j++) {
				if (disco[i].getCanciones()[j].getTitulo().charAt(0) == letra) {
					titulos[cont] = disco[i].getCanciones()[j].getTitulo();
					cont++;
				}

			}
		}
		return titulos;
	}

//	Mostrar los datos del disco con mayor duracion
	static Disco mostrarDiscoDuracion(Disco[] disco) {
		double dura = 0;
		int pos = 0;
		for (int i = 0; i < disco.length; i++) {
			if (dura < disco[i].DuracionTotal()) {
				pos = i;
				dura = disco[i].DuracionTotal();
			}
		}
		return disco[pos];

	}

//	Mostrar nº de veces que aparece la misma cancion en varios discos
	static int vecesCancionDisc(Disco[] disco, String input) {
		int cont = 0;
		for (int i = 0; i < disco.length; i++) {
			for (int j = 0; j < disco[i].getCanciones().length; j++) {
				if (disco[i].getCanciones()[j].getTitulo().equalsIgnoreCase(input)) {
					cont++;
					break;
				}
			}
		}
		return cont;
	}

//	Mostrar la duracion de todas las canciones pero de discos con titulo que empiece por a o por e
	static void duracionCancionesDiscLetra(Disco[] disco) {
		for (int i = 0; i < disco.length; i++) {
			if (disco[i].getTitulo().toLowerCase().charAt(0) == 'a'
					|| disco[i].getTitulo().toLowerCase().charAt(0) == 'e') {
				for (int j = 0; j < disco[i].getCanciones().length; j++) {
					System.out.println(disco[i].getCanciones()[j].getTitulo() + " - "
							+ disco[i].getCanciones()[j].getDuracion() + " min");
				}
			}
		}
	}
}
