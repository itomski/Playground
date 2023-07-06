package de.provinzial;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ExceptionTest3 {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.GERMAN);

        Scanner scanner = new Scanner(System.in);

        System.out.print(bundle.getString("msg.question"));

        int zahl = scanner.nextInt();

        try {
            check(zahl);
        }
        catch (ZuKleinException e) {
            System.out.println(bundle.getString("msg.small"));
            // Bietet die Möglichkeit unterschiedlicher Behandlung
        }
        catch (ZuGrossException e) {
            System.out.println(bundle.getString("msg.big"));
        }

    }

    private static void check(int zahl) throws ZuGrossException, ZuKleinException {

        if(zahl < 0) {
            // throw new Exception("Zu klein");
            throw new ZuKleinException();
        }
        else if (zahl > 100) {
            //throw new Exception("Zu groß");
            throw new ZuGrossException();
        }

        System.out.printf("Super... die %d wäre auch meine Wahl :-) \n", zahl);
    }
}

class ZuKleinException extends Exception {
}

class ZuGrossException extends Exception {
}
