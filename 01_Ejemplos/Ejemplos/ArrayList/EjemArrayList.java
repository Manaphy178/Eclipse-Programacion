package ArrayList;

import java.util.*;

public class EjemArrayList {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		Para crear un arrayList se hace de esta forma
		ArrayList<String> nombres = new ArrayList<String>();

//		Para añadir elementos a este array se utiliza el metodo add y el valor que le hemos dado

		String nom = "Jesus"; // Se pueden utilizar objetos creados para añadirlos al arraylist
		nombres.add(nom);
		nombres.add("Jorge");
		nombres.add("Antonio");
		nombres.add("Isabel");
		nombres.add("Lourdes");
		nombres.add("Carlos");
		nombres.add("Laura");

//		.size() nos devuelve el nº de elementos que hay en arraylist
		System.out.println(nombres.size());

//		 Para insertar un valor en una posicion que queramos se utiliza add pero con un nº antes " .add(n, objeto)
		nombres.add(3, "Cristina");

//		.remove(n) sirve para borrar el objeto que esta en la posicion indicada y recoloca todo el array
		nombres.remove(0);
		
//		.get(n) nos devuelve el objeto que ocupa la posicion designada
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}

//		El metodo contains devuelve un booleano, indicando que el valor que hemos puesto este dentro del arrayList
		System.out.println(nombres.contains("Cristina"));

//		.indexOf me devuelve la posicion en caso de encontrarlo en la que este el valor que queremos, si no lo encuentra devolvera -1
//		Siempre devolvera la ultima poscion en la que encontro el objeto
		System.out.println(nombres.indexOf("Cristina"));
		
//		.isEmpty devuelve un booleano para ver si el array esta vacio o no
		System.out.println(nombres.isEmpty());
		
		
//		Recorrer el arrayList con un for each
		for (String s : nombres) { //Este for se encarga de recorrer el array hasta el ultimo objeto
			
			System.out.println(s);//Con la s a secas se referiria al string del array
			
		}

	}

}
