package de.provinzial;

import java.util.Random;

public class RandTest {

    public static void main(String[] args) {

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        int r1 = (int) ((Math.random() * 6) + 1); // primitive narrowing von double auf int

        int r2 = genRand(); // Verwendung der Methode
        int r3 = genRand();
        int r4 = genRand();
        int r5 = genRand();

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        System.out.println(genRand()); // sofortige Ausgabe
        System.out.println(genRand());
        System.out.println(genRand());
        System.out.println(genRand());
        System.out.println(genRand());

        System.out.println();

        Random generator = new Random();

        System.out.println(generator.nextInt(6) + 1);
        System.out.println(generator.nextInt(6) + 1);
        System.out.println(generator.nextInt(6) + 1);
        System.out.println(generator.nextInt(6) + 1);

        // Seit Java 1.8
        // generator.ints().limit(100).forEach(System.out::println);

    }

    // Liefert eine Ganzzahl (int) zurück
    public static int genRand() { // Deklaration der Methode
        // return: gibt den Wert zurück
        return (int) ((Math.random() * 6) + 1);
    }

}
