import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
	
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public Gui() {			// Gui() constructor
		super("the title");
		setLayout(new FlowLayout()); // Default Layout
		
		tf = new JTextField("Sumayya is a programmer and a singer", 25);
		add(tf);
		
		pb = new JRadioButton("plain", true);
		bb = new JRadioButton("bold", false);
		ib = new JRadioButton("italic", false);
		bib = new JRadioButton("bold and italic", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(pf);
		
		//wait for event to happen, pass in font object
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));	
	}	// Out of the Gui() constructor
	private class HandlerClass implements ItemListener{
		private Font font;
		// the font object get variable font
		public HandlerClass(Font f) { // HandlerClass() constructor
			font = f;
		} //Out of the HandlerClass() constructor
		
		public void itemStateChanged(ItemEvent event) {
			
			tf.setFont(font);
		}
	}
	
	
	
	
	
	
	

}
