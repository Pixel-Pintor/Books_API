package com.example.myapi.library;

public class Book {

    private int id;
    private String bookName, author, genre;
    int pubYear, numPages, price;

    public Book() {}

    public Book(int id, String bookName, String author, String genre, int pubYear, int numPages, int price) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.pubYear = pubYear;
        this.numPages = numPages;
        this.price = price;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() { return bookName; }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() { return author; }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() { return genre; }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPubYear() { return pubYear; }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getNumPages() { return numPages; }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getPrice() { return price; }

    public void serPrice(int price) {
        this.price = price;
    }
}
