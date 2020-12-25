import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionClass extends JFrame {
	
	private JList leftlist;
	private JList rightlist;
	private JButton moveButton;
	private static String[] foods = {"peperoni", "hawaian", "farmhouse", "meat feast", "vegetarian", "margharita", "spanish sizzler", "tuna supreme"};
	
	public MultipleSelectionClass(){
		super("multiple selector");
		setLayout(new FlowLayout());
		
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(5);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		moveButton = new JButton("Move -->");
		moveButton.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						rightlist.setListData(leftlist.getSelectedValuesList().toArray());
					}
				}
			);
		add(moveButton);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(5);
		rightlist.setFixedCellHeight(30);
		rightlist.setFixedCellWidth(100);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
		
	}

}
