package com.lockerme.directory;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.lockerme.LockerMenu;
import com.lockerme.directory.FileDirectory;

public class FileDirectory {

	Scanner sc = new Scanner(System.in); 
	int choice;
	File dir = new File ("C:\\Users\\PC\\Desktop\\Simplilearn FullStack Java Development Course\\Phase1\\Phase1 Practice code\\Files");
	ArrayList<String> fileList = new ArrayList<>();	
	public void display() {
		//Sub menu - Option 1 
		do {
			System.out.println("1. Display file names for directory");
			System.out.println("2. Go to main Menu");
			
			//Accepting User input
			try{	
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
				FileDirectory d = new FileDirectory();
				d.display();
			}
			//Performing User Functions
			switch(choice) {
				case 1:
					FileDirectory ao = new FileDirectory();
					ao.filedirectory();
					break;
				case 2:
					LockerMenu l = new LockerMenu();
					l.menu();
					break;
				default:
					System.out.println("Invalid Option. Please enter valid option.");
					break;
			}
			
		}
		while(choice!=2);		
		}
	//Arranging the contents of the file directory 
		private void filedirectory() {					
		      String[] children = dir.list();
		      
		      //Gets filenames from the directory and adds it to an array list, that is used to arrange the contents in ascending order
		      if (children == null) {
		         System.out.println( "Directory Empty.");
		      } else { 
		         for (int i = 0; i< children.length; i++) {
		            String filename = children[i];
		            fileList.add(filename);
		         }
		      }  
		      
		      Collections.sort(fileList);
		      System.out.println("Files in Ascending Order : " + fileList);
					
			}
}
