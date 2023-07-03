package de.provinzial;

import java.time.LocalDate;

public class Start {

    public static void main(String[] args) {

        int i = 10;
        var j = 100; // Typ wird auf int festgelegt
        i = 200;

        System.out.println("Hallo Münster! " + i);
        LocalDate datum = LocalDate.now();
        System.out.println(datum);

        System.out.println();

        Book b1 = new Book(); // Aus einer Klasse wird ein Objekt gebaut
        b1.isbn = "1015-2217-1234";

        Book b2 = new Book("Backen ohne Mehl", /* bla bla bla */ "Bla bla bla", 100, "1234-5678-91011", "Brohler Inc");
        System.out.println(b2); // aufruf der toString()-Methode
        //System.out.println(b2.toString());
        //b2 = null;

        b1.pages = 300;
        b1.pages = -200;

        //b1.title = "Kochen ohne Fett";
        //System.out.println(b1.title);

        System.out.println(b1.getTitle());

        b1.setTitle("Kochen ohne Fett!");
        System.out.println(b1.getTitle());


    }
}
