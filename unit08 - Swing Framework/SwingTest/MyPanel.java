package SwingTest;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	ImageIcon icon = new ImageIcon("images/airplane0.png");
	
	/* paint is a built-in function of JPanel
	 * rewrite the paint function.
	 */
	public void paint(Graphics g) {
		//g is a painting API, <=> the brush of the panel
		//paintIcon function is provided by ImageIcon
		//we use this function to plot the image
		//it's meaningless of "this" parameter
		//g is the brush, 10,10 is the location of the image 
		icon.paintIcon(this, g, 10,10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		MyPanel panel = new MyPanel();//MyPanel extends from JFrame,thus it contains all function of JPanel
		frame.add(panel);
		frame.setSize(400,700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
