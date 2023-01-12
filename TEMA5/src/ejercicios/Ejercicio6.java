package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int num = 0;

		Scanner sc = new Scanner(System.in);
		int esPar[] = new int[8];

		System.out.println("Introduzca 8 valores");
		for (int n = 0; n < esPar.length; n++) {
			num = sc.nextInt();
			esPar[n] = num;
		}

		for (int i : esPar) {
			num = i;
			if (num % 2 == 0) {
				System.out.println(num + " es par");
				;

			} else {
				System.out.println(num + " es impar");

			}

		}
		sc.close();
	}
}
