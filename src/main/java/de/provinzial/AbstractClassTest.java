package de.provinzial;

public class AbstractClassTest {

    public static void main(String[] args) {

        // Fahrzeug f1 = new Fahrzeug(); // Klasse ist abstrakt

        Fahrzeug f2 = new PKW();

        // String ist final

    }
}

abstract class Fahrzeug {
    // Teilimplementierung
}

class PKW extends Fahrzeug {
    // Ergänzung der Teilimplementierung
}
