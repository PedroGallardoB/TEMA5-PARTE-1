package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	double num;
	Scanner sc = new Scanner(System.in);
	double leerNum[]=new double [5];
	
	System.out.println("Introduzca 5 valores");
	for (int n=0;n<leerNum.length;n++) {
		num=sc.nextDouble();
		leerNum[n]=num;
	}
	for (double i:leerNum) {
		System.out.println(i);
	}
	sc.close();
 
}
}
