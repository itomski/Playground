package de.provinzial.uebung5;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

    public static void main(String[] args) {

        Kalender kalender = new Kalender();

        kalender.add(new Termin(LocalDate.now(), LocalTime.now(), "Essen mit Bob"));
        kalender.add(new Termin(LocalDate.now().plusDays(2), LocalTime.now(), "Essen mit Carol"));
        kalender.add(new Termin(LocalDate.now().plusDays(2), LocalTime.of(17, 30), "Essen mit Bruce"));
        kalender.add(new Termin(LocalDate.now().minusDays(35), LocalTime.now().minusHours(4), "Start Java Schulung"));
        kalender.add(new Termin(LocalDate.of(2023, 10, 17), LocalTime.of(10, 22), "Kauf Uniper-Aktien"));

        kalender.getAll().forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println();

        kalender.get(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 30))
                .forEach((k, v) -> System.out.println(k + ": " + v));


    }

}
