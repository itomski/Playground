package de.provinzial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        System.out.println("MAIN start");

        try {
            method1();
        }
        catch(RuntimeException e) {
            System.out.println("BEHANDELT MAIN");
        }

        System.out.println("MAIN ende");
    }

    static void method1() {
        System.out.println("M1: start");
        method2();
        System.out.println("M1: ende");
    }

    static void method2() {
        System.out.println("M2: start");
        try {
            method3();
        }
        catch(RuntimeException e) {
            System.out.println("BEHANDELT M2"); // Behandelt nur die RuntimeException
        }
        catch(IOException e) {
            System.out.println("BEHANDELT M2"); // Behandelt nur die IOException
        }
        catch(Exception e) {
            System.out.println("BEHANDELT M2"); // Behandelt alle Exceptions
        }
        System.out.println("M2: ende");
    }

    static void method3() throws IOException {
        System.out.println("M3: start");
        method4();
        System.out.println("M3: ende");
    }

    static void method4() throws IOException { // Gibt die IOException weiter nach oben
        System.out.println("M4: start");

        Path p = Paths.get("data.txt");
        List<String> lines = Files.readAllLines(p); // Exception - IOException (checked)

        System.out.println("M4: ende");
    }
}

