package de.provinzial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> namen = new HashMap<>();
        namen.put("A", "Anna");
        namen.put("B", "Berta");
        namen.put("C", "Carol");
        namen.put("D", "Dieter");

        System.out.println(namen);

        Map<String, List<String>> namen2 = new HashMap<>();
        namen2.put("A", Arrays.asList("Anna", "Anton"));
        namen2.put("B", Arrays.asList("Ben", "Bob", "Berta"));
        namen2.put("C", Arrays.asList("Carol", "Colin"));
        namen2.put("D", Arrays.asList("Dieter", "Dorle"));

        System.out.println(namen2);

        System.out.println();

        for(String k : namen.keySet()) {
            System.out.println(k + ": " + namen.get(k));
        }

        System.out.println();

        for(String v : namen.values()) {
            System.out.println(v);
        }

        System.out.println();

        System.out.println(namen.get("C"));

        namen.put("A", "Unbekannt"); // Wenn vorhanden, wird überschrieben
        System.out.println(namen);
        System.out.println(namen.get("G"));

        namen.putIfAbsent("A", "Alex"); // Hinzufügen, wenn Schlüssel noch nicht vorhanden

        // Defaultwert, wenn Schlüssel nicht verfügbar
        System.out.println(namen.getOrDefault("G", "Nicht da"));


    }
}
