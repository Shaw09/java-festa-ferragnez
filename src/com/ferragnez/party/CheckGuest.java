package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		System.out.print("Nome invitato: ");
		String persona = scan.nextLine();
		
		
//		for(int i = 0; i < invitati.length; i++) {
//			if(persona.equals(invitati[i])) {
//				System.out.println("Bene, sei sulla lista, puoi entrare");
//				
//				break;
//			} else if (i == invitati.length -1) {
//				System.out.println("Non sei sulla lista, smamma");
//				
//			}
//		}
		
		int counter = 0;
		
		while(counter < invitati.length) {
			if(persona.equals(invitati[counter])) {
				System.out.println("Bene, sei sulla lista, puoi entrare");
				
				break;
			} else if (counter == invitati.length -1) {
				System.out.println("Non sei sulla lista, smamma");
				
			
			}
			counter++;
		}
		
		scan.close();
		
	}

}
