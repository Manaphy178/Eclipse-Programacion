package Ejer6_Repaso;

public class ejercicio01 {

	public static void main(String[] args) {
		int[][] numeros = new int[4][4];
		rellenar(numeros);
		int[] primos = primos(numeros);
		int[] noPri = noPrimos(numeros);
		System.out.println("Primos");
		print(primos);
		System.out.println("No Primos");
		print(noPri);
	}

	static void rellenar(int[][] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				num[i][j] = (int) (Math.random() * 20) + 1;
			}
		}
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static int[] noPrimos(int[][] num) {
		int[] noPrimos = new int[contNoPrimos(num)];
		int index = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				if (j != 2) {
					for (int x = 2; x < num[i][j]; x++) {
						if (num[i][j] % x == 0) {
							noPrimos[index] = num[i][j];
							index++;
							break;
						}
					}
				}
			}
		}
		return noPrimos;
	}

	static int contNoPrimos(int[][] num) {
		int cont = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				if (j != 2) {
					for (int x = 2; x < num[i][j]; x++) {
						if (num[i][j] % x == 0) {
							cont++;
							break;
						}
					}
				}
			}
		}
		return cont;
	}

	static int[] primos(int[][] num) {
		int[] primos = new int[ContPrimos(num)];
		int index = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				boolean primo = true;
				if (num[i][j] < 2) {
					primo = false;
				} else {
					for (int x = 2; x < num[i][j]; x++) {
						if (num[i][j] % x == 0) {
							primo = false;
							break;
						}
					}
				}
				if (primo && num[i][j] > 1) {
					primos[index] = num[i][j];
					index++;
				}

			}

		}
		orden(primos);
		return primos;
	}

	static int ContPrimos(int[][] num) {
		int contPri = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				boolean primo = true;
				if (num[i][j] < 2) {
					primo = false;
				} else {
					for (int x = 2; x < num[i][j]; x++) {
						if (num[i][j] % x == 0) {
							primo = false;
							break;
						}
					}
				}
				if (primo && num[i][j] > 1) {
					contPri++;
				}
			}
		}
		return contPri;
	}

	static void orden(int[] num) {
		int numero = 0;
		for (int i = 0; i < num.length; i++) {
			for (int x = 0; x < num.length - 1; x++) {
				if (num[x + 1] < num[x]) {
					numero = num[x];
					num[x] = num[x + 1];
					num[x + 1] = numero;
				}
			}
		}
	}

}
