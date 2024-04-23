package Ejer06;

public class metodos_basura {

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

	static void JediAuto(Jedi[] jedi) {
		String[] nombres = { "Laura", "Íñigo", "Javier", "Elliot", "Miguel", "Raquel", "Leonardo", "Ignacio", "Rodrigo",
				"Raúl", "Kilian", "Gonzalo", "Pablo", "Carlos", "Zigor", "Tamás", "Lucía", "Pablo", "Picón", "Luis",
				"Prados", "Adonis", "Jairo", "Stefy", "Náyade", "Jorge", "Brais", "Álvaro", "Barbara", "David",
				"Patricia", "Alejandro", "Beatriz", "Carmen", "Diego", "Elena", "Fernando", "Gabriela", "Héctor",
				"Irene", "Juan", "Karen", "Luisa", "Manuel", "Natalia", "Óscar", "Paula", "Quintín", "Rocío", "Sergio",
				"Teresa", "Ulises", "Vanesa", "Walter", "Ximena", "Yolanda", "Zaida", "Facundo", "Gisela", "Hugo",
				"Iris", "Jonathan", "Kira", "Leandro", "Marina", "Néstor", "Olga", "Pedro", "Querubín", "Ramona",
				"Simón", "Tatiana", "Uriel", "Valeria", "Wenceslao", "Xenia", "Yago", "Zafiro", "Fabián", "Graciela",
				"Hugo", "Iris", "Jaime", "Kendra", "Lorenzo", "Marina", "Néstor", "Olga", "Pedro", "Querubín" };
		String[] planetas = { "Aldorion", "Nebuloria", "Quasar Prime", "Xylophos", "Galactis", "Luminara", "Zephyria",
				"Astrophia", "Chronos IV", "Nexarion" };
		String[] colores = { "verde", "azul", "amarillo", "purpura", "morado", "naranja", "rojo" };
		for (int i = 0; i < jedi.length; i++) {
			jedi[i].setNombre(nombreRandom(nombres));
			int edad = (int) (Math.random() * 1000) + 12;
			jedi[i].setEdad(edad);
			int fuerza = (int) (Math.random() * 10);
			jedi[i].setFuerza(fuerza);
			int pla = (int) (Math.random() * (planetas.length - 1));
			jedi[i].setPlaneta(planetas[pla]);
			int col = (int) (Math.random() * (colores.length - 1));
			jedi[i].setColor_laser(colores[col]);
		}
	}

	static void PadawanAuto(Padawan[] pad) {
		String[] nombres = { "Laura", "Íñigo", "Javier", "Elliot", "Miguel", "Raquel", "Leonardo", "Ignacio", "Rodrigo",
				"Raúl", "Kilian", "Gonzalo", "Pablo", "Carlos", "Zigor", "Tamás", "Lucía", "Pablo", "Picón", "Luis",
				"Prados", "Adonis", "Jairo", "Stefy", "Náyade", "Jorge", "Brais", "Álvaro", "Barbara", "David",
				"Patricia", "Alejandro", "Beatriz", "Carmen", "Diego", "Elena", "Fernando", "Gabriela", "Héctor",
				"Irene", "Juan", "Karen", "Luisa", "Manuel", "Natalia", "Óscar", "Paula", "Quintín", "Rocío", "Sergio",
				"Teresa", "Ulises", "Vanesa", "Walter", "Ximena", "Yolanda", "Zaida", "Facundo", "Gisela", "Hugo",
				"Iris", "Jonathan", "Kira", "Leandro", "Marina", "Néstor", "Olga", "Pedro", "Querubín", "Ramona",
				"Simón", "Tatiana", "Uriel", "Valeria", "Wenceslao", "Xenia", "Yago", "Zafiro", "Fabián", "Graciela",
				"Hugo", "Iris", "Jaime", "Kendra", "Lorenzo", "Marina", "Néstor", "Olga", "Pedro", "Querubín" };
		String[] planetas = { "Aldorion", "Nebuloria", "Quasar Prime", "Xylophos", "Galactis", "Luminara", "Zephyria",
				"Astrophia", "Chronos IV", "Nexarion" };
		for (int i = 0; i < pad.length; i++) {
			pad[i].setNombre(nombreRandom(nombres));
			int edad = (int) (Math.random() * 1000) + 12;
			pad[i].setEdad(edad);
			int fuerza = (int) (Math.random() * 10);
			pad[i].setFuerza(fuerza);
			int pot = (int) (Math.random() * 100) + 1;
			pad[i].setPotencial(pot);
			int pla = (int) (Math.random() * (planetas.length - 1));
			pad[i].setPlaneta(planetas[pla]);
		}
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

	static void MayMenPad(Padawan[] arr1) {
		Padawan mayor = new Padawan();
		for (int i = 0; i < arr1.length; i++) {
			for (int x = i + 1; x < arr1.length; x++) {
				if (arr1[x].getPotencial() > arr1[i].getPotencial()) {
					mayor = arr1[i];
					arr1[i] = arr1[x];
					arr1[x] = mayor;
				}
			}
		}
	}

	static int ContJediName(Jedi[] arr1) {
		int cont = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].getNombre().length() >= 7) {
				cont++;
			}
		}
		return cont;
	}

	static boolean prime(int input) {
		boolean prime = true;

		if (input < 2) {
			prime = false;
		} else {
			for (int j = 2; j <= Math.sqrt(input); j++) {
				if (input % j == 0) {
					prime = false;
					break;
				}
			}
		}

		return prime;
	}
}
