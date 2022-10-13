package com.star.service;

import com.star.pojo.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);

    Boolean delete(Integer id);

    Boolean update(Book book);

    Book findById(Integer id);

    List<Book> findAll();
}
