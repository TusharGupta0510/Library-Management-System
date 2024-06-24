package com.library.books;

import java.util.*;

public class bookoption{
    public int sno;
    public String bookname;
    public String author;
    public int qty;
    public int qtycopy;

    Scanner sc = new Scanner(System.in);

    public bookoption() {
        System.out.println("enter book number");
        this.sno = sc.nextInt();
        sc.nextLine();

        System.out.println("enter book name");
        this.bookname = sc.nextLine();

        System.out.println("enter book author name");
        this.author = sc.nextLine();

        System.out.println("enter quantity");
        this.qty = sc.nextInt();
        qtycopy = this.qty;
    }
}