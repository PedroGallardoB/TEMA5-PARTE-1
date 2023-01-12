package ejercicios;

public class Ejercicio2 {
public static void main(String[] args) {
	
	int suma=0;
	int numAleatorios[]=new int[10];
	for (int n=0;n<numAleatorios.length;n++) {
		numAleatorios[n]=(int)(Math.random()*100+1);
	}
	for (int n=0;n<numAleatorios.length;n++) {
		suma+=numAleatorios[n];
	}
	System.out.println(suma);
}
}
