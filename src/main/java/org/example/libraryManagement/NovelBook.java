package org.example.libraryManagement;

class NovelBook extends Book {
    private String genre;

    // Parameterized constructor
    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook - ISBN: " + this.getIsbn() + ", Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", Genre: " + genre);
    }
}