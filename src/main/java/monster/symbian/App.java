package monster.symbian;

import monster.symbian.service.BookService;
import monster.symbian.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.addBook();
    }
}
