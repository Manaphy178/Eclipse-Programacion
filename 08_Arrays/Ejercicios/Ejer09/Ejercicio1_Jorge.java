package Ejer09;

public class Ejercicio1_Jorge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[25];
		for (int i = 0; i < numeros.length; i++) {
			int ran = (int) (Math.random() * 500);
			numeros[i] = ran;
		}
		int contPri = 0;
		boolean primo = true;
		for (int i = 0; i < numeros.length; i++) {
			primo = true;
			for (int j = 2; j < numeros[i] - 1; j++) {
				if (numeros[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo && numeros[i] != 0 && numeros[i] != 1) {
				contPri++;
			}
		}
		int[] primos = new int[contPri];
		contPri = 0;
		for (int i = 0; i < numeros.length; i++) {
			primo = true;
			for (int j = 2; j < numeros[i] - 1; j++) {
				if (numeros[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo && numeros[i] != 0 && numeros[i] != 1) {
				primos[contPri] = numeros[i];
				contPri++;
			}
		}
		for (int i = 0; i < primos.length; i++) {
			System.out.println(primos[i]);
		}
	}
}