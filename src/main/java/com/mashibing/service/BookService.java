package com.mashibing.service;

import com.mashibing.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional
    public void buyBook(){
        bookDao.getprice(1);
        bookDao.updateBalance("zhangsan",100);
        int i=1/0;
        bookDao.updateStock(1);
    }

}
