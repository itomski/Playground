package de.provinzial.patterns.singleton;

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private int zahl;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
