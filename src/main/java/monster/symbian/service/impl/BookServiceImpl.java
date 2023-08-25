package monster.symbian.service.impl;

import monster.symbian.dao.BookDao;
import monster.symbian.service.BookService;

public class BookServiceImpl implements BookService {
     private BookDao bookDao;
    public void addBook(){
        System.out.println("Add book in service");
        bookDao.addBook();
    }
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
