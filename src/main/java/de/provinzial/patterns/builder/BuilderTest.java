package de.provinzial.patterns.builder;

public class BuilderTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("HH:AB123", "VW", "Polo", 2020, 50, Antrieb.VERBRENER);
        Fahrzeug f2 = new Fahrzeug("KI:AB125", "VW", "Polo", 2020, 50, Antrieb.VERBRENER);

        Fahrzeug.FahrzeugBuilder builder = new Fahrzeug.FahrzeugBuilder();
        builder.setMarke("VW")
                .setTyp("Polo")
                .setBaujahr(2000)
                .setAntrieb(Antrieb.ELEKTRO)
                .setLeistung(100);

        Fahrzeug f3 = builder.setKennzeichen("HH:AB346").build();
        Fahrzeug f4 = builder.setKennzeichen("HH:AB344").build();
        builder.setAntrieb(Antrieb.HYBRIED);
        Fahrzeug f5 = builder.setKennzeichen("HH:AB349").build();

    }
}
