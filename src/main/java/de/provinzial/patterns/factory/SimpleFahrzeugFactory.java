package de.provinzial.patterns.factory;

import de.provinzial.patterns.builder.Antrieb;

public class SimpleFahrzeugFactory {

    public static Fahrzeug createVWPolo(Antrieb antrieb, int baujahr, String kennzeichen) {
        return new Fahrzeug(kennzeichen, "VW", "Polo", baujahr, 100, antrieb);
    }

    public static Fahrzeug createVWGolf(Antrieb antrieb, int baujahr, String kennzeichen) {
        return new Fahrzeug(kennzeichen, "VW", "Golf", baujahr, 100, antrieb);
    }
}
