package Ejer02;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 1, 2, 3, 4, 5 };
		int[] invertido = new int[5];
		int cont = 0; // este contador es para poder hacer que los valores esten invertidos 
		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println("");
		for (int i = 4; i >= 0; i--) {
			invertido[cont/* el contador empieza en 0 indicando la posicion*/]  = numeros[i];//Este contador o valor empieza en 4 y se va reduciendo
			System.out.print(invertido[cont] + ", ");
			cont++;
		}
		System.out.println("");
		int lista_ordenada=1;//Empiezan en 1 para hacer una lista
		int lista_invertida=1;
		System.out.println("Lista ordenada");
		for (int i =0;i< 5;i++) {// Hacemos que i vaya de 0 a 5 para decir las posiciones en orden con los valores en el orden que los pusimos
			
			System.out.println(lista_ordenada+"º. "+numeros[i] + " (El valor actual de i es: " + i +")"); //Para que veas la posicion actual que esta diciendo de numeros[i] y ver que esta yendo en orden
			lista_ordenada++; // Se va sumando para cambiar el numero de la lista 
		}
		System.out.println("Lista invertida");
		for (int i =0;i< 5;i++) {// Hacemos que i vaya de 0 a 5 para decir las posiciones en orden invertido
			System.out.println(lista_invertida+"º. "+invertido[i] + " (El valor actual de i es: " + i +")"); //Para que veas la posicion actual que esta diciendo de numeros[i] y ver que esta yendo en orden
			lista_invertida++; // Se va sumando para cambiar el numero de la lista
		}
	}

}
