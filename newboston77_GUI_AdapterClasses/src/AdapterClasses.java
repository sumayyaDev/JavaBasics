import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdapterClasses extends JFrame{         
	private String details;
	private JLabel statusBar;
	
	public AdapterClasses() {
		super("Title: Working with Adapter Class");
		statusBar = new JLabel("This is default");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new Moussseclass());
	}
	public class Moussseclass extends MouseAdapter{         // WE don't need to override all the 7 method that MouseLIstener has
		public void mouseClicked(MouseEvent event) {		// We will just override which method we want
			details = String.format("You clicked %d ", event.getClickCount());  // This is the benefit of using Adapter Class
			
			if(event.isMetaDown())
				details += "with right mouse button";
			else if(event.isAltDown())
				details += "with center mouse button";
			else
				details += "with left mouse button";
			
			statusBar.setText(details);	
		}
		
	}

}
