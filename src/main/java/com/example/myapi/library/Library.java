package com.example.myapi.library;
import java.util.Scanner;

public class Library {

    final private Scanner input = new Scanner(System.in);

    private int totalContainers;
    private int booksForContainer;
    private Book[] availableBooks;

    public Library() {}

    public Library(int totalContainers, int booksForContainer) {
        this.totalContainers = totalContainers;
        this.booksForContainer = booksForContainer;
        this.availableBooks = new Book[this.totalContainers * this.booksForContainer];
        int count = 0;
        for (int i = 0; i < this.totalContainers; i++) {
            for (int j = 0; j < this.booksForContainer; j++) {
                System.out.print("ID: ");
                int id = input.nextInt();
                this.availableBooks[count] = new Book(id,"name", "author", "genre", 1, 2, i+j);
                count++;
            }
        }
    }

    public int getTotalContainers() { return totalContainers; }

    public void setToalContainers(int totalContainers) {
        this.totalContainers = totalContainers;
    }

    public int getBooksForContainer() { return booksForContainer; }

    public void setBooksForContainer(int booksForContainer) {
        this.booksForContainer = booksForContainer;
    }

    public Book[] getAvailableBooks() { return availableBooks; }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }
}













