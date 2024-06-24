package com.library.books;

import java.util.*;

public class newUser {
	
	public int UID;
	public String Username, email;
	
	Scanner sc = new Scanner(System.in);
	
	public newUser() {
		System.out.println("Enter User ID:");
        this.UID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the customer name:");
        this.Username = sc.nextLine();

        System.out.println("Enter the customer's E-mail:");
        this.email = sc.nextLine();
	}
}

