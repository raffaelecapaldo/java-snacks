package org.lessons.java.snacks;

import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		//Creare un array di 10 interi randomici compresi tra 100 e 150. 
		//Stampare tutti i valori contenuti nell'array (dopo averli inseriti). 
		//Stampare inoltre il valore minimo, massimo e la media
		
		int[] randomNumbers = new int [10];
		Random rand = new Random();
		
		for (int i = 0; i < randomNumbers.length; i++) {
			int randNumber = rand.nextInt(100, 151);
			randomNumbers[i] = randNumber;
		}
		
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println("Numero " + (i+1) + ": " + randomNumbers[i]);
		}
		
		int min = randomNumbers[0];
		int max = randomNumbers[0];
		int sum = randomNumbers[0];
		
		for (int i = 1; i < randomNumbers.length; i++) {
			if (randomNumbers[i] < min) {
				min = randomNumbers[i];
			}
			
			if (randomNumbers[i] > max) {
				max = randomNumbers[i];
			}
			
			sum+= randomNumbers[i];
		}
		
		double average = (double) sum / randomNumbers.length;
		
		System.out.println("Numero minimo: " + min);
		System.out.println("Numero massimo: " + max);
		System.out.println("Media: " + average);


	}

}
