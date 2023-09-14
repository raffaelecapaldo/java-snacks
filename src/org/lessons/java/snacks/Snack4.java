package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		// Data in input una stringa verificare se è palindroma

		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci stringa: ");
		String word = sc.nextLine().toLowerCase();
		sc.close();
		String reversedWord = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}
		
		System.out.println("La stringa " + 
					(reversedWord.equals(word)
					? "è"
					: "non è")
					+ " palindroma");

	}

}
