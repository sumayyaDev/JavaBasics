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
 * This class is for creating a 'Login' frame for teachers.
 */
public class TeacherLoginFrame extends JFrame {

    private Container c;
    private JButton button1, button2, button3, back;
    private JLabel username, password, common_entry;
    private JTextField tf1;
    private JPasswordField pf;

    /**
     * constructor for TeacherLoginFrame
     */
    TeacherLoginFrame() {
        initializeComponents();
    }

    /**
     * This method initializes all the components of the frame.(GUI)
     */
    public void initializeComponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// disposes frame if exit button is clicked
        this.setSize(800, 500);// sets size for the frame
        this.setLocationRelativeTo(null);// sets initial position of the frame to the center
        this.setTitle("Teacher");// sets the title of the frame

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(39, 40, 34));// setting the background color of the frame

        username = new JLabel("Username: "); // creating new JLabel object for username
        username.setBounds(100, 60, 100, 20); // setting boundary for JLabel
        username.setForeground(Color.WHITE);// setting font/ foreground color
        c.add(username);// adding JLabel to container

        back = new JButton("Back");// creating back button object
        back.setBounds(0, 0, 65, 30);//setting boundary for the button object
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CharacterFrame().setVisible(true); //creating previous frame object
                dispose();// disposing current frame
            }

        });
        c.add(back);// adding back button to container

        password = new JLabel("Password: ");// creating new JLabel for password
        password.setBounds(100, 95, 100, 20);// setting boundary for JLabel
        password.setForeground(Color.WHITE);// setting font/foreground of jlabel
        c.add(password);// adding jlabel to container

        tf1 = new JTextField();// creating a JTextField object for receiving text from user
        tf1.setBounds(210, 60, 150, 20);// setting text feild boundary
        c.add(tf1);// adding text field to container

        pf = new JPasswordField();// creating new JPasswordField object
        pf.setBounds(210, 95, 150, 20); // setting boundary for password field
        c.add(pf);// adding pass. field to container

        common_entry = new JLabel("Sample account: Username - ABC, Password - 123");// creating Jlabel for a sample account info.
        common_entry.setBounds(361, 60, 400, 20);// setting boundary for jlabel
        common_entry.setBackground(new Color(39, 40, 34));// setting background color of the jlabel
        common_entry.setForeground(Color.WHITE);//setting foreground color for jlabel

        c.add(common_entry);// adding jlabel to container

        button1 = new JButton("New Teacher?");// creating button object for new Teacher
        button1.setBounds(10, 390, 150, 30);// setting boundary for button
        c.add(button1); // adding button to container
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                SignupFrameTeacher sign = new SignupFrameTeacher();// creating new signup frame object for new students
                dispose();// disposing current frame
            }
        });

        button2 = new JButton("Login");// new JButton object for login
        button2.setBounds(220, 180, 80, 20);// setting boundary for button
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                String name = tf1.getText();// getting name from textfield
                String password = new String(pf.getPassword()); // getting password as char[] from passwordfield and then converting to string
                if (Files.confirmTeacher(name, password)) {// validating user login
                    tf1.setText("");// making text field blank
                    pf.setText(""); // making password field blank
                    TeacherFrame t_frame = new TeacherFrame(new Teacher(name, password)); // creating new TeacherFrame passing Teacher object
                    dispose();// disposing current frame
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Password or Username. Try again", "Warning", JOptionPane.WARNING_MESSAGE);// incorrect pass. or username WARNING
                }
            }
        });
        c.add(button2);//adding button to the container

        button3 = new JButton("Clear");// creating button object for clear operation
        button3.setBounds(120, 180, 80, 20);// setting button boundary
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tf1.setText("");// setting textfield to blank
                pf.setText("");//  setting password field to blank
            }
        });
        c.add(button3);// adding button to container
        this.setVisible(true);// making the frame visible
    }

}
