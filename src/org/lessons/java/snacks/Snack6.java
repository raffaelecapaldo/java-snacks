package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack6 {

	public static void main(String[] args) {
	//	Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.

		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero:" );
		String stringNum = sc.nextLine();
		sc.close();
		
		int intNum = 0; //INTERO
		for (int i = 0; i < stringNum.length(); i++) {
			char charNum = stringNum.charAt(i);
			int charConverted = charNum - '0'; // 0 vale 48 e fino a 9 il valore aumenta di uno in uno, 
			//sottraendo quindi ad esempio 0 (48) a 1 (49) avremo il suo valore reale in int (che è appunto 1)
			 intNum = intNum * 10 + charConverted; //aggiungi uno zero (*10) per la prox iterazione (nella prima 0*0 è 0)
		}
		
		System.out.println(intNum); //STAMPA INTERO
	}

}
