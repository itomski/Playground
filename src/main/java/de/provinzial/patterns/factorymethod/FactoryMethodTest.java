package de.provinzial.patterns.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        new FactoryMethodTest().start();
    }

    private void start() {

        //RobotFactory factory = new IndustrialRobotFactory();
        RobotFactory factory = new KitchenRobotFactory();
        Robot robot = factory.createRobot();
        robot.doTheJob();

        System.out.println();

        createRobotAndDoTheJob(new IndustrialRobotFactory());
        createRobotAndDoTheJob(new KitchenRobotFactory());

    }

    void createRobotAndDoTheJob(RobotFactory factory) {
        Robot robot = factory.createRobot();
        robot.doTheJob();
    }
}
