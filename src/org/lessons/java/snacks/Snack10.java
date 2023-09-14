package org.lessons.java.snacks;

import java.util.Random;

public class Snack10 {

	public static void main(String[] args) {
		//Creare un array di 10 elementi randomici compresi tra 100 e 1000 e stampare:
		//tutti gli elementi pari
		//tutti gli elementi dispari
		//tutti gli elementi in indice pari
		//tutti gli elementi in indice dispari
		
		int[] randomNumbers = new int [10];
		Random rand = new Random();
		
		for (int i = 0; i < randomNumbers.length; i++) {
			int randNumber = rand.nextInt(100, 1001);
			randomNumbers[i] = randNumber;
		}
		
		String pair = "Gli elementi pari sono: ";
		String odd = "Gli elementi dispari sono: ";
		String indexPair = "Gli elementi in indice pari sono: ";
		String indexOdd = "Gli elementi in indice dispari sono: ";
		
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i] % 2 == 0) {
				pair += randomNumbers[i] + " ";
			}
			else {
				odd += randomNumbers[i] + " ";
			}
			
			if (i % 2 == 0) {
				indexPair += randomNumbers[i] + " ";
			}
			else {
				indexOdd += randomNumbers[i] + " ";
			}
			
		}
		
		System.out.println(pair);
		System.out.println(odd);
		System.out.println(indexPair);
		System.out.println(indexOdd);


	}

}
