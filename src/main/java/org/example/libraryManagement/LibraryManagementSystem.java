package org.example.libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem() {
        this.bookInventory = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public void printUserDetails() {
        System.out.println("User Details:");
        for(User user: registeredUsers) {
            System.out.println("User name: " + user.getName());
        }
    }

    public void printBookDetails() {
        System.out.println("Book Details:");
        for(Book book: bookInventory) {
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
            // Can print more Book details if needed
        }
    }
}
