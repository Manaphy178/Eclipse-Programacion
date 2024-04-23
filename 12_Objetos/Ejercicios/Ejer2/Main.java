package Ejer2;

import java.util.*;


public class Main {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Jugador jugon = new Jugador("Mario", "Sanchez Lorente", "Rue du Faubourg Saint-Honoré", "París", "São Paulo",
				22, 3, 22, 3, 50, 13, 3, 24, 15);
		System.out.println("Dime el nuevo nombre que le quieres poner al jugador");
		jugon.setNombre(sc.nextLine());
		jugon.setPpp(0);

		System.out.println("Este es el jugador escogido");
		System.out.println("Jugador, " + jugon.getNombre() + " " + jugon.getApellidos() + " y ha marcado: "
				+ jugon.getPpp() + " puntos");
		System.out.println("Nombre y apellido en un solo String");
		String Nombre_apellido = nomApe(jugon);
		System.out.println(Nombre_apellido);

		System.out.println("La eficiencia de este jugador ha sido de: " + jugon.getEficiencia());
		System.out.println("El jugador ha hecho canasta?");
		if (sc.nextLine().equalsIgnoreCase("si")) {
			canaston();
		} else {
			System.out.println("Que pena");
		}

		System.out.println("Vamos a ver si el jugador es un crack");
		if (jugon.esCrack()) {
			System.out.println("El jugador es un crack");
		} else {
			System.out.println("El jugador es un puto pringao");
		}
	}

	static String nomApe(Jugador jugon) {
		String nomApe = jugon.getNombre() + " " + jugon.getApellidos();
		return nomApe;
	}

	static void canaston() {
		System.out.println("CANASTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	}
}
