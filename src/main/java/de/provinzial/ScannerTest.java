package de.provinzial;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        int inputZahl;
        double inputZahl2;

        while(true) {

            System.out.print("Eingabe: ");
            input = scanner.next(); // Zeichenkette bis zum ersten Leerzeichen
            System.out.println(input);

            scanner.nextLine(); // fix, leert die restliche Eingabe

            System.out.print("Eingabe: ");
            input = scanner.nextLine(); // Zeichenkette
            System.out.println(input);

            System.out.print("Zahl: ");
            inputZahl = scanner.nextInt(); // Ganzzahl
            System.out.println(inputZahl);

            System.out.print("Zahl: ");
            inputZahl2 = scanner.nextDouble(); // Fließkommazahl
            System.out.println(inputZahl2);

            System.out.print("Ende? ");
            input = scanner.next();

            if(input.equalsIgnoreCase("ja")) { //
                System.exit(0); // Programm verlassen
            }
        }


    }

}
