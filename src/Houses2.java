import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses2 {
	static void drawHouse(String height, Robot r, Color housecolor) {
		String heightpixels = "";
		if (height.equalsIgnoreCase("Small")) {
			heightpixels = "60";
		} else if (height.equalsIgnoreCase("Large")) {
			heightpixels = "250";
		} else if (height.equalsIgnoreCase("Medium")) {
			heightpixels = "120";
		}
		int heightx = Integer.parseInt(heightpixels);
		r.setPenColor(housecolor);
		r.turn(-90);
		r.move(heightx);
		if (height.equalsIgnoreCase("Large")) {
			FlatRoof(r);
		} else if (height.equalsIgnoreCase("Medium")) {
			FlatRoof(r);
		} else if (height.equalsIgnoreCase("Small")) {
			PeakedRoof(r);
		}
		r.move(heightx);
		r.turn(-90);
		r.setPenColor(103, 142, 87);
		r.move(30);
		r.setPenColor(0, 0, 0);

	}

	static void FlatRoof(Robot r) {
		r.turn(90);
		r.move(40);
		r.turn(90);
	}

	static void PeakedRoof(Robot r) {
		r.turn(45);
		r.move(20);
		r.turn(90);
		r.move(20);
		r.turn(45);
	}
}
