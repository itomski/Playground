package de.provinzial.patterns.factory;

import de.provinzial.patterns.builder.Antrieb;

import java.time.LocalDate;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        Fahrzeug f1 = SimpleFahrzeugFactory.createVWPolo(Antrieb.VERBRENER, 2000, "XY:Z123");
        Fahrzeug f2 = SimpleFahrzeugFactory.createVWGolf(Antrieb.ELEKTRO, 2020, "XY:Z156");
    }
}
