package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	double num=0;
	double mayor;
	double menor;
	Scanner sc = new Scanner(System.in);
	double leerNum[]=new double [10];
	
	System.out.println("Introduzca 10 valores");
	for (int n=0;n<leerNum.length;n++) {
		num=sc.nextDouble();
		leerNum[n]=num;
	}
	mayor=leerNum[0];
	menor=leerNum[0];
	for (double i:leerNum) {
		num=i;
		if (num>mayor) {
			mayor=num;
		
	}
		if (num<menor) {
			menor=num;
		}

}
	System.out.println("El mayor es "+mayor);
	System.out.println("El menor es "+menor);
	sc.close();
}
}