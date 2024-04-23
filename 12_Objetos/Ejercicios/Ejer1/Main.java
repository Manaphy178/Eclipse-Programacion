package Ejer1;

import java.util.*;

public class Main {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		opciones();
	}

	static int menu() {
		System.out.println("Menu");
		System.out.println("1.Fruto Seco");
		System.out.println("2.MVP Jornada");
		System.out.println("3.Asignaturas");
		System.out.println("4.Zapato");
		System.out.println("5.Arcoiris");
		System.out.println("6.Estrella fugaz");
		System.out.println("7.Flatulencia");
		System.out.println("8.Salir");
		System.out.println("\rElige una opcion");
		return sn.nextInt();
	}

	static void opciones() {
		int opc = 0;
		do {
			opc = menu();
			switch (opc) {
			case 1:
				frutoSeco();
				break;
			case 2:
				mvp();
				break;
			case 3:
				asignatura();
				break;
			case 4:
				sapato();
				break;
			case 5:
				System.out.println("Pedazo de maricon");
				arcoiris();
				break;
			case 6:
				estrella();
				break;
			case 7:
				flatulencia();
				break;
			case 8:
				break;
			}

		} while (opc > 0 && opc < 8);
		System.out.println("Bye bye");
	}

	static void frutoSeco() {
		fruto_seco fruto = new fruto_seco();
		System.out.println("Como se llama el fruto seco");
		fruto.setNombre(sc.nextLine().trim());
		System.out.println("Cuantas calorias tiene el fruto seco?");
		fruto.setCal(sn.nextInt());
		System.out.println("Cuanto % de grasas tiene?");
		fruto.setGrasa(sn.nextInt());
		System.out.println("Cual es el precio del fruto?");
		fruto.setPrecio(sn.nextDouble());
		System.out.println("Cual es el color del fruto?");
		fruto.setColor(sc.nextLine());
		System.out.println("El fruto es dulce? (SI/NO)");
		if (sc.nextLine().equalsIgnoreCase("si")) {
			fruto.setDulce(true);
		} else {
			fruto.setDulce(false);
		}
		fruto.imprimirFrutos();

	}

	static void mvp() {
		System.out.println("Vamos a guardar los datos del jugador MVP");
		MVP jugador = new MVP();
		System.out.println("Como se llama el jugador: ");
		jugador.setNombre(sc.next());
		System.out.println("Nº de dorsal que tiene: ");
		jugador.setDorsal(sn.nextInt());
		System.out.println("A que equipo pertenece: ");
		jugador.setEquipo(sc.next());
		System.out.println("Nº de goles: ");
		jugador.setGoles(sn.nextInt());
		System.out.println("Nº de asistencias: ");
		jugador.setAsistencias(sn.nextInt());
		System.out.println("Nº de faltas: ");
		jugador.setFaltas(sn.nextInt());
		System.out.println("Nº de pases clave: ");
		jugador.setPases(sn.nextInt());
		System.out.println("Nº de jornada: ");
		jugador.setJornada(sn.nextInt());
		System.out.println("Nº de temporada: ");
		jugador.setTemporada(sn.nextInt());
		jugador.imprimirMVP();
	}

	static void asignatura() {
		String[] dni = new String[10];
		System.out.println("Vamos a registrar los datos de la asignatura");

		Asignatura asig = new Asignatura();
		System.out.println("Como se llama la asignatura");
		asig.setDenominacion(sc.nextLine());
		System.out.println("Como se llama el profesor: ");
		asig.setNombre_profe(sc.nextLine());
		System.out.println("Cual es la dificultad: (0-10) ");
		asig.setDificultad(sn.nextInt());
		System.out.println("A que ciclo pertenece:");
		asig.setCiclo(sn.nextInt());
		for (int i = 0; i < dni.length; i++) {
			System.out.println("Dni del alumno " + (i + 1) + ": ");
			dni[i] = sc.nextLine();

		}
		asig.setDnis(dni);
		asig.imprimirAsignatura();
	}

	static void sapato() {
		Zapato zapato = new Zapato();
		System.out.println("Que tipo de zapato es?");
		zapato.setTipo(sc.nextLine());
		System.out.println("De que marca es?");
		zapato.setMarca(sc.nextLine());
		System.out.println("De que esta hecha?");
		zapato.setTela(sc.nextLine());
		System.out.println("De que color es?");
		zapato.setColor(sc.nextLine());
		System.out.println("Que talla tiene?");
		zapato.setTalla(sn.nextDouble());
		System.out.println("Cual es el precio?");
		zapato.setPrecio(sn.nextDouble());
		zapato.imprimirZapato();
	}

	static void arcoiris() {
		Arcoiris arco = new Arcoiris();
		System.out.println("Cuantos colores tenia el arcoiris?");
		arco.setnColores(sn.nextInt());
		System.out.println("Cual era la longitud del arcoiris?");
		arco.setLongitud(sn.nextDouble());
		System.out.println("Cual es el angulo del arcoiris?");
		arco.setAngulo(sn.nextDouble());
		System.out.println("De que tipo era el arcoiris");
		arco.setTipo(sc.nextLine());
		arco.imprimirArcoiris();
	}

	static void estrella() {
		Fugaz star = new Fugaz();
		System.out.println("Cual era la velocidad?");
		star.setVelocidad(sn.nextDouble());
		System.out.println("Cuanto ha recorrido?");
		star.setDistancia(sn.nextDouble());
		System.out.println("Cual era el tamaño de la estrella?");
		star.setTamanno(sn.nextDouble());
		System.out.println("Cuanta intensidad hubo?");
		star.setIntensidad(sn.nextDouble());
		System.out.println("Cuantas veces las has visto?");
		star.setnVisualizaciones(sn.nextInt());
		star.imprimirEstrella();

	}

	static void flatulencia() {
		Flatulencia truenos = new Flatulencia();
		System.out.println("Cuanto ha durado la tormenta?");
		truenos.setDuracion(sn.nextDouble());
		System.out.println("De que tipo era?");
		truenos.setTipo(sc.nextLine());
		System.out.println("Como olia despues de los truenos?");
		truenos.setOlor(sc.nextLine());
		System.out.println("Cuanto de intensidad habia en los truenos?");
		truenos.setIntensidad(sn.nextInt());
		System.out.println("La tormenta te ha traido alguna sorpresa?");
		if (sc.nextLine().equalsIgnoreCase("Si")) {
			System.out.println("Me apiado de ti");
			truenos.setSorpresa(true);
		} else {
			truenos.setSorpresa(false);
		}
		truenos.imprimirPedo();

	}
}
