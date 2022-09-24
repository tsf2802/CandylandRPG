import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
public class KeyEntry extends KeyAdapter {
	Player p;
	public KeyEntry(Player player) {
		p = player;
	}
	public void keyPressed (KeyEvent e) {
		p.keyPressed(e);
	}
	public void keyReleased (KeyEvent e) {
		p.keyReleased(e);
	}
}
