package arrayProject;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class ArrayGui {
	public static void main(String[] args) {
		
		EventQueue.invokeLater(
				new Runnable() {
					public void run() {
						ArrayFrame frame = new ArrayFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
		
	}
}

class ArrayFrame extends JFrame {

	private JPanel generalPanel;
	private JPanel controlPanel;
	private JPanel contentPanel;
	private JTextField arraySize;
	private JButton generateArrayBtn;
	private JLabel arraySizeLbl;
	private JLabel[] labels;
	private JLabel[] indexes;
	
	public ArrayFrame() {

		
		contentPanel = new JPanel();
		

		arraySize = new JTextField(10);
		generateArrayBtn = new JButton("generate array");
		ArrayListener arrayListener = new ArrayListener();
		generateArrayBtn.addActionListener(arrayListener);

		arraySizeLbl = new JLabel("Enter size of array");		
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3, 1));
		controlPanel.add(arraySizeLbl);
		controlPanel.add(arraySize);
		controlPanel.add(generateArrayBtn);
		
		
		generalPanel = new JPanel();
		generalPanel.setLayout(new BorderLayout());
		generalPanel.add(controlPanel, BorderLayout.WEST);
		generalPanel.add(contentPanel, BorderLayout.CENTER);
		
		setTitle("Arrays");
		add(generalPanel);
		pack();
		}

	private class ArrayListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			contentPanel.removeAll();
			ArrayModel arrModel = new ArrayModel(Integer.parseInt(arraySize.getText()));
			int arrSize = arrModel.getSize();
			contentPanel.setLayout(new GridLayout(1, arrSize));
			labels = new JLabel[arrSize];
			indexes = new JLabel[arrSize];
			for (int i = 0; i < arrSize; i++) {
				labels[i] = new JLabel(Integer.toString(arrModel.getElem(i)));
				labels[i].setBorder(BorderFactory.createLineBorder(Color.black));
				
				indexes[i] = new JLabel(Integer.toString(i));
				
				contentPanel.add(indexes[i]);
				contentPanel.add(labels[i]);
			}
			generalPanel.revalidate();
			pack();
			

		}
		
		
	}
	
}
