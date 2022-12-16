package RobotBuilderPattern;
// build cac thanh phan robot
public interface RobotBuilder {

    public void buildRobotHead();

    public void buildRobotTorso();


    public void buildRobotArms();

    public void buildRobotLegs();

    public Robot getRobot();

}
