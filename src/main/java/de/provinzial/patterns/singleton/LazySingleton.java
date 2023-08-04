package de.provinzial.patterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private int zahl;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        // TODO: Hier auf Threadsicherheit testen
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
