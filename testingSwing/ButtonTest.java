import java.awt.*;
import java.awt.event.*;
import java.util.prefs.BackingStoreException;

import javax.swing.*;

public class ButtonTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(
				new Runnable() {
					public void run() {
						ButtonFrame frame = new ButtonFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
	}
}
class ButtonFrame extends JFrame {
	
	public ButtonFrame() {
		setTitle("Button Test");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setResizable(false);

		JButton yellowButton = new JButton("Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");

		buttonPanel = new JPanel();

		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);

		add(buttonPanel);

		ColorAction yellowAction = new ColorAction(Color.YELLOW);
		ColorAction blueAction = new ColorAction(Color.BLUE);
		ColorAction redAction = new ColorAction(Color.RED);

		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	}
	

	private class ColorAction implements ActionListener {
		private Color backgroundColor;
		public ColorAction(Color c) {
			backgroundColor = c;
		}
		public void actionPerformed(ActionEvent e) {
			buttonPanel.setBackground(backgroundColor);
		}

	}

		private JPanel buttonPanel;
		public static final int DEFAULT_WIDTH = 200;
		public static final int DEFAULT_HEIGHT = 300;
}
