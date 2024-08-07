package DesignPattern.Iterator;

public class Book {
    private String name;
    private String Author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        Author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
