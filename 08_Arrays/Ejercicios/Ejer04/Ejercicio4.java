package Ejer04;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[50];
		int lista = 1;
		for (int i = 0; i < array.length; i++) {
			int ran = (int) (Math.random() * 101);
			array[i] = ran;
			System.out.println(lista + "°. " + array[i]);
			lista++;
		}
	}

}
