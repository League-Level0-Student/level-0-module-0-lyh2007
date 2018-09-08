import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot robottybutt = new Robot();
		robottybutt.penDown();
		robottybutt.setSpeed(60);
		robottybutt.move(200);
		robottybutt.turn(180);
		robottybutt.move(200);
		robottybutt.turn(-90);
		robottybutt.move(100);

	}

}