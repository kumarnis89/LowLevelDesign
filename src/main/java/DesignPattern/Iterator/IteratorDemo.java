package DesignPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Introduction to C++","Yashvanth Kanetkar");
        Book book2 = new Book("Introduction to Java","Herbert Schildt");
        bookList.add(book1);
        bookList.add(book2);

        BookCollection bc = new BookCollection(bookList);

        Iterator<Book> itr = bc.iterator();

        while(itr.hasNext()){
            Book b = itr.next();
            System.out.println(b.getName() + " - " + b.getAuthor());
        }
    }
}
