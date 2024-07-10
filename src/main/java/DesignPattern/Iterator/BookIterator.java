package DesignPattern.Iterator;

public class BookIterator implements Iterator<Book>{
    private int index;
    BookCollection bookCollection;

    public BookIterator() {
    }

    public BookIterator(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
    }

    @Override
    public boolean hasNext() {
        return index<bookCollection.getBookList().size();
    }

    @Override
    public Book next() {
        return bookCollection.getBookList().get(index++);
    }
}
