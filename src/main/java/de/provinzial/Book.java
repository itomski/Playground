package de.provinzial;

import java.util.Objects;

// Comparable sichert Vergleichbarkeit zu
public class Book implements Comparable<Book> {

    private static int count; // Alle Book-Objekte teilen sich gemeinsam diese Variable - sie steht im Bauplan

    private final int nr; // final: kann nach der ersten Zuweisung nicht mehr geändert werden

    private String title; // Instanzeigenschaften

    private String description;

    public int pages;

    public String isbn;

    private String publisher;

    //private Author author;


    public Book(String title, String description, int pages, String isbn, String publisher) {
        this(); // Aufruf des Parameterlosen Konstruktors
        // this.title = Instanzeigenschaft
        // title = Lokale Variable: Werden direkt in der Methode oder in der Parameterliste deklariert
        this.title = title;
        this.description = description;
        this.pages = pages;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book() {
        // count++; // increment postfix
        nr = ++count; // increment prefix
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public String toString() {

        return new StringBuilder("Book{")
            .append("nr=").append(nr)
            .append(", title=").append(title)
            .append(", description=").append(description)
            .append(", pages=").append(pages)
            .append(", isbn=").append(isbn)
            .append(", publisher=").append(publisher)
            .append("}")
            .toString();

        /*
        return "Book{" +
                "nr=" + nr +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", pages=" + pages +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';

         */
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(description, book.description) && Objects.equals(isbn, book.isbn) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, pages, isbn, publisher);
    }

    @Override
    public int compareTo(Book other) { // Natürliche Ordnung
        //return nr - other.nr;
        return title.compareTo(other.title);
    }
}
