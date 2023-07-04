package de.provinzial.uebung3;

import java.util.Locale;
import java.util.Scanner;

public class App {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new App().go();
    }

    private void go() {

        System.out.print("Wie groß soll das Spielfeld sein? ");
        int size = scanner.nextInt();
        Board board = new Board(size);
        scanner.nextLine(); // fix

        System.out.print("Wie soll der Roboter heißen? ");
        String name = scanner.nextLine();
        Robot bot = new Robot("name", board);

        app: while(true) {

            System.out.print("Bewegungssequenz: ");
            String seq = scanner.nextLine().trim().toLowerCase();

            if(seq.equals("exit")) break app;

            String[] seqArr = seq.split("");
            for(String command : seqArr) {

                switch(command) {

                    case "r":
                        bot.moveRight();
                        break;

                    case "l":
                        bot.moveLeft();
                        break;

                    case "o":
                        bot.moveTop();
                        break;

                    case "u":
                        bot.moveDown();
                        break;
                }
            }
        }

    }
}
