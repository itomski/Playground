package de.provinzial;

public class MainTest {

    private int zahl; // Instanzeigenschaft

    private static int andereZahl; // Klasseneigenschat

    // Klassenmethode
    public static void main(String[] args) {

        // Instanzmethoden und Eigenschaften sind nur sichtbar, wenn ein Objekt der Klasse existiert
        // System.out.println(zahl); // Error
        // System.out.println(machWas()); // Error

        MainTest mt = new MainTest();
        mt.zahl = 100;
        System.out.println(mt.zahl); // Ok, wird über das Objekt aufgerufen
        mt.machWas(); // Ok, wird über das Objekt aufgerufen

        MainTest mt2 = new MainTest();
        mt2.zahl = 200;
        System.out.println(mt2.zahl); // Ok, wird über das Objekt aufgerufen
        mt2.machWas(); // Ok, wird über das Objekt aufgerufen


        // Klassenangabe nicht nötig, da wir in uns in dieser Klasse befinden
        System.out.println(andereZahl); // Ok, wird über das die Klasse aufgerufen
        System.out.println(MainTest.andereZahl); // Ok, wird über das die Klasse aufgerufen
        MainTest.machWasAnderes(); // Ok, wird über das die Klasse aufgerufen
        machWasAnderes(); // Ok, wird über das die Klasse aufgerufen

    }

    // Instanzmethode
    private void machWas() {
        System.out.println("machWas");
    }

    // Klassenmethode
    private static void machWasAnderes() {
        System.out.println("machWasAnderes");
    }


}
