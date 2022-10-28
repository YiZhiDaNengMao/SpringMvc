package com.star.controller;

import com.star.pojo.Book;
import com.star.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        Boolean flag = bookService.save(book);
        return new Result(flag,flag?Code.SAVE_OK:Code.SAVE_ERR,"");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Boolean flag = bookService.delete(id);
        return new Result(flag,flag?Code.DELETE_OK:Code.DELETE_ERR,"");
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        Boolean flag = bookService.update(book);
        return new Result(flag,flag?Code.UPDATE_OK:Code.UPDATE_ERR,"");
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Result findById(@PathVariable Integer id) {
        /*try {
            int i = 1/0;
        } catch (Exception e) {
            throw new SystemException
                    ("BUSINESS_ERR", Code.BUSINESS_ERR);
        }*/
        Book book = bookService.findById(id);
        Integer code = (book != null) ? Code.SELECT_OK : Code.SELECT_ERR;
        return new Result(book,code,"");
    }

    @GetMapping
    public Result findAll() {
        List<Book> all = bookService.findAll();
        Integer code = (all != null) ? Code.SELECT_OK : Code.SELECT_ERR;
        return new Result(all,code,"");
    }

}
