/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizandquery;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * This class is for creating SignUp frame for new Students
 */
public class SignupFrameStudent extends JFrame {

    private Container c;
    private JLabel username, password;
    private JTextField tf1;
    private JPasswordField pf;
    private JButton submit, clear, back;

    /**
     * Constructor for SignupFrameStudent. It initializes frame components.
     *
     */
    SignupFrameStudent() {
        initializeComponents();
    }

    /**
     * This method initializes all the components of the frame.(GUI)
     */
    public void initializeComponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// disposes frame after clicking exit button
        this.setSize(800, 500);//setting size for frame
        this.setLocationRelativeTo(null);//setting initial frame location to center
        this.setTitle("Signup");//setting title for the frame

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(39, 40, 34)); // setting background color

        back = new JButton("Back");//creating Jbutton for getting back to previous frame
        back.setBounds(0, 0, 65, 30);//setting boundary for button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentLoginFrame().setVisible(true);// creating new StudentLoginFrame and making it visible
                dispose(); // disposing current frame
            }

        });
        c.add(back); // adding button to the container

        username = new JLabel("Username: "); // creating label for username
        username.setBounds(100, 60, 100, 20);//setting boundary for label
        username.setForeground(Color.WHITE); // setting font/foreground color
        c.add(username); // adding label to the container

        password = new JLabel("Password: "); // creating JLabel object for password
        password.setBounds(100, 95, 100, 20); // setting boundary for label
        password.setForeground(Color.WHITE);//setting foreground color
        c.add(password);// adding label to the container

        tf1 = new JTextField(); // creating new TextField object
        tf1.setBounds(210, 60, 150, 20); // setting boundary for text field
        c.add(tf1);// adding textfield to the container

        pf = new JPasswordField(); // creating password field object
        pf.setBounds(210, 95, 150, 20);//setting boundary of passwordfield
        c.add(pf);//adding passwordfield to the container

        clear = new JButton("Clear"); // creatin JButton object for clearing fields
        clear.setBounds(120, 180, 80, 20); // setting boundary for button
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tf1.setText(""); // setting textfield blank
                pf.setText(""); // setting pass. field blank
            }
        });
        c.add(clear); // adding button to the container

        submit = new JButton("Submit"); // creating button object for submit
        submit.setBounds(220, 180, 80, 20);//setting boundary for button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = tf1.getText(); // getting name from the textField
                String password = new String(pf.getPassword());//getting password from password field

                Files.addStudent(new Student(name, password)); // writing new student to file

                JOptionPane.showMessageDialog(null, "Account Created Successfilly. Please Log into your account", "Welcome", JOptionPane.INFORMATION_MESSAGE);//confirmation message
                tf1.setText(""); // setting textfield blank
                pf.setText(""); // setting password field blank
                StudentLoginFrame student = new StudentLoginFrame(); // creating new StudentLoginFrame
                dispose(); // disposing current frame
            }
        });
        c.add(submit); // adding button to container
        this.setVisible(true); // making frame visible
    }

}
