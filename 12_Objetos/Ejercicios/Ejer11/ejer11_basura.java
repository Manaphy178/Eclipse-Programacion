package Ejer11;

import java.util.*;

public class ejer11_basura {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	static ArrayList<String> nomAeropuerto = new ArrayList<>();
	static ArrayList<String> ciuAeropuerto = new ArrayList<>();
	static ArrayList<String> codAeropuerto = new ArrayList<>();

	static void fillStringAero() {
		String[] nombresAeropuertos = { "Internacional John F. Kennedy", "Internacional de Heathrow", "Haneda",
				"Internacional de Dubai", "AChangi", "Internacional de Los Ángeles", "Frankfurt", "Incheon",
				"Internacional de Singapur", "Amsterdam-Schiphol", "Madrid-Barajas", "Pekín-Capital", "Toronto Pearson",
				"Suvarnabhumi", "Internacional de Hong Kong" };

		String[] ciudadesAeropuertos = { "Nueva York", "Londres", "Tokio", "Dubái", "Singapur", "Los Ángeles",
				"Fráncfort", "Incheon", "Singapur", "Ámsterdam", "Madrid", "Pekín", "Toronto", "Bangkok", "Hong Kong" };

		String[] codigosAeropuertos = { "12345ABC", "67890DEF", "54321GHI", "98765JKL", "45678MNO", "23456PQR",
				"78901STU", "01234VWX", "56789YZA", "89012BCD", "34567EFG", "90123HIJ", "23456KLM", "78901NOP",
				"01234QRS" };

		for (int i = 0; i < nombresAeropuertos.length; i++) {
			nomAeropuerto.add(nombresAeropuertos[i]);
		}
		for (int i = 0; i < ciudadesAeropuertos.length; i++) {
			ciuAeropuerto.add(ciudadesAeropuertos[i]);
		}
		for (int i = 0; i < codigosAeropuertos.length; i++) {
			codAeropuerto.add(codigosAeropuertos[i]);
		}
	}

	static ArrayList<String> modAvion = new ArrayList<>();
	static ArrayList<String> matriAvion = new ArrayList<>();

	static void fillStringAvion() {
		String[] modelosAvion = { "Boeing 747", "Airbus A380", "Embraer E190", "Cessna 172", "Bombardier Global 6000",
				"Boeing 777", "Airbus A320", "Lockheed Martin C-130", "Boeing 737", "Gulfstream G650", "Airbus A350",
				"Boeing 787 Dreamliner", "Embraer Phenom 300", "Cessna Citation X", "Dassault Falcon 7X" };

		String[] matriculasAvion = { "N12345", "G-ABCDE", "JA1234", "N98765", "C-FGHIJ", "A-B123", "D-EF789", "LMN123",
				"X-YZ789", "N45678", "F-GHIJ", "B-C789", "PHEM300", "CITX789", "FAL7X12" };

		for (int i = 0; i < modelosAvion.length; i++) {
			modAvion.add(modelosAvion[i]);
		}
		for (int i = 0; i < matriculasAvion.length; i++) {
			matriAvion.add(matriculasAvion[i]);
		}
	}

	static ArrayList<String> nomPasajero = new ArrayList<>();
	static ArrayList<String> apePasajero = new ArrayList<>();
	static ArrayList<String> idPasajero = new ArrayList<>();

	static void fillStringPasajero() {
		String[] nombresPasajero = { "Ana", "Juan", "María", "Carlos", "Laura", "Pedro", "Isabel", "Luis", "Sofía",
				"Andrés", "Elena", "Javier", "Beatriz", "Alejandro", "Carmen" };

		String[] apellidosPasajero = { "Gómez", "López", "Martínez", "Fernández", "Rodríguez", "Sánchez", "Pérez",
				"García", "Díaz", "Torres", "Ramírez", "Hernández", "Ruiz", "Gutiérrez", "Jiménez" };

		String[] idsPasajero = { "1234567A", "2345678B", "3456789C", "4567890D", "5678901E", "6789012F", "7890123G",
				"8901234H", "9012345I", "0123456J", "1234567K", "2345678L", "3456789M", "4567890N", "5678901O" };

		for (int i = 0; i < nombresPasajero.length; i++) {
			nomPasajero.add(nombresPasajero[i]);
		}
		for (int i = 0; i < apellidosPasajero.length; i++) {
			apePasajero.add(apellidosPasajero[i]);
		}
		for (int i = 0; i < idsPasajero.length; i++) {
			idPasajero.add(idsPasajero[i]);
		}
	}

	static ArrayList<String> nomComandante = new ArrayList<>();
	static ArrayList<String> apeComandante = new ArrayList<>();
	static ArrayList<String> idComandante = new ArrayList<>();
	static ArrayList<String> rangoComandante = new ArrayList<>();

	static void fillStringComandante() {
		String[] nombresComandante = { "Carlos", "Ana", "Miguel", "Laura", "Roberto", "Isabel", "Juan", "Carmen",
				"Fernando", "María", "Alejandro", "Elena", "Luis", "Silvia", "Javier" };

		String[] apellidosComandante = { "García", "Martínez", "López", "Pérez", "Sánchez", "Romero", "González",
				"Díaz", "Fernández", "Rodríguez", "Alonso", "Ruiz", "Vázquez", "Navarro", "Torres" };

		String[] idsComandante = { "1234567A", "9876543B", "5678901C", "3456789D", "8901234E", "4567890F", "2345678G",
				"8765432H", "5432109I", "2109876J", "6543210K", "1098765L", "4321098M", "8901234N", "5678901O" };

		String[] rangosComandante = { "Comandante 1", "Comandante 2", "Comandante 3", "Comandante 4", "Comandante 5",
				"Comandante 6", "Comandante 7", "Comandante 8", "Comandante 9", "Comandante 10", "Comandante 11",
				"Comandante 12", "Comandante 13", "Comandante 14", "Comandante 15" };
		for (int i = 0; i < nombresComandante.length; i++) {
			nomComandante.add(nombresComandante[i]);
		}
		for (int i = 0; i < apellidosComandante.length; i++) {
			apeComandante.add(apellidosComandante[i]);
		}
		for (int i = 0; i < idsComandante.length; i++) {
			idComandante.add(idsComandante[i]);
		}
		for (int i = 0; i < rangosComandante.length; i++) {
			rangoComandante.add(rangosComandante[i]);
		}
	}

