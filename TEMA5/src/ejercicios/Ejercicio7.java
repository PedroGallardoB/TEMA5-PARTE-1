package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	int nums[] = new int[10];
	System.out.println("Introduzca 10 números");
	for (int n = 0; n < nums.length; n++) {
		num = sc.nextInt();
		nums[n] = num;
	}
	System.out.println();
	for (int n = nums.length-1; n >= 0; n--) {
		System.out.println(nums[n]);
	}
	sc.close();
}
}
