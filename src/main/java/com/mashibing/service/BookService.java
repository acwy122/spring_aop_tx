package com.mashibing.service;

import com.mashibing.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;


    /**
     * propagation:传播特性,表示不同的事物之间的关系,当一个事物被另一个事物方法调用时,这个事物方法应该如何进行
     * isolation:隔离级别:4种隔离级别,会引发不同的数据错乱问题,mysql的四种隔离级别
     * timeout:超时时间
     * readonly:只读事物,如果配置了只读事物,那么在事物运行期间,不允许对数据进行修改,否则抛出异常
     * noRollBackfor:设置哪些事物不回滚,(noRollbackFor = {ArithmeticException.class}),
     * 设置哪些异常不会回滚
     *
     * noRollBackForClassName:设置哪些事物不回滚,
     * @Transactional(noRollbackForClassName = {"java.lang.ArithmeticException"})
     * RollBackfor:设置哪些异常回滚
     * @Transactional(rollbackFor = {FileNotFoundException.class})
     * RollBackForClassName:设置哪些异常回滚
     *@Transactional(rollbackForClassName = {"java.io.FileNotFoundException"})
     */
//    @Transactional(timeout = 4)
//    @Transactional(readOnly = true)
    @Transactional(propagation = Propagation.REQUIRED)
    public void buyBook() {
        bookDao.getprice(1);
        bookDao.updateBalance("zhangsan",100);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        /*try{
            int i=1/0;
        }catch(Exception e){
            e.printStackTrace();
        }*/

        bookDao.updateStock(1);
        int i=1/0;

//        new FileInputStream("aaa.txt");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void updatePrice(){
        bookDao.updatePrice(1);
    }
}
