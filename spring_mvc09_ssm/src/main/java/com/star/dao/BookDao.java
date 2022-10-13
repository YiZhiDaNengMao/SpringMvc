package com.star.dao;

import com.star.pojo.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
public interface BookDao {
    @Insert("insert into tbl_book(type,name,description) values(#{type},#{name},#{description})")
    Boolean save(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    Boolean delete(Integer id);

    @Update("update tbl_book set type=#{type}, name=#{name}, description=#{description} where id=#{id}")
    Boolean update(Book book);

    @Select("select * from tbl_book where id = #{id}")
    Book finById(Integer id);

    @Select("select * from tbl_book")
    List<Book> findAll();
}