	static void rellenarTodo(ArrayList<Aeropuerto> aero, ArrayList<Avion> avion, ArrayList<Pasajero> pasajero,
			ArrayList<Comandante> comand, ArrayList<Vuelo> vuelos) {
		fillStringAero();
		fillStringAvion();
		fillStringPasajero();
		fillStringComandante();
		for (int i = 0; i < 2; i++) {

			aero.add(new Aeropuerto(nomAeropuerto.get(0), ciuAeropuerto.get(0), codAeropuerto.get(0), avion));
			nomAeropuerto.remove(0);
			ciuAeropuerto.remove(0);
			codAeropuerto.remove(0);
			pasajero.add(new Pasajero(nomPasajero.get(0), apePasajero.get(0), numTelefono(), idPasajero.get(0),
					numEdadPas()));
			int ultPas = pasajero.size() - 1;
			pasajero.get(ultPas).setId(idPasajero.get(0));
			nomPasajero.remove(0);
			apePasajero.remove(0);
			idPasajero.remove(0);
			comand.add(new Comandante(nomComandante.get(0), apeComandante.get(0), numTelefono(), idComandante.get(0),
					numEdadCom(), rangoComandante.get(0)));
			int ultCom = comand.size() - 1;
			comand.get(ultCom).setId(idComandante.get(0));
			nomComandante.remove(0);
			apeComandante.remove(0);
			idComandante.remove(0);
			rangoComandante.remove(0);
			int capPaAvion = (int) (Math.random() * 300) + 100;
			double capDepAvion = (Math.random() * 2000) + 800;
			int anFabri = (int) (Math.random() * 2024) + 1970;
			avion.add(new Avion(modAvion.get(0), capPaAvion, matriAvion.get(0), capDepAvion, anFabri, comand.get(i)));
			modAvion.remove(0);
			matriAvion.remove(0);
		}
		int codVuelo = (int) (Math.random() * 999) + 1;
		vuelos.add(new Vuelo(codVuelo, avion.get(0), pasajero, aero.get(0), aero.get(1)));
		vuelos.get(0).setCod_vuelo(codVuelo);
	}

	static void rellenarPeticion(int veces, ArrayList<Aeropuerto> aero, ArrayList<Avion> avion,
			ArrayList<Pasajero> pasajero, ArrayList<Comandante> comand) {
		for (int i = 0; i < veces; i++) {

			aero.add(new Aeropuerto(nomAeropuerto.get(0), ciuAeropuerto.get(0), codAeropuerto.get(0), avion));
			nomAeropuerto.remove(0);
			ciuAeropuerto.remove(0);
			codAeropuerto.remove(0);
			pasajero.add(new Pasajero(nomPasajero.get(0), apePasajero.get(0), numTelefono(), idPasajero.get(0),
					numEdadPas()));
			int ultPas = pasajero.size() - 1;
			pasajero.get(ultPas).setId(idPasajero.get(0));
			nomPasajero.remove(0);
			apePasajero.remove(0);
			idPasajero.remove(0);
			comand.add(new Comandante(nomComandante.get(0), apeComandante.get(0), numTelefono(), idComandante.get(0),
					numEdadCom(), rangoComandante.get(0)));
			int ultCom = comand.size() - 1;
			comand.get(ultCom).setId(idComandante.get(0));
			nomComandante.remove(0);
			apeComandante.remove(0);
			idComandante.remove(0);
			rangoComandante.remove(0);
			int capPaAvion = (int) (Math.random() * 300) + 100;
			double capDepAvion = (Math.random() * 2000) + 800;
			int anFabri = (int) (Math.random() * 2024) + 1970;
			avion.add(new Avion(modAvion.get(0), capPaAvion, matriAvion.get(0), capDepAvion, anFabri,
					comand.get(ultCom)));
			modAvion.remove(0);
			matriAvion.remove(0);
		}
	}

	static int numTelefono() {
		Random random = new Random();
		StringBuilder numeroTelefonoBuilder = new StringBuilder();
		numeroTelefonoBuilder.append(1 + random.nextInt(9));
		for (int i = 0; i < 5; i++) {
			numeroTelefonoBuilder.append(random.nextInt(10));
		}
		String tel = numeroTelefonoBuilder.toString();
		return Integer.parseInt(tel);
	}

	static int numEdadCom() {
		return (int) (Math.random() * 59) + 20;
	}

	static int numEdadPas() {
		return (int) (Math.random() * 80) + 2;
	}

	static boolean existeComandante(ArrayList<Comandante> comand, String id) {
		for (int i = 0; i < comand.size(); i++) {
			if (comand.get(i).getId().equalsIgnoreCase(id)) {
				return true;

			}
		}
		return false;
	}

	static int numComandante(ArrayList<Comandante> comand, String id) {
		int pos = 0;
		for (int i = 0; i < comand.size(); i++) {
			if (comand.get(i).getId().equalsIgnoreCase(id)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	static boolean existeAeropuerto(ArrayList<Aeropuerto> aeropuerto, String cod) {
		return false;
	}
}
