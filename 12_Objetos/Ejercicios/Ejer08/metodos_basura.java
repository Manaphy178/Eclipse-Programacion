package Ejer08;

public class metodos_basura {
	/**
	 * M�todo que rellena el array de canciones con 12 canciones del f�ntastico
	 * grupo Indie Izal.
	 * 
	 * @param canciones (Array de objetos de la clase Cancion)
	 */
	public static void rellenarCanciones(Cancion[] canciones) {
		canciones[0] = new Cancion("Los Perros", 2.1);
		canciones[1] = new Cancion("La Salvacion", 3.9);
		canciones[2] = new Cancion("Que vida tan dura", 3);
		canciones[3] = new Cancion("Virtud y Castigo", 3);
		canciones[4] = new Cancion("Exoplaneta", 3.6);
		canciones[5] = new Cancion("Cariño", 3);
		canciones[6] = new Cancion("Antiaereo", 3);
		canciones[7] = new Cancion("Cowboys de la A3", 4.3);
		canciones[8] = new Cancion("Abajo", 1);
		canciones[9] = new Cancion("Sin Verguenza", 6);
		canciones[10] = new Cancion("El beso", 4);
		canciones[11] = new Cancion("Copiloto", 2);
	}

	public static void rellenarCanciones2(Cancion[] canciones) {
		canciones[0] = new Cancion("Aventuras en el Espacio", 2.5);
		canciones[1] = new Cancion("Sueños Perdidos", 3.2);
		canciones[2] = new Cancion("Ritmo del Corazón", 2.8);
		canciones[3] = new Cancion("Melodía del Ocaso", 4.1);
		canciones[4] = new Cancion("Universo Paralelo", 3.5);
		canciones[5] = new Cancion("Ecos del Pasado", 2.7);
		canciones[6] = new Cancion("Horizontes Infinitos", 3.8);
		canciones[7] = new Cancion("Viaje Interdimensional", 4.5);
		canciones[8] = new Cancion("Cariño", 1.5);
		canciones[9] = new Cancion("Rebelión en el Tiempo", 5.2);
		canciones[10] = new Cancion("Susurros Nocturnos", 3.6);
		canciones[11] = new Cancion("El Encuentro", 2.3);
	}

	public static void rellenarCanciones3(Cancion[] canciones) {
		canciones[0] = new Cancion("Attention", 3.2);
		canciones[1] = new Cancion("Slow Dancing in the Dark", 4.5);
		canciones[2] = new Cancion("Test Drive", 2.8);
		canciones[3] = new Cancion("Wanted U", 3.7);
		canciones[4] = new Cancion("Can't Get Over You", 5.1);
		canciones[5] = new Cancion("Yeah Right", 2.5);
		canciones[6] = new Cancion("Why Am I Still in LA", 4.0);
		canciones[7] = new Cancion("No Fun", 3.9);
		canciones[8] = new Cancion("Come Thru", 1.8);
		canciones[9] = new Cancion("R.I.P.", 6.2);
		canciones[10] = new Cancion("XNXX", 3.6);
		canciones[11] = new Cancion("I'll See You in 40", 2.9);
	}

	public static Disco[] rellenarDiscos(Cancion[][] canciones) {
		Disco[] disco = new Disco[canciones.length];
		for (int i = 0; i < disco.length; i++) {
			disco[i] = new Disco();
		}
		String[] titulos = { "Luces en el Horizonte", "Melodía de Cristal", "BALLADS 1" };
		int[] aniosPublicacion = { 2005, 2010, 2018 };
		int[] codigoDisco = new int[4];
		for (int i = 0; i < codigoDisco.length; i++) {
			int aleatorio = (int) (Math.random() * 1000000000);
			codigoDisco[i] = aleatorio;
		}
		String[] productoresMusicales = { "Luna Beat", "Sonic Pulse", "Joji" };
		for (int i = 0; i < disco.length; i++) {
			disco[i].setTitulo(titulos[i]);
			disco[i].setAnopublicacion(aniosPublicacion[i]);
			disco[i].setCoddisco(codigoDisco[i]);
			disco[i].setProductor(productoresMusicales[i]);
		}
		for (int i = 0; i < disco.length; i++) {
			disco[i].setCanciones(canciones[i]);
		}
		return disco;
	}

	public static Cancion[][] bidimensional(Cancion[] cancion1, Cancion[] cancion2, Cancion[] cancion3) {
		Cancion[][] canciones = new Cancion[3][cancion1.length];
		for (int j = 0; j < canciones[0].length; j++) {
			canciones[0][j] = cancion1[j];
		}
		for (int j = 0; j < canciones[0].length; j++) {
			canciones[1][j] = cancion2[j];
		}
		for (int j = 0; j < canciones[0].length; j++) {
			canciones[2][j] = cancion3[j];
		}
		return canciones;
	}

	public static int contadorCancionesLetra(Disco[] disco, String letra) {
		char letter = letra.trim().toLowerCase().charAt(0);
		int cont = 0;
		for (int i = 0; i < disco.length; i++) {
			for (int j = 0; j < disco[i].getCanciones().length; j++) {
				if (disco[i].getCanciones()[j].getTitulo().charAt(0) == letter) {
					cont++;
				}
			}
		}
		return cont;
	}

}
