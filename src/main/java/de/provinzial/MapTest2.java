package de.provinzial;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest2 {

    public static void main(String[] args) {

        Map<Integer, String> spieler = new HashMap<>();

        spieler.put(10, "Peter Parker");
        spieler.put(100, "Bruce Banner");
        spieler.put(7, "Carol Danvers");
        spieler.put(2, "Natasha Romanov");
        spieler.put(21, "Steve Rogers");

        for(Map.Entry<Integer, String> eintrag : spieler.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }

        System.out.println();

        TreeMap<Integer, String> sortedSpieler = new TreeMap<>(spieler); // Sortiert nach Schlüsseln

        for(Map.Entry<Integer, String> eintrag : sortedSpieler.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }

        System.out.println();

        // sortedAuswahl ist eine dynamische View auf einen Teil der Original-Map
        Map<Integer, String> sortedAuswahl = sortedSpieler.subMap(10, 120);
        System.out.println(sortedAuswahl);

        sortedSpieler.put(99, "Tony Stark");
        System.out.println(sortedAuswahl);

    }
}
