import java.awt.*;
import javax.swing.*;

public class NotHelloWorld {
	public static void main(String[] args) {
		
		EventQueue.invokeLater(
				new Runnable() {
					public void run() {
						NotHelloWorldFrame frame = new NotHelloWorldFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
		
		
	}

}

class NotHelloWorldFrame extends JFrame {
	
	private final int DEFAULT_WIDTH = 400;
	private final int DEFAULT_HEIGHT = 300;
	
	public NotHelloWorldFrame() {
		setTitle("Not Hello World");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		NotHelloWorldPanel panel = new NotHelloWorldPanel();
		add(panel);
	}
	
	class NotHelloWorldPanel extends JPanel {
		private final int MESSAGE_X = 75;
		private final int MESSAGE_Y = 100;
		
		public void paintComponent(Graphics g) {
			g.drawString("Not a Hello World programm", MESSAGE_X, MESSAGE_Y);
		}

	}
}