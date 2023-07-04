package de.provinzial;

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


    }

}
