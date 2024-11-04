package com.controller;

import java.util.Scanner;

import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {
		
		
		int id;
		boolean status=true;
		String name,city,country;


		StudentService ss = new StudentService();
		//Ask user input
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Which Operation would you like to perform? please select below option\n");
			System.out.println("1. InsertRecord\n2. DeleteRecord\n3. UpdateRecord\n4. FetchRecord\n5. Exit");
			int option = sc.nextInt();
		
			//take iput from user 
			switch(option) {
				case 1:
					  //Take id,name,city,country from user
					  System.out.println("Please enter Student ID");
					  id = sc.nextInt();			
					  System.out.println("Please enter Student Name");
					  name = sc.next();				  
					  System.out.println("Please enter Student City");
					  city = sc.next();
					  System.out.println("Please enter Student Country");
					  country = sc.next();
					  ss.insertdata(id,name,city,country);

					  break;
				case 2:
					  //Take id from user based on id we will delete record
					  System.out.println("Please enter Student ID");
					  id = sc.nextInt();
					  ss.deleteData(id);

					  break;
				case 3:
					  //Take id from user and based on id we will name of student
					  System.out.println("Please enter Student ID");
					  id = sc.nextInt();			
					  System.out.println("Please enter Student Name");
					  name = sc.next();	
					  ss.updateData(id, name);

					  break;
				case 4:
					  ss.fetchData(); //Fetch All students records
					  break;
				case 5:
					  status = false;//exit program
					  System.exit(0);
					  break;
				default:
					  System.out.println("Please Select valid Option");
					  break;
			}
			
			//Ask user wants to continue or no
			do {
				System.out.println("\nWould you like to Continue? Y / N");
				String str = sc.next();
				if(str.startsWith("n")) {
					status = false;
				}
				else if(str.startsWith("y")) {
					break;		
				}
				
				
			}while(status);
			
		}while(status);
		
		
	}
	
}
