package de.provinzial.patterns.factorymethod;

public class IndustrialRobot implements Robot {

    @Override
    public void doTheJob() {
        System.out.println("Baut ein Fahrzeug zusammen.");
    }
}
