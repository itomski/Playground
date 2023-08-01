package de.provinzial.uebung5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Kalender {

    private TreeMap<LocalDate, List<Termin>> termine = new TreeMap<>();

    public void add(Termin termin) {
        // Leere Liste für den Schlüssen anlegen, wenn noch nicht vorhanden
        termine.putIfAbsent(termin.getDatum(), new ArrayList<>());

        // Termin der passenden Liste hinzufügen
        termine.get(termin.getDatum()).add(termin);
    }

    public Map<LocalDate, List<Termin>> getAll() {
        return termine;
    }

    public Map<LocalDate, List<Termin>> get(LocalDate von, LocalDate bis) {
        return termine.subMap(von, bis);
    }
}
