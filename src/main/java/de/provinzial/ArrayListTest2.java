package de.provinzial;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest2 {

    private final BookRepository repo = new BookRepository();

    private final Scanner scanner = new Scanner(System.in);

    private static final String TBL_ROW = "| %-4s | %-20s | %-20s | \n";

    public static void main(String[] args) {
        new ArrayListTest2().start();
    }

    private void start() {

        String input;

        app: while(true) {

            System.out.print("Eingabe: ");
            input = scanner.nextLine().trim().toLowerCase();

            switch(input) {

                case "n":
                    if(repo.insert(createBook())) {
                        System.out.println("Buch wurde gespeichert");
                    }
                    break;

                case "l": printBooks();
                    break;

                case "q":
                    break app;

                default:
                    System.out.println("Falsche Eingabe");
            }
        }

        System.out.println("Programmende");
    }

    private Book createBook() {
        Book book = new Book();
        System.out.print("Titel: ");
        book.setTitle(scanner.nextLine());

        System.out.print("Beschreibung: ");
        book.setDescription(scanner.nextLine());
        return book;
    }

    private void printBooks() {

        System.out.printf(TBL_ROW, "NR", "TITEL", "BESCHREIBUNG");
        System.out.println("----------------------------------------------------------");

        List<Book> books = repo.find();
        Collections.sort(books); // Verwendet automatisch compareTo = Natürliche Reihenfolge

        for(Book b : books) {
            System.out.printf(TBL_ROW, b.getNr(), b.getTitle(), b.getDescription());
        }

        System.out.println();
    }


    /*
    public static void main(String[] args) {

        // Referenztyp          // Objekttyp
        List<Book> books = new ArrayList<>();

        // Referenztyp darf eine Klasse, ein Interface oder eine abstrakte Klasse sein
        // Objekttyp MUSS eine konkrete Klasse sein

        Scanner scanner = new Scanner(System.in);

        while(true) {

            Book book = new Book();
            System.out.print("Titel: ");
            book.setTitle(scanner.nextLine());

            System.out.print("Beschreibung: ");
            book.setDescription(scanner.nextLine());

            if(books.add(book)) {
                System.out.println("Buch wurde gespeichert");
            }

            System.out.println(books);
        }
    }
    */



}
