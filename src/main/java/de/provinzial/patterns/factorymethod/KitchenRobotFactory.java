package de.provinzial.patterns.factorymethod;

public class KitchenRobotFactory extends RobotFactory {

    @Override
    protected Robot createRobot() {
        return new KitchenRobot();
    }
}
