package de.provinzial;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public boolean insert(Book book) {
        return books.add(book);
    }

    public boolean update(Book book) {
        throw new UnsupportedOperationException("Ist noch nicht implementiert");
    }

    public boolean delete(Book book) {
        throw new UnsupportedOperationException("Ist noch nicht implementiert");
    }

    public List<Book> find() {
        return books;
    }

    public Book find(int id) {
        throw new UnsupportedOperationException("Ist noch nicht implementiert");
    }
}
