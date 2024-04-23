package Ejemplo1;

import java.util.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vl = new Vehiculo("72472s7", "Mercedes", "ModeloKK", "Gasoil", 1800, 400, 24);
		Taxi tax = new Taxi("098L87", "Standar", "Madrid", false, "Mañanas");
		/*
		 * A la hora de utilizar los metodos, hereda todos los atributos de la clase que
		 * esta heredando
		 */
		tax.setCv(90);
		tax.setConsumo(9);
		tax.setCc(1200);
		System.out.println(tax.indiceFia());
		Camion truck = new Camion(8, "Standar", "Balona", 3000, "042D72");
		Bicicleta bici=new Bicicleta();
		ArrayList<Taxi> taxis = new ArrayList<Taxi>();
		taxis.add(tax);
		/*
		 * No podemos meter en el array de taxis un elemento que es de clase vehiculo o
		 * camion, obviamente
		 */
		ArrayList<Vehiculo> veis = new ArrayList<Vehiculo>();
		veis.add(vl);
		veis.add(truck);
		veis.add(tax);
		veis.add(bici);
		/*
		 * En un array o arrayList de la clase del padre, entonces si que se sabe que
		 * hay clases que heredan las clases hijas, es por eso que se puede añadir otras
		 * clases que no sean Vehiculo
		 */

//		Se puede saber cual es la clase de cada objeto con un getClass()
		System.out.println(veis.get(0).getClass());

		for (Vehiculo vehiculo : veis) {
			if (vehiculo.getClass().equals(Camion.class)) {
				System.out.println("CAMION");
			} else if (vehiculo.getClass().equals(Bicicleta.class)) {
				System.out.println("10 Puntos");
			} else if (vehiculo.getClass().equals(Taxi.class)) {
				System.out.println("Taxi");
			} else if (vehiculo.getClass().equals(Vehiculo.class)) {
				System.out.println("Vehiculo");
			}
		}
	}

}
