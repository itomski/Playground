package de.provinzial;

public class LiteralTest {

    // Instanz und Klassenvariablen werden mit den Standardwerten initialisiert
    private int x;
    private static int y;


    public static void main(String[] args) {

        int i = 100; // 100 ist ein Literal
        String s = "Hi"; // Hi ist ein Literal - Landet im Pool
        String s2 = new String("Hi"); // Landet NICHT im Pool

        // Wertvergleich
        System.out.println(i == 200); // false
        System.out.println(i == 100); // true

        // Referenzvergleich: ist s und "Hi" das gleiche Objekt auf dem Heap?
        System.out.println(s == "Hi"); // true
        System.out.println(s == s2); // false

        // Wertvergleich
        System.out.println(s.equals(s2)); // true

        System.out.println();

        Object o1 = new Object();
        Object o2 = new Object();

        // Referenzvergleich
        System.out.println(o1 == o2);

        // Wertevergleich
        System.out.println(o1.equals(o2));

        System.out.println();

        Book b1 = new Book("Kochen ohne Fett", "...", 200, "12345678910", "Ike Inc");
        Book b2 = new Book("Kochen ohne Fett", "...", 200, "12345678910", "Ike Inc");

        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        int j;
        //System.out.println(j); // Error: j ist nicht initialisiert
        System.out.println(y); // OK

        long l = 10; // primitive widening von int zu long
        byte b = 10;
        l = b; // primitive widening von byte zu long

        //b = l; // primitive narrowing von long zu byte - kann NICHT automatisch erfolgen
        b = (byte)l; // cast

        b = 127;
        b++; // b = (byte) (b + 1); // Überlauf
        b++;
        b++;
        System.out.println(b);

        b = 127;
        b += 2; // b = (byte)(b + 2) // Überlauf

        //long l2 = 10_000_000_000; // Error: das Literal ist ein int
        long l2 = 10_000_000_000l; // das Literal ist ein long
    }
}
