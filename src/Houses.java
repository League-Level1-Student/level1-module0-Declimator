import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot r = new Robot("mini");
		r.penDown();
		r.setPenWidth(2);
		r.setSpeed(1000);
		r.setX(20);
		r.setY(500);
		r.setAngle(90);
		drawHouse(300, r);
		drawHouse(100, r);
		drawHouse(100, r);
		drawHouse(100, r);
		drawHouse(100, r);
		drawHouse(100, r);
		drawHouse(100, r);
		drawHouse(100, r);
		drawHouse(100, r);
	}

	static void drawHouse(int height, Robot r) {

		r.turn(-90);
		r.move(height);
		r.turn(90);
		r.move(50);
		r.turn(90);
		r.move(height);
		r.turn(-90);
		r.setPenColor(103, 142, 87);
		r.move(30);
		r.setPenColor(0,0,0);

	}

}
