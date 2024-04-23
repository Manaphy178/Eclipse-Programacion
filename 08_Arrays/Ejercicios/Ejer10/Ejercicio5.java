package Ejer10;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[1000];
		for (int i = 0; i < array1.length; i++) {
			int ran = (int) (Math.random() * 101);
			array1[i] = ran;
		}
		int cont = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 1) {
				break;
			} else {
				cont++;
			}
		}
		System.out.println("Se han introducido " + cont + " numeros antes que el 1");
	}
}
