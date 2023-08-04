package de.provinzial.patterns.factorymethod;

public class IndustrialRobotFactory extends RobotFactory {

    @Override
    protected Robot createRobot() {
        return new IndustrialRobot();
    }
}
