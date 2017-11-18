package ca.utoronto.utm.gui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

class KeypressPanel extends JPanel implements KeyListener {

    int x,y; // The current position of the ball

    public KeypressPanel(){
            setBackground(Color.black);
            x=100; y=100;
            addKeyListener(this);
    }

    public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.white);
            g.fillOval(x,y, 10, 10);
            requestFocus();
    }

    // To fulfill our obligations as a KeyListener, we implement the following...
    public void keyPressed(KeyEvent e){ }
    public void keyReleased(KeyEvent e){ }
    public void keyTyped(KeyEvent e){
            switch(e.getKeyChar()){
                    case 'o': y=y-1; break;
                    case 'k': x=x-1; break;
                    case ';': x=x+1; break;
                    case '.': y=y+1; break;
                    default:
            }
            repaint(); // What happens if we leave this out?
    }
}

