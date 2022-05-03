package com.mashibing.dao;

import com.mashibing.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 减去某个用余额
     */
    public void updateBalance(String name,Integer price){
        String sql = "update account set balance = balance-? where username=?";
        jdbcTemplate.update(sql,price,name);
    }

    /**
     * 按照图书得id来获取图书的价格
     */
    public void getprice(int id){
        String sql = "select price from book where id=?";
        jdbcTemplate.queryForObject(sql,Integer.class,id);
    }

    /**
     * 减去库存,减去某本书的库存
     */
    public void updateStock(int id){
        String sql = "update book_stock set stock=stock-1 where id=?";
        jdbcTemplate.update(sql,id);
    }
}
