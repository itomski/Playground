package de.provinzial;

import java.util.Arrays;

public class NameSelector {

    // Schreibe eine Klasse die Namen verwaltet
    // Die Namen sind in einem Array oder einer Liste abgelegt
    // Zwei Methoden soll sie enthalten
    // getName(int i): Liefert einen Namen
    // getIndex(String name): Liefert eine Position
    // Schreibe eine Test für diese Klasse
    // Versuche 4 passende Testfälle zu finden

    private final String[] NAMEN = {"Peter", "Bruce", "Carol", "Tony"};

    public NameSelector() {
        Arrays.sort(NAMEN);
    }

    public String getName(int i) {
        try {
            return NAMEN[i];
        }
        catch(Exception e) {
            return null;
        }
    }

    public int getIndex(String name) {
        return Arrays.binarySearch(NAMEN, name);
    }
}
