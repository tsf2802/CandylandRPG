import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {
	Color reddot = new Color(255, 0, 0);
	static JFrame frame;
	public static void main(String []args) {
		
		JFrame popup = new JFrame("Map");
		popup.setSize(200, 200);
		popup.setLocation(600, 0);
		popup.setResizable(false);
		popup.add(new JLabel(new ImageIcon("iPictures/map.png")));
		popup.setVisible(true);
		
		frame = new JFrame("Candyland");
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); 
		frame.add(new Gframe());
		frame.setVisible(true);
		
		
	}

}




