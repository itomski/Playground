package de.provinzial;

public class KontrollstrukturenTest {

    public static void main(String[] args) {

        int i = 10;

        String str = i > 5 ? "OK" : "NICHT OK!";
        System.out.println(str);

        System.out.println(i > 5 ? "OK" : "NICHT OK!");

        if(i > 5) {
            System.out.println("OK");
        }
        else {
            System.out.println("NICHT OK");
        }

        i = 3;

        if(i > 5) {
            System.out.println("OK");
        }
        else if (i > 2){
            System.out.println("SEMI OK");
        }
        else{
            System.out.println("NICHT OK");
        }

        Wochentag tag = Wochentag.SA;

        switch (tag) {
            case MO:
            case DI:
            case MI:
            case DO:
            case FR:
                System.out.println("Arbeit");
                break;
            case SA:
            case SO:
                System.out.println("Wochenende");
                break;
        }

        /*
        for(;;) {
            System.out.println("...");
        }
        */

        for(int j = 0; j < 100; System.out.println(++j));

    }

}
