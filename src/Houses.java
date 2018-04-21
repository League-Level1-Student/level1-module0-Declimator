import java.awt.Color;
import java.util.Random;

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

		Houses2 myHouse = new Houses2();
		for (int i = 0; i < 10; i++) {
			myHouse.drawHouse(num(), r, rand());
		}
	}

	static String num() {
		String height = "";
		int variable = new Random().nextInt(3);
		if (variable == 0) {
			height = "Small";
		} else if (variable == 1) {
			height = "Medium";
		} else if (variable == 2) {
			height = "Large";
		}
		return height;
	}

	static Color rand() {
		int colors = new Random().nextInt(13);
		Color randy = Color.BLACK;
		if (colors == 0) {
			randy = Color.BLACK;
		} else if (colors == 1) {
			randy = Color.BLUE;
		} else if (colors == 2) {
			randy = Color.CYAN;
		} else if (colors == 3) {
			randy = Color.DARK_GRAY;
		} else if (colors == 4) {
			randy = Color.GRAY;
		} else if (colors == 5) {
			randy = Color.GREEN;
		} else if (colors == 6) {
			randy = Color.LIGHT_GRAY;
		} else if (colors == 7) {
			randy = Color.MAGENTA;
		} else if (colors == 8) {
			randy = Color.ORANGE;
		} else if (colors == 9) {
			randy = Color.PINK;
		} else if (colors == 10) {
			randy = Color.RED;
		} else if (colors == 11) {
			randy = Color.WHITE;
		} else if (colors == 12) {
			randy = Color.YELLOW;
		}
		return randy;
	}
}
