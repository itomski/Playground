package de.provinzial.patterns.factory;

import de.provinzial.patterns.builder.Antrieb;

public class Fahrzeug {

    private String kennzeichen;

    private String marke;

    private String typ;

    private int baujahr;

    private int leistung;

    private Antrieb antrieb;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeichen, String marke, String typ, int baujahr, int leistung, Antrieb antrieb) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.typ = typ;
        this.baujahr = baujahr;
        this.leistung = leistung;
        this.antrieb = antrieb;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getTyp() {
        return typ;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public int getLeistung() {
        return leistung;
    }

    public Antrieb getAntrieb() {
        return antrieb;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public void setAntrieb(Antrieb antrieb) {
        this.antrieb = antrieb;
    }
}
