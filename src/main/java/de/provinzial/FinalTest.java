package de.provinzial;

public class FinalTest {

    public static void main(String[] args) {

        // Kompiletime Konstante
        final boolean x = true;
        System.out.println("Wert " + x);
         //x = false; // Änderung nicht mehr möglich

        // Runtime-Konstante
        final boolean z;
        z = true;
        // z = false; // Änderung nicht mehr möglich
        System.out.println("Wert " + z);

        //while(x) { // Kompiler kennt den Wert
        //}

        //while(z) { // Kompiler kennt nur den Datentyp
        //}

        //System.out.println("Ende");

        final Book book = new Book();
        //book = new Book(); // Neuzuweisung ist nicht mehr möglich
        book.setTitle("Backen ohne Mehl"); // Zustand des Objektes darf sich ändern
        // Referenz nicht!

        //Math m = new Math();
        double erg = Math.pow(10,15);

        // Utility-Klasse können nicht instanziert werden und bieten nur statische Methoden an
        // Arrays // Utility-Klasse für Arrays
        // Collections // Utility-Klasse für Collections

    }
}
