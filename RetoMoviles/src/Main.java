import java.util.*;

public class Main {
	static Central centro = new Central();
	static ArrayList<Aparato> aparatos = new ArrayList<>();
	static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aparatos.add(new Aparato("Bombilla", 150, false));
		aparatos.add(new Aparato("Plancha", 2000, false));
		System.out.println("Se han creado los aparatos electricos");
		boolean bucle = true;
		double consumoTtl = 0;

		System.out.println(
				"\nEl consumo ACTUAL de la central es: " + centro.actualizarConsumoActual(aparatos) + " watios\n");
		bombilla();
		plancha();
		do {
			System.out.println(
					"\nEl consumo ACTUAL de la central es: " + centro.actualizarConsumoActual(aparatos) + " watios");
			switch (Menu()) {
			case 1:
				bombilla();
				break;
			case 2:
				plancha();
				break;
			case 3:
				System.out.println("El consumo TOTAL de de la central es: " + consumoTtl + " watios");
				break;
			case 4:
				bucle = false;
			default:
				System.out.println(bucle ? "Opcion introducida incorrecta" : "Adiooooos");
				break;
			}

			consumoTtl = centro.actualizarConsumoTotal(aparatos);
		} while (bucle);
	}

	static int Menu() {
		System.out.println("\nMENU");
		for (Aparato a : aparatos) {
			switch (a.getNombre()) {
			case "Bombilla":
				if (a.isEncendido()) {
					System.out.println("1. Apagar bombilla");
				} else {
					System.out.println("1. Encender bombilla");
				}
				break;
			case "Plancha":
				if (a.isEncendido()) {
					System.out.println("2. Apagar plancha");
				} else {
					System.out.println("2. Encender plancha");
				}
				break;
			}
		}
		System.out.println("3. Consultar consumo total");
		System.out.println("4. Salir");
		System.out.println("\nElige una opcion");
		return sn.nextInt();
	}

	static void bombilla() {
		for (Aparato a : aparatos) {
			if (a.getNombre().equalsIgnoreCase("Bombilla") && a.isEncendido()) {
				a.setEncendido(false);
				System.out.println("Se ha apagado la bombilla");
			} else if (a.getNombre().equalsIgnoreCase("Bombilla") && !a.isEncendido()) {
				a.setEncendido(true);
				System.out.println("Se ha encendido la bombilla");

			}
		}
	}

	static void plancha() {
		for (Aparato a : aparatos) {
			if (a.getNombre().equalsIgnoreCase("Plancha") && a.isEncendido()) {
				a.setEncendido(false);
				System.out.println("Se ha apagado la plancha");
			} else if (a.getNombre().equalsIgnoreCase("Plancha") && !a.isEncendido()) {
				a.setEncendido(true);
				System.out.println("Se ha encendido la plancha");
			}
		}
	}

}
