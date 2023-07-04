package de.provinzial;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {

        String s = "Hallo ";
        s = s + "Welt";

        s = s.toUpperCase();
        System.out.println(s);

        String namen = String.join(", ", "Peter", "Carol", "Tony", "Bruce");
        System.out.println(namen);

        final String TBL = "| %10s | %10s | %-10s | %10.2f | \n";

        namen = String.format(TBL, "Peter", "Carol", "Tony", 100.9965);
        System.out.println(namen);

        System.out.printf(TBL, "Tony", "Natasha", "Steve", 2500.9965); // sofortige ausgabe

        String input = "rrruurroollxyz";

        String[] dirs = input.split("");
        System.out.println(Arrays.toString(dirs));

        for(String dir : dirs) {
            if(dir.equalsIgnoreCase("r")) {
                System.out.println("rechts");
            }
            else if(dir.equalsIgnoreCase("l")) {
                System.out.println("links");
            }
            else if(dir.equalsIgnoreCase("o")) {
                System.out.println("oben");
            }
            else if(dir.equalsIgnoreCase("u")) {
                System.out.println("unten");
            }
            else {
                System.out.println("Richtung unbekannt");
            }
        }
    }

}
