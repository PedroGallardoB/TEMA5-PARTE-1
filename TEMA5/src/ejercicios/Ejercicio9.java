package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tem;
	int temp[]=new int[12];
	System.out.println("Introduzca la temperatura de cada mes en orden.");
	for (int i=0;i<temp.length;i++) {
	tem=sc.nextInt();
	temp[i]=tem;
	}
	for (int i=0;i<temp.length;i++) {
		for(int n=0;n<temp[i];n++){
		System.out.print("+");}
		System.out.println();
	}
	sc.close();
}
}
