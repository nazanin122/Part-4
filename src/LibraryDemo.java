/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author naz
 */
public class LibraryDemo {



    public static void main(String[] args) {
        
        Book book1 = new Book("Smile", "Raina Telgemeier", 17.99, "Scholastics", "978-1-12345678-1");
        Book book2 = new Book("The Lord of the Rings", "John Ronald Reuel Tolkien", 39.99, "Harper Collins", "978-2-21234567-2");
        Book book3 = new Book("Harry Potter", "J.K Rowling", 14.99, "Bloomsbury", "978-3-31234567-3");
        Book book4 = new Book("Nineteen Eighty-Four", "George Orwell", 29.89, "Secker & Warburg", "978-4-41234567-4");
        Book book5 = new Book("The Little Prince", "Antoine de Saint-Exupery", 16.00, "Reynal & Hitchcock", "978-5-51234567-5");

        Book[] library = new Book[5];  
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;
        library[4] = book5;

        System.out.println("All Books in the Library:");
        printLibrary(library);

        String keyword = "Smile";
        System.out.println("\nSearch Results for keyword: \"" + keyword + "\"");
        searchBooks(library, keyword);

        System.out.println("\nUpdating the price of 'Smile'...");
        book1.setPrice(34.99);  
        System.out.println(book1.toString());  

        System.out.println("\nCreating a copy of 'Lord of the Rings'...");
        Book clonedBook = new Book(book2);  
        System.out.println("Cloned Book:");
        System.out.println(clonedBook.toString());  
    }

    public static void printLibrary(Book[] library) {
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].toString());
            System.out.println();  
        }
    }

    public static void searchBooks(Book[] library, String keyword) {
        boolean found = false;
        for (int i = 0; i < library.length; i++) {
            if (library[i].getTitle().contains(keyword) || library[i].getAuthor().contains(keyword)) {
                System.out.println(library[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found for the keyword: " + keyword);
        }
    }
}
