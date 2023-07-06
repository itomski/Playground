package de.provinzial.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Kreis geo1 = new Kreis(10, 20, 100);
        System.out.println(geo1.getX() + " " + geo1.getY());

        Rechteck geo2 = new Rechteck(15, 22, 50, 30);
        System.out.println(geo2.getX() + " " + geo2.getY());

        Rechteck geo3 = new Rechteck(200, 222, 50, 30);

        GeoFormGruppe g1 = new GeoFormGruppe(geo1, geo2);
        g1.add(geo3);
        g1.add(new Kreis(1, 1, 50));

        g1.print();

        g1.bewegeNach(100, 100);

        g1.print();

        System.out.println();

        // Ein Composite kann andere Composites und Einzelelemente aufnehmen
        GeoFormGruppe g2 = new GeoFormGruppe(g1, new Rechteck(15,22, 10, 10));
        g2.bewegeNach(17, 17);
        g2.print();

        /*
        List<GeoForm> geos = new ArrayList<>(); // Kann alle Objekte aufnehmen, die GeoForm implementieren
        geos.add(geo1);
        geos.add(geo2);

        for(GeoForm f : geos) {
            f.bewegeNach(15, 15);
        }

        for(GeoForm f : geos) {
            f.print(); // Hier wird die print-Methode von dem Objekt auf dem Heap ausgeführt
        }
        */

    }

}

interface GeoForm {

    void print(); // Im Interface sind alle Methoden automatisch public

    void bewegeNach(int x, int y);

}

// Das implementieren eines Interface erzwingt das Eibauen bestimmter Methoden
abstract class AbstractGeoForm implements GeoForm {

    private int x;

    private int y;

    public AbstractGeoForm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override // Implementierung der Methode aus dem Interface
    public void bewegeNach(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Kreis extends AbstractGeoForm {
    private int radius;

    public Kreis(int x, int y, int radius) {
        super(x, y); // Verwendet den Konstruktor von AbstractGeoForm
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Printet ein Kreis: " + getX() + ", " + getY() + ", R: " + radius);
    }
}

class Rechteck extends AbstractGeoForm {

    private int hoehe;
    private int breite;

    public Rechteck(int x, int y, int hoehe, int breite) {
        super(x, y);
        this.hoehe = hoehe;
        this.breite = breite;
    }

    @Override
    public void print() {
        System.out.println("Printet ein Rechteck: " + getX() + ", " + getY() + ", H: " + hoehe + ", B: " + breite);
    }
}

// Composite
class GeoFormGruppe implements GeoForm {

    private List<GeoForm> elements;

    public GeoFormGruppe(GeoForm... elements) { // VarArg - Parameter eines VarArgs werden als ein Array in der Methode verfügbar gemacht
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public void add(GeoForm geo) {
        elements.add(geo);
    }


    @Override
    public void print() {
        for(GeoForm geo : elements) {
            geo.print(); // Die Bewegung wird an die Elemente delegiert
        }
    }

    @Override
    public void bewegeNach(int x, int y) {
        for(GeoForm geo : elements) {
            geo.bewegeNach(x, y); // Die Bewegung wird an die Elemente delegiert
        }
    }
}





