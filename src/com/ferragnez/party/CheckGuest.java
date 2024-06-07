package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] guestList = {"w","Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

		String userGuest;
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Ciao, come ti chiami?");
		userGuest = scanner.nextLine();
		
		
		
		
		boolean isOnTheList = false;
		
		
		//metodo con for
		/*
		 * for (int i = 0; i < guestList.length; i++ ) { if
		 * (guestList[i].equals(userGuest)) { isOnTheList = true; break; } }
		 */
		
		
		//metodo con while
		
		int i = 0;
		while (!isOnTheList && i < guestList.length) {
			if (guestList[i].equals(userGuest)) {
				isOnTheList = true;
				}
			i++;
				}
		
		if (isOnTheList) {
			System.out.println("Il tuo nome è presente, benvenuto " + userGuest + "!");
		} else {
			System.out.println("Il tuo nome non è presente, vattene " + userGuest + "!");
		}
		
		scanner.close();
		
		
		
		
		
	

	}
	}
