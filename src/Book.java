/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naz
 */
public class Book {
    
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.publisher = "Unknown Publisher";
        this.isbn = "Unknown ISBN";
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown Author";
        this.price = 0.0;
        this.publisher = "Unknown Publisher";
        this.isbn = "Unknown ISBN";
    }

    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.publisher = other.publisher;
        this.isbn = other.isbn;
    }


    public int checkIsbnStatus() {
        if (isbn.length() == 13 && isbn.startsWith("978")) {
            return 1; 
        } else if (isbn.length() == 10 && isbn.indexOf("-") != -1) {
            return 0; 
        } else {
            return -1; 
        }
    }

    public void toTitleCase() {
        this.title = toTitleCaseHelper(this.title);
        this.author = toTitleCaseHelper(this.author);
    }

    private String toTitleCaseHelper(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    public String toString() {
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Price: " + price + "\n" +
               "Publisher: " + publisher + "\n" +
               "ISBN: " + isbn;
    }

    public boolean equals(Book other) {
        return this.title.equals(other.title) && this.author.equals(other.author) &&
               this.price == other.price && this.publisher.equals(other.publisher) && this.isbn.equals(other.isbn);
    }

    public Book clone() {
        return new Book(this.title, this.author, this.price, this.publisher, this.isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
