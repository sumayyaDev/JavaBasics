import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textFieldNum1.setBounds(61, 28, 235, 76);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(358, 28, 235, 76);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(86, 160, 183, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(371, 160, 203, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(103, 287, 193, 51);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(371, 273, 222, 65);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
	}
}
