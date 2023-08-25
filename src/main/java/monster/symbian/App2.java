package monster.symbian;

import monster.symbian.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //获取ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao)applicationContext.getBean("bookDao");
//        bookDao.addBook();
        BookService bookService1 = (BookService)applicationContext.getBean("bookService2");
        BookService bookService2 = (BookService)applicationContext.getBean("bookService2");
        bookService1.addBook();
        System.out.println(bookService1);
        System.out.println(bookService2);





    }
}
