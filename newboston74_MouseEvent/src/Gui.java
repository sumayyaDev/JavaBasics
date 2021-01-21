import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public Gui() {
		super("Title SumayyaCyberHunter");
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.BLUE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusBar = new JLabel("Default");
		add(statusBar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}	// Out of the Gui constructor
	
	private class Handlerclass implements MouseListener, MouseMotionListener{
		
		// These are MouseLister event (total 5)
		public void mouseClicked(MouseEvent event) {
			statusBar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
		}
		public void mousePressed(MouseEvent event) {
			statusBar.setText("You pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event) {
			statusBar.setText("You released the button");
		}
		public void mouseEntered(MouseEvent event) {
			statusBar.setText("You entered the area");
			mousePanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			statusBar.setText("The mouse has left the window");
			mousePanel.setBackground(Color.BLUE);
		}
		
		// These are MouseMotionListner event
		public void mouseDragged(MouseEvent event) {
			statusBar.setText("You are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event) {
			statusBar.setText("You moved the mouse");
		}
		
	}
	
}
