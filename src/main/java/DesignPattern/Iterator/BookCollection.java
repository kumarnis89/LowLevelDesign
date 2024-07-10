package DesignPattern.Iterator;

import java.util.List;

public class BookCollection {
    List<Book> bookList = null;

    public BookCollection() {
    }

    public BookCollection(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Iterator<Book> iterator(){
        return new BookIterator(this);
    }
}
