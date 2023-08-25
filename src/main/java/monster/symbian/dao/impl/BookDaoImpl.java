package monster.symbian.dao.impl;

import monster.symbian.dao.BookDao;

public class BookDaoImpl implements BookDao{

    private BookDaoImpl(){
        System.out.println("BookDaoImpl constructor");
    }

    public void addBook(){
        System.out.println("Add book in  dao");
    }
}
