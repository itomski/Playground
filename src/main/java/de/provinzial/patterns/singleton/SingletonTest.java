package de.provinzial.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonTest {

    public static void main(String[] args) {

        //EagerSingleton es1 = new EagerSingleton();
        //EagerSingleton es2 = new EagerSingleton();
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();

        System.out.println(es1 == es2);
        es1.setZahl(10);
        System.out.println(es2.getZahl());

        List<String> list = new ArrayList<>();
        machWas(list);

        machWasAnderes();
        System.out.println(es1.getZahl());
    }

    // Normale Objekte müssen als Parameter an Methoden übergeben werden
    private static void machWas(List<String> list) {
        list.add("Peter");
    }

    // Singletons brauchen nicht als Parameter weitergegeben zu werden
    private static void machWasAnderes() {
        EagerSingleton.getInstance().setZahl(100);
    }
}
