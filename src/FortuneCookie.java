import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {

		new FortuneCookie().showMethod();

	}

	void showMethod() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
frame.pack();
		System.out.println("Button");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You are bad");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You are very bad");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You are not bad");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You are extremely bad");
		} else {
			JOptionPane.showMessageDialog(null, "You are insanely bad");
		}
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
}
