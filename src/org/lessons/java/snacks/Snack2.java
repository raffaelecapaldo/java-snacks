package org.lessons.java.snacks;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi, e da queste vuole mostrare
		//a video una falsa lista di invitati con nome e cognome.
		
		String[] names = {"Paolo", "Giovanni", "Francesco", "Carlo", "Raffaele",
				"Gennaro", "Lorenzo", "Alessandro"};
		
		String[] surnames = {"Palumbo", "Capaldo", "Scialpi", "Mestizia", "Rossi", 
				"Barbero", "Conti", "Montuori"};
		
		System.out.println("Lista invitati");
		for (int i = 0; i < 3; i++ ) {
			Random rand = new Random();
			int rand1 = rand.nextInt(names.length - 1);
			int rand2 = rand.nextInt(surnames.length - 1);

			String person = names[rand1] + " " + surnames[rand2];
			
			System.out.println(person);
		}

	}

}
