package de.provinzial;

public class AnonymeKlasseTest {

    public static void main(String[] args) {

        Tier t = new Hund();
        t.frisst();
        t.schlaeft();

        System.out.println();

        t = new Tier() { // Klasse ohne Namen die sofort instanziert wird und nicht wiederverwendbar ist
            @Override
            public void frisst() {
                System.out.println("Frisst nur den Käse vom Brot");
            }

            @Override
            public void schlaeft() {
                System.out.println("Schläft nie!");
            }
        };

        t.frisst();
        t.schlaeft();

        System.out.println();

        t = new Hund() { // Überschreibt nur eine Methode
            @Override
            public void schlaeft() {
                System.out.println("Schläft nur 2 Std. pro Tag");
            }
        };

        t.frisst();
        t.schlaeft();

    }
}

interface Tier {

    void frisst();

    void schlaeft();

}

class Hund implements Tier {

    @Override
    public void frisst() {
        System.out.println("Trockenfutter wird stehen gelassen... Nassfutter wird vertilgt");
    }

    @Override
    public void schlaeft() {
        System.out.println("Pennt den ganzen Tag... und die ganze Nacht");
    }
}
