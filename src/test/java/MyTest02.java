import com.mashibing.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test01(){

        BookService bean = context.getBean(BookService.class);
        bean.buyBook();
    }
}
