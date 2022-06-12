package com.lockerme;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.lockerme.directory.FileDirectory;
import com.lockerme.details.DisplayDetails;
public class LockerMenu {

	Scanner sc = new Scanner(System.in);
	int choice;
	
	public static void main(String[] args) {
		//Welcome Screen displaying Developer Name and Application Details
		System.out.println("Welcome to LockerMe.com Phase 1 Project");
		System.out.println("Developed By 'Sagar Belsare'");	
		System.out.println("From Coompany Locker Pvt. Ltd");
		System.out.println("****************************************************************************");
		
		LockerMenu l = new LockerMenu();
		l.menu();		
	}	
	public void menu() {
		//Menu displaying Options 
				do {			
					System.out.println("Main Menu - Select any one of the following operations");
					System.out.println("1. List the types of files in directory");
					System.out.println("2. Perform functions like add, Delete or Search");
					System.out.println("3. Exit");
					//Accepting User Input
					try{	
						System.out.print("Enter Choice : ");
						choice = sc.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("Invalid Option. Please enter valid option.");
						LockerMenu l = new LockerMenu();
						l.menu();
					}
					//Performing Functions as per User Input
					switch(choice) {
					case 1:
						FileDirectory d = new FileDirectory();
						d.display();
						break;
					case 2:
						DisplayDetails d1 = new DisplayDetails();
						d1.displayDets();
						break;
					case 3:
						System.out.println("Thank you for using our application!");
						break;
					default:
						System.out.println("Invalid Option. Please enter a valid option.");
				      }
			        }
			      while( choice!=3 );
				
	}
}
