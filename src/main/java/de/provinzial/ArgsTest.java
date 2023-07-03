package de.provinzial;


//import java.util.ArrayList;
//import java.util.Date;
import java.util.*;
import java.util.function.*; // Sub-Packages werden extra importiert
import static java.lang.Math.PI; // Importiert die Statische Eigenschaft PI
import static java.lang.Math.pow; // Importiert die Statische Methode
import static de.provinzial.Wochentag.*; // Importiert die Optionen des Enums

public class ArgsTest {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        Date d1 = new Date();
        //java.sql.Date d2 = new java.sql.Date();

        ArrayList list;

        double pi = Math.PI;
        // Verwendung einer Eigenschaft, die statisch importiert wurde
        pi = PI;

        // Verwendung einer Methode, die statisch importiert wurde
        System.out.println(pow(10,10));

        Wochentag tag1 = Wochentag.DI;
        Wochentag tag2 = DI;

    }
}
