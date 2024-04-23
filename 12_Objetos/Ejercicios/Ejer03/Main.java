package Ejer03;

import java.util.*;

public class Main {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("En cuantos equipos ha jugador 1?");
		String equipos1[] = new String[sn.nextInt()];
		RellenarEquipos(equipos1);
		Jugador player1 = new Jugador("Lebron", "James", "Av,Miami", "Albacete", "Miami", 24, 2, 25, 1, 30, 11, 4, 23,
				17, equipos1);

		System.out.println("En cuantos equipos ha jugador 2?");
		String equipos2[] = new String[sn.nextInt()];
		RellenarEquipos(equipos2);
		Jugador player2 = new Jugador("Mario", "Sanchez Lorente", "Rue du Faubourg Saint-Honoré", "París", "São Paulo",
				22, 3, 22, 3, 50, 13, 3, 24, 15, equipos2);
		mejorEficiencia(player1, player2);
		System.out.println("Estadisticas de ambos jugadores:");
		System.out.println(player1.toString());
		System.out.println();
		System.out.println(player2.toString());

	}

	static void RellenarEquipos(String[] equipo) {
		for (int i = 0; i < equipo.length; i++) {
			System.out.println("Dime el equipo " + (i + 1) + " en el que ha pertenecido el jugador: ");
			equipo[i] = sc.nextLine();
		}

	}

	static void mejorEficiencia(Jugador jug1, Jugador jug2) {
		if (jug1.getEficiencia() > jug2.getEficiencia()) {
			System.out.println("El jugador " + jug1.getNombre() + " es mas eficiente");
		} else if (jug1.getEficiencia() < jug2.getEficiencia()) {
			System.out.println("El jugador " + jug2.getNombre() + " es mas eficiente");
		} else {
			System.out.println("Los dos jugadores son igual de eficientes");
		}
	}

}
