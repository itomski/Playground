package de.provinzial.patterns.builder;

public class Fahrzeug {

    private final String kennzeichen;

    private final String marke;

    private final String typ;

    private final int baujahr;

    private final int leistung;

    private final Antrieb antrieb;

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

    public static class FahrzeugBuilder {

        private String kennzeichen;

        private String marke;

        private String typ;

        private int baujahr;

        private int leistung;

        private Antrieb antrieb;

        public FahrzeugBuilder() {
        }

        public Fahrzeug build() {
            return new Fahrzeug(kennzeichen, marke, typ, baujahr, leistung, antrieb);
        }

        public String getKennzeichen() {
            return kennzeichen;
        }

        public FahrzeugBuilder setKennzeichen(String kennzeichen) {
            this.kennzeichen = kennzeichen;
            return this;
        }

        public String getMarke() {
            return marke;
        }

        public FahrzeugBuilder setMarke(String marke) {
            this.marke = marke;
            return this;
        }

        public String getTyp() {
            return typ;
        }

        public FahrzeugBuilder setTyp(String typ) {
            this.typ = typ;
            return this;
        }

        public int getBaujahr() {
            return baujahr;
        }

        public FahrzeugBuilder setBaujahr(int baujahr) {
            this.baujahr = baujahr;
            return this;
        }

        public int getLeistung() {
            return leistung;
        }

        public FahrzeugBuilder setLeistung(int leistung) {
            this.leistung = leistung;
            return this;
        }

        public Antrieb getAntrieb() {
            return antrieb;
        }

        public FahrzeugBuilder setAntrieb(Antrieb antrieb) {
            this.antrieb = antrieb;
            return this;
        }
    }
}
