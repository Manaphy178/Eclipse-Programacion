package Ejer08;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] numeros = { 10, 4, 456, 5, 12, 34, 22, 9, 0, 56, 2, 122, 3 };
		System.out.println("Menor a mayor");
		MenMay(numeros);

		System.out.println("\rMayor a menor");
		MayMen(numeros);
	}

	static void MenMay(int[] numeros) {
		int num = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int x = i + 1; x < numeros.length - 1; x++) {
				if (numeros[x] < numeros[i]) {
					num = numeros[i];
					numeros[i] = numeros[x];
					numeros[x] = num;
				}
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			if (i == numeros.length - 1) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + " < ");
			}
		}
	}

	static void MayMen(int[] numeros) {
		int num = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int x = i + 1; x < numeros.length; x++) {
				if (numeros[x] > numeros[i]) {
					num = numeros[i];
					numeros[i] = numeros[x];
					numeros[x] = num;
				}
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			if (i == numeros.length - 1) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + " > ");
			}
		}
	}
}
