package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack9 {

	public static void main(String[] args) {
     //Chiedere all'utente numeri interi e calcolarene la somma. Continuare a chiedere numeri, 
	//finche' la sommatoria non supera il valore 1000
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while (sum <= 1000) {
			System.out.print("Aggiungi un numero alla somma: ");
			sum+= sc.nextInt();
		}
		
		sc.close();
		System.out.println("La somma ha superato il numero 1000 ed è: " + sum);
		
	}

}
