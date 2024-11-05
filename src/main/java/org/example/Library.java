package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBooks(Book book) {
    books.add(book);
  }

  public List<Book> searchByTitle(String title) {
    List<Book> results = new ArrayList<>();
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title) ) {
        results.add(book);
      }
    }
    return results;
  }

  public List<Book> searchByAuthor(String author) {
    List<Book> results = new ArrayList<>();
    for (Book book : books) {
      if (book.getAuthor().equalsIgnoreCase(author) ) {
        results.add(book);
      }
    }
    return results;
  }

  public Book searchByNumber(int number) {
    for (Book book : books) {
      if (book.getNumber() == number ) {
        return book;
      }
    }
    return null;
  }
}
