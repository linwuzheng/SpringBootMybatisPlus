package com.lxh.dao;

import com.lxh.dao.BookDao;
import com.lxh.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(4));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("新增类型1");
        book.setName("新增名字1");
        book.setDescription("新增描述1");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(5);
        book.setType("更新类型1");
        book.setName("新增名字1");
        book.setDescription("新增描述1");
        bookDao.updateById(book);
    }
    @Test
    void testDelete() {
        bookDao.deleteById(4);
    }
    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

}
