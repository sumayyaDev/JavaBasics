package quizandquery;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * This class is for creating a "Frame" for 'Query' purpose where students and
 * teachers can communicate to solve issues
 */
public class Query extends JFrame {

    File file = new File("Files/query_posts.txt");// declaring and creating a file object for file read/write

    private Teacher t1 = null; // initially setting to null
    private Student s1 = null;// initially setting to null

    private Container c;
    private Font foot, georgia, georgia2;
    private JLabel query_lab, signIn_as;
    private JButton clear, post, update, back;
    private JScrollPane scroll, scroll2;
    private JTextArea uploaded, new_upload;

    /**
     * Constructor for Query, initializes Frame components
     */
    Query() {
        initializeComponents(); // will initialize frame components
    }

    /**
     * Constructor for Query, initializes Frame components and Teacher object
     * 't1'
     *
     * @param t receives Teacher object reference
     */
    Query(Teacher t) {
        t1 = t; //initializing teacher object
        initializeComponents();// will initialize frame components
    }

    /**
     * Constructor for Query, initializes Frame components and Student object
     * 's1'
     *
     * @param s receives Student object reference
     */
    Query(Student s) {
        s1 = s; // initializng student object
        initializeComponents();// will initialize frame components
    }

    /**
     * This method is invoked in Constructors. It initializes frame components
     */
    public void initializeComponents() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // disposes frame if exit button clicked
        this.setSize(951, 809); // sets frame width and height
        this.setTitle("Query"); // setting frame title
        this.setLocationRelativeTo(null); // initially setting frame location at the center

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(39, 40, 34)); // setting background color of the frame

        foot = new Font("Footlight MT Light", Font.BOLD, 30);// creating Font object for differnt font
        georgia = new Font("Georgia", Font.PLAIN, 18);// creating Font object for differnt font
        georgia2 = new Font("Georgia", Font.BOLD, 18);// creating Font object for differnt font

        query_lab = new JLabel(" Query"); // topleftmost query label
        query_lab.setBounds(0, 11, 91, 35); // query label boundary
        query_lab.setOpaque(true);
        query_lab.setBackground(Color.LIGHT_GRAY);//query label background color
        query_lab.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));// query label font
        c.add(query_lab); // adding query label to container

        back = new JButton("Back"); // creating button object for getting back to previous page
        back.setBounds(800, 24, 65, 30); // setting back button boundary
        back.addActionListener(new ActionListener() { // adding action listener for back button
            @Override
            public void actionPerformed(ActionEvent e) { // checking which type of object is signed in
                if (s1 == null) {                       // to determine which frame to load
                    new TeacherFrame(t1).setVisible(true); //new TeacherFrame if a teacher is signed in
                    dispose(); // disposing last frame
                } else {
                    new StudentFrame(s1).setVisible(true); //new StudentFrame if a student is signed in
                    dispose(); // disposing last frame
                }
            }

        });
        c.add(back); // adding back button to container

        if (s1 == null) { // setting JLabel text based on the type of currently signed in object
            signIn_as = new JLabel("Signed In as: " + t1.getName()); // if teacher object is signed in
        } else {
            signIn_as = new JLabel("Signed In as: " + s1.getName()); // if student object is signed in
        }
        signIn_as.setOpaque(true);
        signIn_as.setBackground(Color.GRAY); // setting label background color
        signIn_as.setBounds(111, 0, 200, 25); // setting boundary for sign in label
        // align text
        c.add(signIn_as); // adding sign in label to container

        uploaded = new JTextArea(); // new JTextArea for uploaded queries, or discussions
        uploaded.setBounds(1, 1, 919, 498);
        uploaded.setFont(new Font("Gill Sans MT", Font.PLAIN, 18)); // font for the text inside text area
        uploaded.setOpaque(true);
        uploaded.setBackground(Color.WHITE); // setting background color
        uploaded.setLineWrap(true); // starts a new line if reached border of text area
        uploaded.setWrapStyleWord(true);// start new line not breaking a word
        uploaded.setEditable(false);// disable editable option
        initializeUploaded(); //  initializes text area with all posted conversations
        c.add(uploaded); // adding uploaded text area to Container

        scroll = new JScrollPane(uploaded); // new JScrollPane object for uploaded teaxt area
        scroll.setBounds(20, 90, 900, 500); // setting boundary for scroll pane
        c.add(scroll); // adding scrollpane to container

        new_upload = new JTextArea(); // new text area object for typing new queries
        new_upload.setOpaque(true);
        new_upload.setBackground(Color.PINK); // background color for text area
        new_upload.setFont(georgia); // new Font for TextArea
        c.add(new_upload); // adding TextArea object to container

        scroll2 = new JScrollPane(new_upload); // new JScrollPane object for 'new_upload' text area
        scroll2.setBounds(20, 610, 900, 100); // setting boundary for the scroll pane
        c.add(scroll2); // adding scrollpane to container

        post = new JButton("Post!"); // creating new button object for Postinf new queries
        post.setBounds(20, 730, 80, 35); // set boundary for post boutton
        c.add(post);//adding post button to container
        post.addActionListener(new ActionListener() { // writing new post to a file
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fw = new FileWriter(file, true); // declaring and creating filewriter object
                    PrintWriter pw = new PrintWriter(fw);// // declaring and creating printwriter object
                    if (new_upload.getText().isEmpty() == false) { // checking whether text area is empty or not
                        Date d1 = new Date(); // creating date object for appending at the end of the query post
                        if (s1 == null) { // checking whether teacher signed in or student
                            pw.println("(Teacher) " + t1.getName() + " said, \"" + new_upload.getText() + "\"" + "_____on " + d1);
                        } else if (t1 == null) { // checking whether teacher signed in or student
                            pw.println("(Student) " + s1.getName() + " said, \"" + new_upload.getText() + "\"" + "_____on " + d1);
                        }

                        pw.close(); // closing stream
                        new_upload.setText(null);// cleaning text area
                    } else {
                        JOptionPane.showMessageDialog(null, "Post box is empty", "Error", JOptionPane.WARNING_MESSAGE);//showing warning dialog for empty text area
                    }

                } catch (IOException ex) {
                    System.out.println("IOException");
                }

            }

        });

        clear = new JButton("Clear"); // creating a button object for clearing text field
        clear.setBounds(105, 730, 80, 35); // setting button boundary
        c.add(clear);//adding button to container
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new_upload.setText(null); // cleans new_upload text area
            }

        });

        update = new JButton("Update!");// creating a button object for updating text field
        update.setBounds(800, 55, 120, 35);// setting button boundary
        update.setForeground(Color.DARK_GRAY);//foreground color
        update.setBackground(Color.LIGHT_GRAY);//background color
        update.setFont(new Font("Comic Sans MS", Font.BOLD, 18)); // setting font
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initializeUploaded(); // it initializes uploaded text area according to current file info.
            }

        });
        c.add(update);

        this.setVisible(true);
    }

    /**
     * This method initializes or loads texts, from file, for 'uploaded'
     * (JTextArea) where all the conversations are sent and queries are
     * discussed
     *
     */
    public void initializeUploaded() {
        try {
            String all = "";
            Scanner sc = new Scanner(file); // scanner object declaration and creation for scanning file
            while (sc.hasNext()) { // iteration utill EOF 
                all += sc.nextLine();
                all += "\n\n";
            }
            
            uploaded.setText(all);

        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }
}
