package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

		// scansione input utente
		String userGuest;
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Ciao, come ti chiami?");
		userGuest = scanner.nextLine();
		scanner.close();
			
		boolean isOnTheList = false;
		
		//metodo con for
		
//		
//	  	for (int i = 0; i < guestList.length; i++ ) { 
//			if (guestList[i].equals(userGuest)) {
//				isOnTheList = true; 
//				break; 
//			} 
//		}
		
		//metodo for-each
		
		for (String guest : guestList) {
			if (guest.equals(userGuest)) { 
				isOnTheList = true; 
				break;
				} 
		}
		 
		
		//metodo con while
		
//		int i = 0;
//		while (!isOnTheList && i < guestList.length) {
//			if (guestList[i].equals(userGuest)) {
//				isOnTheList = true;
//				}
//			i++;
//				}
		
		if (isOnTheList) {
			System.out.println("Il tuo nome è presente, benvenuto " + userGuest + "!");
		} else {
			System.out.println("Il tuo nome non è presente, vattene " + userGuest + "!");
		}
		
		

	}
	}
