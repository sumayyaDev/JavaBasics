import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Sumayya {

	private JFrame frame;
	private JLabel changeVar1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sumayya window = new Sumayya();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sumayya() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Show Message");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Write the message
				//JOptionPane.showMessageDialog(null, "Hello Sumayya!");  /*JButton*/
				changeVar1.setText("Hello Sumayya!");					  /*JLabel*/
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(140, 193, 213, 64);
		frame.getContentPane().add(btnNewButton);
		
		changeVar1 = new JLabel("Message");
		changeVar1.setFont(new Font("Tahoma", Font.BOLD, 16));
		changeVar1.setBounds(140, 84, 213, 55);
		frame.getContentPane().add(changeVar1);
	}
}
