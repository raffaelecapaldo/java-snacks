package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int num = sc.nextInt();
		sc.close();
		boolean pair = num % 2 == 0;
		
		if (!pair) {
			num++;
		}
		
		System.out.println("Numero risultante: " + num);
		
	}

}
