package Ejer10;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[100];
		for (int i = 0; i < array1.length; i++) {
			int ran = (int) (Math.random() * 101);
			array1[i] = ran;
		}
		int pri = 0;
		boolean primo = true;
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			if (array1[i] < 2) {
				primo = false;
			} else {
				for (int j = 2; j < array1[i]; j++) {
					if (array1[i] % j == 0) {
						primo = false;
						break;
					}
				}
			}
			if (primo) {
				pri++;
			}
		}
		int[] primos = new int[pri];
		pri = 0;
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			if (array1[i] < 2) {
				primo = false;
			} else {
				for (int j = 2; j < array1[i]; j++) {
					if (array1[i] % j == 0) {
						primo = false;
						break;
					}
				}
			}
			if (primo) {
				primos[pri] = array1[i];
				pri++;
			}
		}
		for (int i = 0; i < primos.length; i++) {
			System.out.println(primos[i]);
		}
	}
}
