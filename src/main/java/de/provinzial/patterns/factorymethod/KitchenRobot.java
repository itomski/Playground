package de.provinzial.patterns.factorymethod;

public class KitchenRobot implements Robot {

    @Override
    public void doTheJob() {
        System.out.println("Kocht das Essen für die ganze Familie");
    }
}
