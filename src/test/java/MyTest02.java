import com.mashibing.service.BookService;
import com.mashibing.service.MultService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class MyTest02 {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test01() throws FileNotFoundException {

        BookService bean = context.getBean(BookService.class);
        bean.buyBook();
    }

    @Test
    public void test02() {

        MultService bean = context.getBean(MultService.class);
        bean.mult();
    }



}
