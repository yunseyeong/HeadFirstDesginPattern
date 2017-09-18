package FactoryPattern.robot;

public class FactoryMain {
    public static void main(String[] args){
        RobotFactory rf = new SuperRobotFactory();
        Robot r = rf.createRobot("super");
        Robot r2 = rf.createRobot("power");
        System.out.println(r.GetName());
        System.out.println(r2.GetName());

        RobotFactory mrf = new ModifiedSuperRobotFactory();
        Robot r3 = mrf.createRobot("FactoryPattern.robot.SuperRobot");
        Robot r4 = mrf.createRobot("FactoryPattern.robot.PowerRobot");

        System.out.println(r3.GetName());
        System.out.println(r4.GetName());
    }
}
