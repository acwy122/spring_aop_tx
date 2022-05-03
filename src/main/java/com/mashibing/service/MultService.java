package com.mashibing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MultService {

    @Autowired
    private  BookService bookService;

    @Transactional
    public void mult() {
        bookService.updatePrice();
        bookService.buyBook();

    }

}
