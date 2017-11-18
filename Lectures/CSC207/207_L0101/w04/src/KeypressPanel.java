import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeypressPanel extends JPanel implements KeyListener {
	
	int x, y;
	
	public KeypressPanel() {
		setBackground(Color.black);
		x = 100;
		y = 100;
		addKeyListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillOval(x, y, 10, 10);
		requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Typed: " + e.getKeyChar());
		switch (e.getKeyChar()) {
			case 'w':
				y = y - 1;
				break;
			case 'a':
				x = x - 1;
				break;
			case 'd':
				x = x + 1;
				break;
			case 's':
				y = y+1;
				break;
		}
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				y = y -1;
				break;
			case KeyEvent.VK_DOWN:
				y = y +1;
				break;
			case KeyEvent.VK_LEFT:
				x = x-1;
				break;
			case KeyEvent.VK_RIGHT:
				x = x+1;
				break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}