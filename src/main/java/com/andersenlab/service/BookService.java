package com.andersenlab.service;

import com.andersenlab.model.Book;

import java.util.List;


public interface BookService {

    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();

}
