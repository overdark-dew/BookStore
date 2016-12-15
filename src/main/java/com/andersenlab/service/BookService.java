package com.andersenlab.service;

import com.andersenlab.model.Book;

import java.util.List;

/**
 * Created by Alex108 on 10.10.2016.
 */
public interface BookService {

    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();

}
