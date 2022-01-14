package SwingTest;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class demo01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.add(panel);
		frame.setSize(400,700);
		frame.setLocationRelativeTo(null);//will set the image at the center
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//display the panel
		frame.setVisible(true);
		

	}

}
