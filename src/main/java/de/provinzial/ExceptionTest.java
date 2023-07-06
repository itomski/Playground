package de.provinzial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionTest {

    public static void main(String[] args) {

        String s1 = null;
        String s2;

        System.out.println(s1);
        // System.out.println(s2); // nicht initialisiert

        // NullPointerException: unchecked
        // Die Exception bricht das Programm sofort ab, wenn sie nicht behandelt wird
        //System.out.println(s1.substring(2)); // substring liefert den Inhalt ab Index 2

        // NIO
        Path p = Paths.get("data.txt");
        // Exception MUSS behandelt werden
        // IOException: checked
        try {
            List<String> lines = Files.readAllLines(p); // Die Zeilen der Datei einlesen
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Ende");

    }

}
