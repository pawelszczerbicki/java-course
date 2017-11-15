package com.company.gdansk.library;

import java.util.Arrays;
import java.util.List;

public class Book {
    private List<Author> authors;
    private String title;
    private int price;


    public Book(Author author, String title) {
        this.authors = Arrays.asList(author);
        this.title = title;
    }

    public Book(List<Author> authors, String title) {
        this.authors = authors;
        this.title = title;
    }

    public Book(Author authors, String title, int price) {
        this.authors = Arrays.asList(authors);
        this.title = title;
        this. price = price;
    }

    public Book(String name, String surname, String title) {
        this.authors = Arrays.asList(new Author(name, surname));
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
