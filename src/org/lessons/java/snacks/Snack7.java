package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {

		//Scrivere un programma che dati dei secondi li converta in ore, 
		//minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”) 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserire il numero di secondi da convertire: ");
		int seconds = sc.nextInt();
		sc.close();
		
		int hours = seconds / 3600;
		int residueSeconds = seconds % 3600;
		int minutes = residueSeconds / 60;
		int lastsSeconds = residueSeconds % 60;
		
		String time = String.format("%02d:%02d:%02d", hours, minutes, lastsSeconds);
		System.out.println("Secondi convertiti: " + time);
		
		
	}

}
