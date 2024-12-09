/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author naz
 */

public class Library {
    
    
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public Library(Library other) {
        this.books = new ArrayList<>(other.books);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> results = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) || 
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(book); 
            }
        }

        return results; 
    }

    public void printLibrary() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString()); 
                System.out.println();
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
