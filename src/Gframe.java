
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
public class Gframe extends JPanel implements ActionListener{
	Timer mainTimer;
	Player player;
	
	public Gframe() {
		player = new Player(240,210);
		addKeyListener(new KeyEntry(player));
		setFocusable(true);
		mainTimer = new Timer(10,this);
		
		mainTimer.start();
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D c = (Graphics2D)g;
		player.draw(c);
		
	
		
	}

	public void actionPerformed(ActionEvent arg0) {
		player.updoot();
		repaint();
	}
}


