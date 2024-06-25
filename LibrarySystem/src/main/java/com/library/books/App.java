package com.library.books;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<bookoption> books = new ArrayList<>();
        ArrayList<newUser> users = new ArrayList<>();
        
        while(true) {
        	System.out.println("Enter 1 to create a new USER.");
        	System.out.println("Enter 2 to add a new BOOK.");
        	System.out.println("Enter 3 to display all USERS");
        	System.out.println("Enter 4 to display all the BOOKS in the library");
        	System.out.println("Enter 5 to EXIT THE PROGRAM :)");
        	int choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1:
        		newUser user = new newUser();
        		users.add(user);
        		System.out.println("NEW USER CREATED: " + user);
        		break;
        		
        	case 2: 
        		bookoption book = new bookoption();
        		books.add(book);
        		System.out.println("NEW BOOK CREATED: "+ book);
        		break;
        		
        	case 3:
        		if(users.isEmpty()) {
        			System.out.println("No Users in the database... ");
        		}
        		else {
        			System.out.println("Displaying all the USERS: ");
            		for(newUser u : users) {
            			System.out.println(u);
            		}
        		}
        		break;
        		
        	case 4:
        		if(books.isEmpty()) {
        			System.out.println("Sad :(.... NO BOOKS IN THE LIBRARY!!");
        		}
        		else {
        			System.out.println("Displaying all the BOOKS in the library..");
            		for(bookoption b : books) {
            			System.out.println(b);
            		}
        		}
          		break;
        		
        	case 5:
        		System.out.println("EXITITNG THE PROGRAM.... SEE YOU AGAIN !!!! :)");
        		sc.close();
        		return;
        		
        	default:
        		System.out.println("INVALID INPUT. PLEASE TRY AGAIN!!");
        		break;
        	}
        	        	
        }
    }
}
