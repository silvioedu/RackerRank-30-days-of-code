package com.silvio.day13;

import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {

    int price=0;

    public MyBook(String title, String author, int price) {
        super(title,author);
        this.price = price;
    }

    public void display() {
        System.out.format("Title: %s\n",this.title);
        System.out.format("Author: %s\n",this.author);
        System.out.format("Price: %d\n",this.price);
    }
}

class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
