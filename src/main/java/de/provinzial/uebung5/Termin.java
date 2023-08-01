package de.provinzial.uebung5;

import java.time.LocalDate;
import java.time.LocalTime;

public class Termin {

    private LocalDate datum;
    private LocalTime uhrzeit;
    private String titel;

    public Termin() {
    }

    public Termin(LocalDate datum, LocalTime uhrzeit, String titel) {
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.titel = titel;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(LocalTime uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "Termin{" +
                "datum=" + datum +
                ", uhrzeit=" + uhrzeit +
                ", titel='" + titel + '\'' +
                '}';
    }
}
