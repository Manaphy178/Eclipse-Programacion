package Ejer02;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num = 0;
		while (num <= 0) {
			System.out.println("Cuantas personas se van a medir? El numero tiene que ser positivo");
			num = sn.nextInt();
//			Le sigo repitiendo que me diga un numero mayor a 0, para asi poder hacer el calculo
		}

		double[] altura = new double[num]; // Del numero de personas que le he pedido que me diga lo aplico como numero
											// de posiciones que puede tener el array
		double alturas = 0;
		double media = 0;
		int mayor = 0;
		int menor = 0;
		for (int i = 0; i < altura.length; i++) {
			System.out.println("Dime la altura: ");
			altura[i] = sn.nextDouble();
			alturas = alturas + altura[i];// Hago la suma de las alturas para luego dividirlas y hacer la media

		}
		media = alturas / num;// Cojo la suma y el numero de personas que hay

		System.out.println("La media de altura es: " + media);

		for (int i = 0; i < altura.length; i++) {
//			Compruebo de las posiciones, cuales son mas de la media y cuales no. Y dependiendo de que cual sea sumo un contador de mayor a la media o menor a la media y lo digo en el syso final
			if (altura[i] > media) {
				mayor++;

			}
			if (altura[i] < media) {
				menor++;
			}
		}
		System.out.println("Hay " + mayor + " que estan por encima de la media");
		System.out.println("Hay " + menor + " que estan por debajo de la media");

	}
}
