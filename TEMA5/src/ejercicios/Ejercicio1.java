package ejercicios;

public class Ejercicio1 {
public static void main(String[] args) {
	int numAleatorios[]=new int[10];
	for (int n=0;n<numAleatorios.length;n++) {
		numAleatorios[n]=(int)(Math.random()*100+1);
		System.out.println(numAleatorios[n]);
	}
}
}
