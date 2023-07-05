package de.provinzial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        // ArrayList<Integer> zahlen = new ArrayList<>();
        List<Integer> zahlen = new ArrayList<>();
        //zahlen.add(10.2);
        //zahlen.add("10.2");
        zahlen.add(10);
        zahlen.add(15);
        zahlen.add(7);
        zahlen.add(9);
        zahlen.add(22);

        System.out.println(zahlen);

        for (int i : zahlen) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < zahlen.size(); i++) {
            System.out.println(zahlen.get(i));
        }

        System.out.println();

        zahlen = new LinkedList<>(zahlen); // Wechsel von ArrayList auf LinkedList

        zahlen.add(3, 200); // Fügt 200 an Index 3 ein
        zahlen.set(2, 100); // Ersetzt das Element an Index 2 durch 100
        zahlen.remove(5); // Entfernt das Element am Index 5

        zahlen = new ArrayList<>(zahlen); // Wechsel von LinkedList auf ArrayList

        zahlen.forEach(z -> System.out.println(z));

        // zahlen.sort(...); // Braucht einen Comparator

        Collections.sort(zahlen); // Hier wird kein Comparator gebraucht
        System.out.println(zahlen);


    }

}
