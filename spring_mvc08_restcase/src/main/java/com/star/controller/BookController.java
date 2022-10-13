package com.star.controller;

import com.star.pojo.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping
    public String addBook(@RequestBody Book book) {
        System.out.println("addBook ..." + book);
        return "{'module':'addBook'}";
    }

    @GetMapping
    public List<Book> getAll() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"《猪霸天的自我修养》"));
        books.add(new Book(2,"《牛破天的自我修养》"));
        books.add(new Book(3,"《龙傲天的自我修养》"));
        return books;
    }
}
