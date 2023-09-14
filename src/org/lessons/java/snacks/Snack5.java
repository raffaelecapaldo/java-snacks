package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		// Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, 
		//quanti numeri e quanti simboli non alfanumerici.
		//Continuare a chiedere una nuova stringa finchè non si inserisce 0.
		
		Scanner sc = new Scanner(System.in);
		String string = "";
		
		while (!string.equals("0")) {
			System.out.print("Inserire la stringa: ");
			string = sc.nextLine();
			
			int letters = 0;
			int numbers = 0;
			int symbols = 0;
			
			for (int i = 0; i < string.length(); i++) {
				char charToCheck = string.charAt(i);
				if (Character.isLetter(charToCheck)) {
					letters++;
				}
				else if (Character.isDigit(charToCheck)) {
					numbers++;
				}
				else if (!Character.isAlphabetic(charToCheck)) {
					symbols++;
				}
			}
			
			if (string.equals("0")) {
				System.out.println("Programma interrotto!");
				return;
			}
			
			System.out.println("La stringa contiene: " + letters + " carrateri alfabetici, "
					+ numbers + " numeri e " + symbols + " simboli non alfanumerici");
		}

	}

}
