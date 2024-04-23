package Strings;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = " Esto es una frase";
		int num = 0;
//		Los objetos tienen metodos (String es una clase, no variable) por la mayuscula de S String
		System.out.print("Caracter con el valor 3 (posicion 4 visto como array): ");
		System.out.println(cadena.charAt(3)); // Esto me daria la "o" del String cadena
//		Metodo mas utilizado de la clase String
		System.out.print("Numero de longitud de largo de cadena: ");
		System.out.println(cadena.length());

//		Se puede recorrer la cadena caracter por caracter (puesto con espacios para que se vea el bucle)
		for (int i = 0; i < cadena.length(); i++) {
			System.out.print(cadena.charAt(i) + " ");
		}

//		Es como si hicieramos esto
		System.out.println("\r" + cadena);

//		Metodo que devuelve verdadero o false segun los caracteres
		cadena.equalsIgnoreCase("caca");

//		Metodo que concatena (concatenar es añadir a algo) el string. Modificandola 
		System.out.println(cadena.concat(" fea."));
//		Modificandola porque en un syso no se modifica nada
		cadena = cadena.concat(" fea.");
		System.out.println(cadena);

//		Te da valor verdadero o falso segun que cosa
		System.out.println(cadena.startsWith("Es"));// Empieza con (es false porque no hay espacio
		System.out.println(cadena.endsWith("una frase fea."));// Acaba con

//		Te da el valor del caracter que tu introduzcas. Las veces que esta en el String
		System.out.println(cadena.indexOf("e"));

//		Modificacion de texto
		System.out.println(cadena.toLowerCase());// Ponerlos en minuscular
		System.out.println(cadena.toUpperCase());// Ponerlos en mayusculas

//		Elimina los espacios que que tiene innecesarios (principio o final)
		System.out.println(cadena.trim());

//		Coge las partes pequeñas de una cadena, en este caso del 3 al 6. 
		System.out.println(cadena.substring(3, 6));
//		Si no estuviera el 6 seria desde el 3 al final
		System.out.println(cadena.substring(3));
		
//		Reemplazar los caracteres 
		System.out.println(cadena.replace("e", "0")); // seria asi la sintaxis "replace("caracter antiguo", "caracter nuevo")"
		System.out.println(cadena.replace("fea", "horrible"));
	}

}
