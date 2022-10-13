package com.star.service.impl;

import com.star.controller.Code;
import com.star.dao.BookDao;
import com.star.controller.exception.SystemException;
import com.star.pojo.Book;
import com.star.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.delete(id);
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public Book findById(Integer id) {
        //将来有可能出现的业务异常,进行包装
        /*try {
            int i = 1/0;
        } catch (Exception e) {
            //调用自定义异常类中的构造方法
            throw new SystemException
                    ("服务器访问超时,请重试", Code.SYSTEM_TIMEOUT_ERR);
        }*/
        return bookDao.finById(id);
    }


    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

}
