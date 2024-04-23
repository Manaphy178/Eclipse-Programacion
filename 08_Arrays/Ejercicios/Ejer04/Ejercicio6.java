package Ejer04;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[1000];
		for (int i = 0; i < array.length; i++) {
			int ran = (int) (Math.random() * 7);
			array[i] = ran;
		}
		for (int i = 1; i <= 6; i++) {
			int cont = 0;
			for (int x = 0; x < array.length; x++) {
				if (array[x] == i) {
					cont++;
				}
			}
			System.out.println("Las veces que se han repetido el numero " + i + " es: " + cont + " veces");
		}
	}

}
