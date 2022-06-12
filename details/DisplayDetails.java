package com.lockerme.details;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.lockerme.LockerMenu;

public class DisplayDetails {

	int choice;
	Scanner sc = new Scanner(System.in);
	
	public void displayDets() {
		//Sub menu - Option 2
		do {			
			System.out.println("1. Add file to the directory");
			System.out.println("2. Delete a file from the list");
			System.out.println("3. Search a file from the list");
			System.out.println("4. Go to main Menu");
			
			//Accepting User input
			try{	
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
				DisplayDetails d = new DisplayDetails();
				d.displayDets();
			}
			
			//Performing User Functions
			switch(choice) {
				case 1:
					AddFile a = new AddFile();
					a.addingFile();					
					break;
				case 2:
					DeleteFile d = new DeleteFile();
					d.deletingFile();
					break;
				case 3:
					SearchFile s = new SearchFile();
					s.searchingFile();
					break;
				case 4:
					LockerMenu l = new LockerMenu();
					l.menu();
					break;
				default:
					System.out.println("Invalid Option. Please enter valid option.");
					break;
			}
			
		}
		while(choice!=4);		
	}
}
