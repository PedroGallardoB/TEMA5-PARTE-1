package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numeros[] = new int [100];
	int valor;
	
	for (int i=0;i<numeros.length;i++) {
		numeros[i]=(int)(Math.random()*11);
	}
	
	System.out.println("Introduzca el valor para saber en que posiciones está (del 1 al 11)");
	System.out.println();
	System.out.print("VALOR: ");
	valor=sc.nextInt();
	System.out.println();
	
	for (int i=0;i<numeros.length;i++) {
		if (numeros[i]==valor) {
			System.out.print(i+" ");
		}
	}
	
	sc.close();
}
}
