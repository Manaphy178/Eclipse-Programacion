package Ejer09;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[25];
		int contPri = 0;
		boolean primo = true;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para el array");
			array1[i] = sn.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				contPri++;
			}
		}
		int[] primos = new int[contPri];
		contPri = 0;
		for (int i = 0; i < array1.length; i++) {
			primo = true;
			for (int j = 2; j < array1[i]; j++) {
				if (array1[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				primos[contPri] = array1[i];
				contPri++;
			}
		}
		for (int i = 0; i < primos.length; i++) {
			System.out.print(primos[i] + ", ");
		}
	}
}