package de.provinzial;

import de.provinzial.uebung3.Board;

public class ScopeTest2 {

    public static void main(String[] args) {

        int i = 10;

        //int i = 100; // Error: redeklaration, Variable ist noch sichtbar

        if(true){
            int j = 10000;
        }

        int j = 10;

        {
            int[] arr = new int[10_000_000];
        }

        // System.out.println(arr); // arr ist nicht mehr verfügbar

        int k = 100;
        machWas(k); // k wird als Kopie weitergegeben
        System.out.println(k);

        Container container = new Container();
        container.value = 10;
        machWas(container); // Wird als Referenz weitergegeben
        System.out.println(container.value);

        System.out.println("X" + (10 + 15));
        System.out.println("X" + 10 * 15);

        Object o = new Book();
        System.out.println(o instanceof Board);
        System.out.println(o instanceof Book);

    }

    static void machWas(int i) {
        i++; // die Kopie wird verändert
    }

    static void machWas(Container c) {
        c.value++;
    }
}

class Container {
    public int value;
}
