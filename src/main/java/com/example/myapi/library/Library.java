package com.example.myapi.library;
import java.util.Scanner;

public class Library {

    private final Scanner input = new Scanner(System.in);

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
                int id = inputBookId();
                String bookName = inputBookName();
                String author = inputBookAuthor();
                String genre = inputBookGenre();
                int pubYear = inputPubYear();
                int numPages = inputNumPages();
                int price = inputBookPrice();
                this.availableBooks[count] = new Book(id, bookName, author, genre, pubYear, numPages, price);
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

    public int inputBookId() {
        System.out.print("ID: ");
        return Integer.parseInt(input.nextLine());
    }

    public String inputBookName() {
        System.out.print("Book name: ");
        return input.nextLine();
    }

    public String inputBookAuthor() {
        System.out.print("Author: ");
        return input.nextLine();
    }

    public String inputBookGenre() {
        System.out.print("Genre: ");
        return input.nextLine();
    }

    public int inputPubYear() {
        System.out.print("Publication Year: ");
        return Integer.parseInt(input.nextLine());
    }

    public int inputNumPages() {
        System.out.print("Number of pages: ");
        return Integer.parseInt(input.nextLine());
    }

    public int inputBookPrice() {
        System.out.print("Book price: ");
        return Integer.parseInt(input.nextLine());
    }
}













