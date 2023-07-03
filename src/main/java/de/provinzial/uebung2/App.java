package de.provinzial.uebung2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.print("Welcher Würfel? ");
            int seiten = scanner.nextInt();

            System.out.print("Anzahl Würfel? ");
            int anzahl = scanner.nextInt();

            int[] results = DiceCup.roll(seiten, anzahl);
            System.out.println(Arrays.toString(results));
        }


        //int[] results = DiceCup.roll(6, 100);
        //System.out.println(Arrays.toString(results));

    }



}
