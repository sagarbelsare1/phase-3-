package com.lockerme.details;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {

	String fileName;
	Scanner sc = new Scanner(System.in);
	//Function accepts name of the file to be added from the user and calls the function that will add the file
	public void addingFile() {
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		//Calling CreateFile function to create the file 
		AddFile a = new AddFile();
		a.createFile(fileName);
	}
	//Adding file to the directory 
	public void createFile(String fileName) {
		File dir = new File ("C:\\Users\\PC\\Desktop\\Simplilearn FullStack Java Development Course\\Phase1\\Phase1 Practice code\\Files");
		
	    try {
	      File file = new File(dir, fileName);
	      
	      if (file.createNewFile()) {    	      	 
			System.out.println("File Created : " + file.getName());
	      } else {
	    	  System.out.println("File already exists. Please enter another name");
	    	  AddFile a = new AddFile();
	    	  a.addingFile();
	      }
	    } catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
	  }
}
